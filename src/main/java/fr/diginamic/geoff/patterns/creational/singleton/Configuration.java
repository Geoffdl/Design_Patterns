package fr.diginamic.geoff.patterns.creational.singleton;

import java.util.ResourceBundle;

/**
 * Bill Pugh Singleton pattern -- on demande initialization of the config reader
 */
public class Configuration
{
    /**
     * config file reader
     */
    private final ResourceBundle resourceBundle;
    
    /**
     * private constructor with initialization of the config data holder
     */
    private Configuration()
    {
        this.resourceBundle = ResourceBundle.getBundle("configuration");
    }
    
    /**
     * @return the unique instance of ConfigurationHolder
     */
    public static Configuration getInstance()
    {
        return ConfigurationHolder.instance;
    }
    
    /**
     * @param key configuration.properties key
     * @return configuration matching value
     */
    public String getValue(String key)
    {
        return resourceBundle.getString(key);
    }
    
    /**
     * Configuration data holder, only accessible through getInstance()
     */
    private static class ConfigurationHolder
    {
        private final static Configuration instance = new Configuration();
    }
}
