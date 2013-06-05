package ccm.hephaestus.utils.language;

import cpw.mods.fml.common.registry.LanguageRegistry;

import ccm.nucleum_omnium.helper.LanguageHelper;
import ccm.nucleum_omnium.utils.language.ILanguagePack;

import ccm.hephaestus.utils.lib.Locations;

public class HephaestusLanguagePack extends ILanguagePack
{

    /**
     * Adds all the supported Languages
     */
    public HephaestusLanguagePack()
    {
        super(Locations.LANGUAGE_FILE);
        supportedLanguages.add(getPath("en_US"));
        supportedLanguages.add(getPath("es_ES"));
    }

    @Override
    public void loadLangs()
    {
        for (final String langFile : supportedLanguages){
            LanguageRegistry.instance().loadLocalization(langFile, LanguageHelper.getLangFromFileName(langFile), LanguageHelper.isXMLLanguageFile(langFile));
        }
    }
}