package ccm.hephaestus.utils.registry;

import net.minecraft.item.ItemStack;
import ccm.hephaestus.Hephaestus;
import ccm.hephaestus.block.ModBlocks;
import ccm.hephaestus.enums.EnumOres;
import ccm.hephaestus.utils.lib.Properties;
import ccm.nucleum_omnium.handler.Handler;
import ccm.nucleum_omnium.worldgen.WorldGenHandler;
import ccm.nucleum_omnium.worldgen.WorldGenMineable;

final class WorldRegistry {

    /**
     * Registers all the World Generation.
     */
    protected static void registerWorld() {
        if (Properties.enableWorldGenCopper) {
            registerCopper();
        }
    }

    private static void registerCopper() {
        Handler.log(Hephaestus.instance, "Registering World Generation for Copper");
        WorldGenHandler.addEndGenerator(new WorldGenMineable(new ItemStack(ModBlocks.ores.blockID, 1, EnumOres.oreCopper.ordinal()), Properties.copSize), Properties.copMinHeight, Properties.copMaxHeight, Properties.copDensity, WorldGenHandler.GenType.ORE_1.ordinal());
    }

}