package ccm.hephaestus.configuration;

import ccm.nucleum.omnium.utils.handler.configuration.IConfig;

public class HephaestusConfig extends IConfig
{
    @Override
    public void init()
    {

        ConfigItems.configItems(config);
        ConfigUsable.configUsable(config);
        ConfigWorldGen.configWorldGen(config);
        ConfigBlocks.configBlocks(config);
    }
}