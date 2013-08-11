package ccm.hephaestus.core.proxy;

import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.enums.EnumModeled;
import ccm.hephaestus.inventory.container.GrinderContainer;
import ccm.hephaestus.tileentity.logic.GrinderLogic;
import ccm.nucleum_omnium.tileentity.ActiveTE;
import ccm.nucleum_omnium.utils.handler.LogHandler;
import ccm.nucleum_omnium.utils.handler.TileHandler;
import ccm.nucleum_omnium.utils.handler.gui.GuiHandler;
import ccm.nucleum_omnium.utils.helper.enums.EnumHelper;

public class CommonProxy {

    /**
     * Registers all the GUIs
     */
    public void registerGUIs() {
        LogHandler.finest(Hephaestus.instance, "Registering GUIs");

        registerGUI(EnumModeled.machineGrinder, GrinderContainer.class);
    }

    private static void registerGUI(final Enum<?> enu, final Class<? extends Container> container) {
        GuiHandler.registerGuiServer(EnumHelper.getTileID(enu), container);
    }

    /**
     * Registers all the {@link TileEntity}s
     */
    public void registerTEs() {
        LogHandler.finest(Hephaestus.instance, "Registering Tile Entities");

        registerTE(EnumModeled.machineGrinder, new ActiveTE().setLogic(GrinderLogic.class).setInventorySize(4));
    }

    private static void registerTE(final Enum<?> enu, final TileEntity te) {
        TileHandler.registerTileEntity(EnumHelper.getTileID(enu), te);
    }
}