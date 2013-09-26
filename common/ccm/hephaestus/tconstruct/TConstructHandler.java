/**
 * CCM Modding, Hephaestus
 */
package ccm.hephaestus.tconstruct;

import ccm.hephaestus.Hephaestus;
import ccm.nucleum.omnium.IMod;
import ccm.nucleum.omnium.utils.handler.mods.IModHandler;

/**
 * TConstructHandler
 * <p>
 * 
 * @author Captain_Shadows
 */
public class TConstructHandler extends IModHandler
{
    @Override
    public IMod getMod()
    {
        return Hephaestus.instance;
    }

    @Override
    public String getAPIModName()
    {
        return "TConstruct";
    }

    @Override
    public void init()
    {
        Materials.registerMaterials();
    }
}