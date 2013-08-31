package ccm.hephaestus.tconstruct;

import tconstruct.library.TConstructRegistry;

public class Materials  {

    static void registerMaterials ()
    {
        TConstructRegistry.addToolMaterial(20, "Silver", 1, 200, 700, 2, 0.6F, 1, -1f, "\u00A7f", "");
        TConstructRegistry.addToolMaterial(21, "Titanium", 3, 900, 600, 3, 1.5F, 2, 0f, "\u00A7f", "");
        TConstructRegistry.addToolMaterial(22, "DObsidian", 4, 300, 950, 4, 0.9F, 4, 0f, "\u00A7f", "");
        TConstructRegistry.addToolMaterial(23, "Gravitas", 3, 800, 700, 4, 1.0F, 2, 1f, "\u00A7f", "Stonebound");
        TConstructRegistry.addToolMaterial(24, "Childarium", 1, 1500, 500, 1, 2.0F, 4, 0f, "\u00A7f", "");
        TConstructRegistry.addToolMaterial(25, "Soldarium", 2, 250, 800, 2, 0.7F, 1, -1f, "\u00A7f", "");
        TConstructRegistry.addToolMaterial(26, "Electrum", 2, 250, 900, 2, 0.7F, 1, 0f, "\u00A7f", "");
        TConstructRegistry.addToolMaterial(27, "Titanite", 4, 1200, 750, 4, 1.8F, 3, 0f, "\u00A7f", "");
        
        TConstructRegistry.addBowMaterial(20, 300, 30, 1.2f); //Silver
        TConstructRegistry.addBowMaterial(21, 900, 70, 0.8f); //Titanium
        TConstructRegistry.addBowMaterial(22, 20, 80, 0.2f); //DObsidian
        TConstructRegistry.addBowMaterial(23, 10, 80, 0.2f); //Gravitas
        TConstructRegistry.addBowMaterial(24, 30, 80, 0.3f); //Childarium
        TConstructRegistry.addBowMaterial(25, 400, 30, 1.1f); //Soldarium
        TConstructRegistry.addBowMaterial(26, 500, 30, 1.0f); //Electrum
        TConstructRegistry.addBowMaterial(27, 1000, 60, 0.9f); //Titanite
        
        TConstructRegistry.addArrowMaterial(20, 4.5F, 1.8F, 100F); //Silver
        TConstructRegistry.addArrowMaterial(21, 7.1F, 0.0F, 100F); //Titanium
        TConstructRegistry.addArrowMaterial(22, 2.2F, 3.4f, 100F); //DObsidian
        TConstructRegistry.addArrowMaterial(23, 12.8F, 0.5F, 100F); //Gravitas
        TConstructRegistry.addArrowMaterial(24, 0.6F, 0.0F, 100F); //Childarium
        TConstructRegistry.addArrowMaterial(25, 4.7F, 1.7F, 100F); //Soldarium
        TConstructRegistry.addArrowMaterial(26, 5.8F, 1.6f, 100F); //Electrum
        TConstructRegistry.addArrowMaterial(27, 6.8F, 0.1F, 100F); //Titanite
    }
}