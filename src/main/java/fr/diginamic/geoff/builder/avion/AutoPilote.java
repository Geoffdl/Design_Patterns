package fr.diginamic.geoff.builder.avion;

public class AutoPilote
{
    private String reference;
    
    public AutoPilote(String reference)
    {
        this.reference = reference;
    }
    
    /**
     * Gets reference for the class AutoPilote
     *
     * @return value of reference
     */
    public String getReference()
    {
        return reference;
    }
    
    /**
     * Sets reference for the class AutoPilote.
     *
     * @param reference value of reference
     */
    public void setReference(String reference)
    {
        this.reference = reference;
    }
}