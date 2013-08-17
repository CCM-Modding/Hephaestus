package ccm.hephaestus;

import static ccm.hephaestus.utils.lib.Archive.MOD_ID;
import static ccm.hephaestus.utils.lib.Archive.MOD_NAME;
import static ccm.hephaestus.utils.lib.Archive.MOD_PREFIX;
import static ccm.hephaestus.utils.lib.Locations.CLIENT_PROXY;
import static ccm.hephaestus.utils.lib.Locations.SERVER_PROXY;
import lib.org.modstats.ModstatInfo;
import ccm.hephaestus.configuration.HephaestusConfig;
import ccm.hephaestus.core.proxy.CommonProxy;
import ccm.hephaestus.creativetab.HephaestusTabs;
import ccm.hephaestus.item.ModItems;
import ccm.hephaestus.utils.registry.Registry;
import ccm.nucleum.omnium.BaseMod;
import ccm.nucleum.omnium.IMod;
import ccm.nucleum.omnium.utils.handler.LogHandler;
import ccm.nucleum.omnium.utils.handler.ModLoadingHandler;
import ccm.nucleum.omnium.utils.handler.config.ConfigurationHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = MOD_ID, name = MOD_NAME, useMetadata = true)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@ModstatInfo(prefix = MOD_PREFIX)
public class Hephaestus extends BaseMod implements IMod {

    @Instance(MOD_ID)
    public static Hephaestus instance;

    @SidedProxy(serverSide = SERVER_PROXY, clientSide = CLIENT_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(final FMLPreInitializationEvent evt) {
        if (!ModLoadingHandler.isModLoaded(this)) {

            LogHandler.initLog(this);

            initializeConfig(evt);
            ConfigurationHandler.init(this, HephaestusConfig.class);

            HephaestusTabs.initTabs();

            ModItems.init();

            proxy.registerTEs();

            Registry.register();

            HephaestusTabs.initTabIcons();
        }
    }

    @EventHandler
    public void init(final FMLInitializationEvent event) {

        proxy.registerGUIs();
    }

    @EventHandler
    public void PostInit(final FMLPostInitializationEvent event) {
        ModLoadingHandler.loadMod(this);
    }
}