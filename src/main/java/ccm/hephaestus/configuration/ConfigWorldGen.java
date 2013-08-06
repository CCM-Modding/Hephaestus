package ccm.hephaestus.configuration;

import net.minecraftforge.common.Configuration;
import ccm.hephaestus.utils.lib.Properties;

final class ConfigWorldGen extends HephaestusConfig {

    final static String gen = "World Generation";

    /**
     * Loads or creates the World Generation Section in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configWorldGen(final Configuration config) {
        Properties.enableWorldGenAluminum = config.get(ConfigWorldGen.gen, "EnableAluminum", true).getBoolean(true);
        Properties.enableWorldGenCopper = config.get(ConfigWorldGen.gen, "EnableCopper", true).getBoolean(true);
        Properties.enableWorldGenLead = config.get(ConfigWorldGen.gen, "EnableLead", true).getBoolean(true);
        Properties.enableWorldGenSilver = config.get(ConfigWorldGen.gen, "EnableSilver", true).getBoolean(true);
        Properties.enableWorldGenSulfur = config.get(ConfigWorldGen.gen, "EnableSulfur", true).getBoolean(true);
        Properties.enableWorldGenTin = config.get(ConfigWorldGen.gen, "EnableTin", true).getBoolean(true);
        Properties.enableWorldGenTitanium = config.get(ConfigWorldGen.gen, "EnableTitanium", true).getBoolean(true);
        Properties.enableWorldGenTungsten = config.get(ConfigWorldGen.gen, "EnableTungsten", true).getBoolean(true);
        
        Properties.enableWorldGenCitrine = config.get(ConfigWorldGen.gen, "EnableCitrine", true).getBoolean(true);
        Properties.enableWorldGenCZirconia = config.get(ConfigWorldGen.gen, "EnableCZirconia", true).getBoolean(true);
        Properties.enableWorldGenJet = config.get(ConfigWorldGen.gen, "EnableJet", true).getBoolean(true);
        Properties.enableWorldGenOlivine = config.get(ConfigWorldGen.gen, "EnableOlivine", true).getBoolean(true);
        Properties.enableWorldGenOpal = config.get(ConfigWorldGen.gen, "EnableOpal", true).getBoolean(true);
        Properties.enableWorldGenRuby = config.get(ConfigWorldGen.gen, "EnableRuby", true).getBoolean(true);
        Properties.enableWorldGenSapphire = config.get(ConfigWorldGen.gen, "EnableSapphire", true).getBoolean(true);
        Properties.enableWorldGenSun = config.get(ConfigWorldGen.gen, "EnableSun", true).getBoolean(true);
        Properties.enableWorldGenTopaz = config.get(ConfigWorldGen.gen, "EnableTopaz", true).getBoolean(true);
        Properties.enableWorldGenWAlabaster = config.get(ConfigWorldGen.gen, "EnableWAlabaster", true).getBoolean(true);
    }
}