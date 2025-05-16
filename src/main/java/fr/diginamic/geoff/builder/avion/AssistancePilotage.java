package fr.diginamic.geoff.builder.avion;

import java.time.LocalDate;

public class AssistancePilotage
{
    private String reference;
    private LocalDate dateMiseAjour;
    private LocalDate dateInstallation;
    
    private Altimetre altimetre;
    private AutoPilote autoPilote;
    private GPS gps;
    
    /**
     * @param reference ref
     */
    @NePasUtiliser(description = "constructeur réservé à l'apBuilder")
    AssistancePilotage(String reference)
    {
        this.reference = reference;
    }
    
    /**
     * Gets altimetre for the class AssistancePilotage
     *
     * @return value of altimetre
     */
    public Altimetre getAltimetre()
    {
        return altimetre;
    }
    
    /**
     * Sets altimetre for the class AssistancePilotage.
     *
     * @param altimetre value of altimetre
     */
    public void setAltimetre(Altimetre altimetre)
    {
        this.altimetre = altimetre;
    }
    
    /**
     * Gets autoPilote for the class AssistancePilotage
     *
     * @return value of autoPilote
     */
    public AutoPilote getAutoPilote()
    {
        return autoPilote;
    }
    
    /**
     * Sets autoPilote for the class AssistancePilotage.
     *
     * @param autoPilote value of autoPilote
     */
    public void setAutoPilote(AutoPilote autoPilote)
    {
        this.autoPilote = autoPilote;
    }
    
    /**
     * Gets gps for the class AssistancePilotage
     *
     * @return value of gps
     */
    public GPS getGps()
    {
        return gps;
    }
    
    /**
     * Sets gps for the class AssistancePilotage.
     *
     * @param gps value of gps
     */
    public void setGps(GPS gps)
    {
        this.gps = gps;
    }
    
    /**
     * Gets dateMiseAjour for the class AssistancePilotage
     *
     * @return value of dateMiseAjour
     */
    public LocalDate getDateMiseAjour()
    {
        return dateMiseAjour;
    }
    
    /**
     * Sets dateMiseAjour for the class AssistancePilotage.
     *
     * @param dateMiseAjour value of dateMiseAjour
     */
    public void setDateMiseAjour(LocalDate dateMiseAjour)
    {
        this.dateMiseAjour = dateMiseAjour;
    }
    
    /**
     * Gets dateInstallation for the class AssistancePilotage
     *
     * @return value of dateInstallation
     */
    public LocalDate getDateInstallation()
    {
        return dateInstallation;
    }
    
    /**
     * Sets dateInstallation for the class AssistancePilotage.
     *
     * @param dateInstallation value of dateInstallation
     */
    public void setDateInstallation(LocalDate dateInstallation)
    {
        this.dateInstallation = dateInstallation;
    }
    
    /**
     * Gets reference for the class AssistancePilotage
     *
     * @return value of reference
     */
    public String getReference()
    {
        return reference;
    }
    
    /**
     * Sets reference for the class AssistancePilotage.
     *
     * @param reference value of reference
     */
    public void setReference(String reference)
    {
        this.reference = reference;
    }
}