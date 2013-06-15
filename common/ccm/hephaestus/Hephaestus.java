package ccm.hephaestus;

import java.util.logging.Level;

import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.configuration.Config;
import ccm.hephaestus.core.proxy.CommonProxy;
import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.network.PacketHandler;
import ccm.hephaestus.utils.language.HephaestusLanguagePack;
import ccm.hephaestus.utils.lib.Archive;
import ccm.hephaestus.utils.lib.Locations;
import ccm.hephaestus.utils.registry.Registry;
import ccm.nucleum_omnium.BaseMod;
import ccm.nucleum_omnium.IMod;
import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.handler.Handler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.FingerprintWarning;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Archive.MOD_ID,
     name = Archive.MOD_NAME,
     version = Archive.MOD_VERSION,
     dependencies = Archive.MOD_DEPENDANCIES,
     certificateFingerprint = Archive.MOD_FIGERPRINT)
@NetworkMod(clientSideRequired = true,
            serverSideRequired = false,
            channels = Archive.MOD_CHANNEL,
            packetHandler = PacketHandler.class)
public class Hephaestus extends BaseMod implements IMod {
    
    /**
     * The MoreOres Instance
     */
    @Instance(Archive.MOD_ID)
    public static Hephaestus       instance;
    
    /**
     * The MoreOres proxy
     */
    @SidedProxy(serverSide = Locations.SERVER_PROXY,
                clientSide = Locations.CLIENT_PROXY)
    public static CommonProxy      proxy;
    
    public static AdvConfiguration config;
    
    @FingerprintWarning
    public void invalidFingerprint(final FMLFingerprintViolationEvent event) {
        /*
         * Report (log) to the user that the version of Harvestry they are using
         * has been changed/tampered with
         */
        Handler.log(this, Level.SEVERE, Archive.INVALID_FINGERPRINT_MSG);
    }
    
    @PreInit
    public void preInit(final FMLPreInitializationEvent evt) {
        if (!Handler.isModLoaded(this)) {
            
            Handler.initLog(this);
            
            config = this.initializeConfig(evt);
            
            Config.init(config);
            
            HephaestusTabs.initTabs();
            
            ModItems.init();
            
            ModBlocks.init();
            
            HephaestusTabs.initTabIcons();
        }
    }
    
    @Init
    public void init(final FMLInitializationEvent event) {
        Hephaestus.proxy.registerGUIs();
        
        Registry.register();
        
        new HephaestusLanguagePack().loadLangs();
    }
    
    @PostInit
    public void PostInit(final FMLPostInitializationEvent event) {
        Handler.loadMod(this);
    }
    
    @Override
    public AdvConfiguration getConfigFile() {
        return config;
    }
}