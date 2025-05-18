package fr.diginamic.geoff.patterns.creational.builder.avion;

public class Reservoir
{
    private String reference;
    private double capacite;
    
    public Reservoir(String reference, double capacite)
    {
        this.reference = reference;
        this.capacite = capacite;
    }
    
    /**
     * Gets reference for the class Reservoir
     * @return value of reference
     */
    public String getReference()
    {
        return reference;
    }
    
    /**
     * Sets reference for the class Reservoir.
     * @param reference value of reference
     */
    public void setReference(String reference)
    {
        this.reference = reference;
    }
    
    /**
     * Gets capacite for the class Reservoir
     * @return value of capacite
     */
    public double getCapacite()
    {
        return capacite;
    }
    
    /**
     * Sets capacite for the class Reservoir.
     * @param capacite value of capacite
     */
    public void setCapacite(double capacite)
    {
        this.capacite = capacite;
    }
}
