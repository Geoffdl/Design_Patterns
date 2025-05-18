package fr.diginamic.geoff.patterns.creational.builder.avion;

import java.time.LocalDate;

public class AssistancePilotage
{
    private String reference;
    private LocalDate dateMiseAJour;
    private LocalDate dateInstallation;
    private Altimetre altimetre;
    private AutoPilote autoPilote;
    private GPS gps;
    
    /**
     * @param reference ref
     */
    @NePasUtiliser(description = "constructeur réservé à apBuilder")
    AssistancePilotage(String reference)
    {
        this.reference = reference;
    }
    
    /**
     * Sets altimetre for the class AssistancePilotage.
     * @param altimetre value of altimetre
     */
    public void setAltimetre(Altimetre altimetre)
    {
        this.altimetre = altimetre;
    }
    
    /**
     * Sets autoPilote for the class AssistancePilotage.
     * @param autoPilote value of autoPilote
     */
    public void setAutoPilote(AutoPilote autoPilote)
    {
        this.autoPilote = autoPilote;
    }
    
    /**
     * Gets gps for the class AssistancePilotage
     * @return value of gps
     */
    public GPS getGps()
    {
        return gps;
    }
    
    /**
     * Sets gps for the class AssistancePilotage.
     * @param gps value of gps
     */
    public void setGps(GPS gps)
    {
        this.gps = gps;
    }
    
    /**
     * Gets reference for the class AssistancePilotage
     * @return value of reference
     */
    public String getReference()
    {
        return reference;
    }
    
    /**
     * Sets reference for the class AssistancePilotage.
     * @param reference value of reference
     */
    public void setReference(String reference)
    {
        this.reference = reference;
    }
}
