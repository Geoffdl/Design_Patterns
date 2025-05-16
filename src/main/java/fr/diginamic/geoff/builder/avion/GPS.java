package fr.diginamic.geoff.builder.avion;

public class GPS
{
    private String reference;
    
    public GPS(String reference)
    {
        this.reference = reference;
    }
    
    /**
     * Gets reference for the class GPS
     *
     * @return value of reference
     */
    public String getReference()
    {
        return reference;
    }
    
    /**
     * Sets reference for the class GPS.
     *
     * @param reference value of reference
     */
    public void setReference(String reference)
    {
        this.reference = reference;
    }
}