package ccm.hephaestus.utils.lib;

public class Languages {
    
    public static final String[] LANGUAGE_FILES = { Languages.getFile("en_US"), Languages.getFile("es_ES") };
    
    public static String getFile(final String fileName) {
        return Locations.LANGUAGE_FILE + fileName + ".xml";
    }
}