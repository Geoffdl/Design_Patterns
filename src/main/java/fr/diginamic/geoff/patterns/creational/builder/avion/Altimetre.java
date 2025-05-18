package fr.diginamic.geoff.patterns.creational.builder.avion;

public class Altimetre
{
    private String reference;
    
    public Altimetre(String reference)
    {
        this.reference = reference;
    }
    
    /**
     * Gets reference for the class Altimetre
     * @return value of reference
     */
    public String getReference()
    {
        return reference;
    }
    
    /**
     * Sets reference for the class Altimetre.
     * @param reference value of reference
     */
    public void setReference(String reference)
    {
        this.reference = reference;
    }
}
