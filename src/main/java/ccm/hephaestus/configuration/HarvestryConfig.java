package ccm.hephaestus.configuration;

import ccm.nucleum_omnium.configuration.AdvConfiguration;
import ccm.nucleum_omnium.utils.handler.config.IConfig;

public class HarvestryConfig implements IConfig {

    private AdvConfiguration config;

    @Override
    public IConfig setConfiguration(final AdvConfiguration config) {
        this.config = config;
        return this;
    }

    @Override
    public AdvConfiguration getConfiguration() {
        return this.config;
    }

    @Override
    public void init() {

        ConfigItems.configItems(this.config);
        ConfigUsable.configUsable(this.config);
        ConfigWorldGen.configWorldGen(this.config);
        ConfigBlocks.configBlocks(this.config);
    }
}