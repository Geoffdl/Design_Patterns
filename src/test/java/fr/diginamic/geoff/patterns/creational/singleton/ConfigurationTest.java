package fr.diginamic.geoff.patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConfigurationTest
{
    Configuration configuration = Configuration.getInstance();
    
    @Test
    public void testConfigurationOutput()
    {
        assertEquals("jdbc:mysql://localhost:3306/bdd", configuration.getValue("db.url"));
        assertEquals("root", configuration.getValue("db.user"));
        assertEquals("1234", configuration.getValue("db.password"));
    }
    
    @Test
    public void testSingularity()
    {
        Configuration configuration2 = Configuration.getInstance();
        assertEquals(configuration, configuration2);
    }
}
