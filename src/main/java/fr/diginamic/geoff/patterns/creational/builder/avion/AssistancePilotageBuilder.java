package fr.diginamic.geoff.patterns.creational.builder.avion;

/**
 * takes parameters to build AP
 */
public class AssistancePilotageBuilder
      implements IAssistancePilotageBuilder<AssistancePilotage, AssistancePilotageBuilder>
{
    private final AssistancePilotage assistancePilotage;
    
    public AssistancePilotageBuilder(String reference)
    {
        this.assistancePilotage = new AssistancePilotage(reference);
    }
    
    @Override
    public AssistancePilotage build()
    {
        return this.assistancePilotage;
    }
    
    @Override
    public AssistancePilotageBuilder appendGps(String reference)
    {
        this.assistancePilotage.setGps(new GPS(reference));
        return this;
    }
    
    @Override
    public AssistancePilotageBuilder appendAutoPilote(String reference)
    {
        this.assistancePilotage.setAutoPilote(new AutoPilote(reference));
        return this;
    }
    
    @Override
    public AssistancePilotageBuilder appendAltimetre(String reference)
    {
        this.assistancePilotage.setAltimetre(new Altimetre(reference));
        return this;
    }
}
