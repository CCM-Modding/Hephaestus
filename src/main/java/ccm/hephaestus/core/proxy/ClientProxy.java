package ccm.hephaestus.core.proxy;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.enums.EnumModeled;
import ccm.hephaestus.client.inventory.gui.GUIGrinder;
import ccm.hephaestus.inventory.container.GrinderContainer;
import ccm.nucleum_omnium.utils.handler.TextureHandler;
import ccm.nucleum_omnium.utils.handler.gui.GUIHandler;
import ccm.nucleum_omnium.utils.helper.enums.EnumHelper;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerGUIs() {

        registerGUI(EnumModeled.machineGrinder, GUIGrinder.class, GrinderContainer.class);

        this.addGUITexture(EnumModeled.machineGrinder);
    }

    private static void registerGUI(final Enum<?> enu, final Class<? extends GuiContainer> gui, final Class<? extends Container> container) {
        GUIHandler.registerGuiClient(EnumHelper.getTileID(enu), gui, container);
    }

    private void addGUITexture(final Enum<?> enu) {
        TextureHandler.addGUITexture(Hephaestus.instance, enu.name());
    }

    @Override
    public void registerTEs() {
        super.registerTEs();

    }
}