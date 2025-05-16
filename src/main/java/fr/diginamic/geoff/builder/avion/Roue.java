package fr.diginamic.geoff.builder.avion;

public class Roue
{
    private String reference;
    private int tailleEnPouces;
    
    public Roue(String reference, int tailleEnPouces)
    {
        this.reference = reference;
        this.tailleEnPouces = tailleEnPouces;
    }
    
    /**
     * Gets reference for the class Roue
     *
     * @return value of reference
     */
    public String getReference()
    {
        return reference;
    }
    
    /**
     * Sets reference for the class Roue.
     *
     * @param reference value of reference
     */
    public void setReference(String reference)
    {
        this.reference = reference;
    }
    
    /**
     * Gets tailleEnPouces for the class Roue
     *
     * @return value of tailleEnPouces
     */
    public int getTailleEnPouces()
    {
        return tailleEnPouces;
    }
    
    /**
     * Sets tailleEnPouces for the class Roue.
     *
     * @param tailleEnPouces value of tailleEnPouces
     */
    public void setTailleEnPouces(int tailleEnPouces)
    {
        this.tailleEnPouces = tailleEnPouces;
    }
}