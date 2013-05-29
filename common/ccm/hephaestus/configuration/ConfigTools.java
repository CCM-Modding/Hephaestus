package ccm.hephaestus.configuration;

import net.minecraftforge.common.Configuration;
import ccm.hephaestus.Hephaestus;
import ccm.nucleum_omnium.handler.Handler;

final class ConfigTools extends Config {

    /**
     * Loads or creates the Usable Items in the Configuration file.
     * 
     * @param config
     *            The Configuration file that is being edited.
     */
    protected static void configUsable(final Configuration config) {
        Handler.log(Hephaestus.instance, "Loading Tools Configs");
    }
}