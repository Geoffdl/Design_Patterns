package fr.diginamic.geoff.builder.avion;

public class PostePilotage
{
    private String reference;
    private double surface;
    private int places;
    
    private AssistancePilotage assistancePilotage;
    
    public PostePilotage(String reference, double surface, int places, AssistancePilotage assistancePilotage)
    {
        this.reference = reference;
        this.surface = surface;
        this.places = places;
        this.assistancePilotage = assistancePilotage;
    }
    
    /**
     * Gets assistancePilotage for the class PostePilotage
     *
     * @return value of assistancePilotage
     */
    public AssistancePilotage getAssistancePilotage()
    {
        return assistancePilotage;
    }
    
    /**
     * Sets assistancePilotage for the class PostePilotage.
     *
     * @param assistancePilotage value of assistancePilotage
     */
    public void setAssistancePilotage(AssistancePilotage assistancePilotage)
    {
        this.assistancePilotage = assistancePilotage;
    }
    
    /**
     * Gets reference for the class PostePilotage
     *
     * @return value of reference
     */
    public String getReference()
    {
        return reference;
    }
    
    /**
     * Sets reference for the class PostePilotage.
     *
     * @param reference value of reference
     */
    public void setReference(String reference)
    {
        this.reference = reference;
    }
    
    /**
     * Gets surface for the class PostePilotage
     *
     * @return value of surface
     */
    public double getSurface()
    {
        return surface;
    }
    
    /**
     * Sets surface for the class PostePilotage.
     *
     * @param surface value of surface
     */
    public void setSurface(double surface)
    {
        this.surface = surface;
    }
    
    /**
     * Gets places for the class PostePilotage
     *
     * @return value of places
     */
    public int getPlaces()
    {
        return places;
    }
    
    /**
     * Sets places for the class PostePilotage.
     *
     * @param places value of places
     */
    public void setPlaces(int places)
    {
        this.places = places;
    }
}