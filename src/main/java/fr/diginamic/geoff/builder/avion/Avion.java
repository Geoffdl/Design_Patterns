package fr.diginamic.geoff.builder.avion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Avion
{
    private String idUnique;
    private LocalDate miseEnCirculation;
    private LocalDate dateDerniereMaintenance;
    private int capacite;
    
    private PostePilotage postePilotage;
    private Modele modeleAvion;
    
    private List<Pilote> pilotes = new ArrayList<>();
    private List<Equipage> equipages = new ArrayList<>();
    
    private Moteur moteur;
    private List<Siege> sieges = new ArrayList<>();
    
    private List<Roue> roues = new ArrayList<>();
    
    private List<Passager> passagers = new ArrayList<>();
    
    Avion(String idUnique, int capacite, List<Roue> roues)
    {
        this.roues = roues;
        this.capacite = capacite;
        this.idUnique = idUnique;
    }
    
    /**
     * Gets moteur for the class Avion
     *
     * @return value of moteur
     */
    public Moteur getMoteur()
    {
        return moteur;
    }
    
    /**
     * Sets moteur for the class Avion.
     *
     * @param moteur value of moteur
     */
    public void setMoteur(Moteur moteur)
    {
        this.moteur = moteur;
    }
    
    /**
     * Gets modeleAvion for the class Avion
     *
     * @return value of modeleAvion
     */
    public Modele getModeleAvion()
    {
        return modeleAvion;
    }
    
    /**
     * Sets modeleAvion for the class Avion.
     *
     * @param modeleAvion value of modeleAvion
     */
    public void setModeleAvion(Modele modeleAvion)
    {
        this.modeleAvion = modeleAvion;
    }
    
    /**
     * Gets idUnique for the class Avion
     *
     * @return value of idUnique
     */
    public String getIdUnique()
    {
        return idUnique;
    }
    
    /**
     * Sets idUnique for the class Avion.
     *
     * @param idUnique value of idUnique
     */
    public void setIdUnique(String idUnique)
    {
        this.idUnique = idUnique;
    }
    
    /**
     * Gets miseEnCirculation for the class Avion
     *
     * @return value of miseEnCirculation
     */
    public LocalDate getMiseEnCirculation()
    {
        return miseEnCirculation;
    }
    
    /**
     * Sets miseEnCirculation for the class Avion.
     *
     * @param miseEnCirculation value of miseEnCirculation
     */
    public void setMiseEnCirculation(LocalDate miseEnCirculation)
    {
        this.miseEnCirculation = miseEnCirculation;
    }
    
    /**
     * Gets dateDerniereMaintenance for the class Avion
     *
     * @return value of dateDerniereMaintenance
     */
    public LocalDate getDateDerniereMaintenance()
    {
        return dateDerniereMaintenance;
    }
    
    /**
     * Sets dateDerniereMaintenance for the class Avion.
     *
     * @param dateDerniereMaintenance value of dateDerniereMaintenance
     */
    public void setDateDerniereMaintenance(LocalDate dateDerniereMaintenance)
    {
        this.dateDerniereMaintenance = dateDerniereMaintenance;
    }
    
    /**
     * Gets capacite for the class Avion
     *
     * @return value of capacite
     */
    public int getCapacite()
    {
        return capacite;
    }
    
    /**
     * Sets capacite for the class Avion.
     *
     * @param capacite value of capacite
     */
    public void setCapacite(int capacite)
    {
        this.capacite = capacite;
    }
    
    /**
     * Gets postePilotage for the class Avion
     *
     * @return value of postePilotage
     */
    public PostePilotage getPostePilotage()
    {
        return postePilotage;
    }
    
    /**
     * Sets postePilotage for the class Avion.
     *
     * @param postePilotage value of postePilotage
     */
    public void setPostePilotage(PostePilotage postePilotage)
    {
        this.postePilotage = postePilotage;
    }
    
    /**
     * Gets pilotes for the class Avion
     *
     * @return value of pilotes
     */
    public List<Pilote> getPilotes()
    {
        return pilotes;
    }
    
    /**
     * Sets pilotes for the class Avion.
     *
     * @param pilotes value of pilotes
     */
    public void setPilotes(List<Pilote> pilotes)
    {
        this.pilotes = pilotes;
    }
    
    /**
     * Gets equipages for the class Avion
     *
     * @return value of equipages
     */
    public List<Equipage> getEquipages()
    {
        return equipages;
    }
    
    /**
     * Sets equipages for the class Avion.
     *
     * @param equipages value of equipages
     */
    public void setEquipages(List<Equipage> equipages)
    {
        this.equipages = equipages;
    }
    
    /**
     * Gets sieges for the class Avion
     *
     * @return value of sieges
     */
    public List<Siege> getSieges()
    {
        return sieges;
    }
    
    /**
     * Sets sieges for the class Avion.
     *
     * @param sieges value of sieges
     */
    public void setSieges(List<Siege> sieges)
    {
        this.sieges = sieges;
    }
    
    /**
     * Gets roues for the class Avion
     *
     * @return value of roues
     */
    public List<Roue> getRoues()
    {
        return roues;
    }
    
    /**
     * Sets roues for the class Avion.
     *
     * @param roues value of roues
     */
    public void setRoues(List<Roue> roues)
    {
        this.roues = roues;
    }
    
    /**
     * Gets passagers for the class Avion
     *
     * @return value of passagers
     */
    public List<Passager> getPassagers()
    {
        return passagers;
    }
    
    /**
     * Sets passagers for the class Avion.
     *
     * @param passagers value of passagers
     */
    public void setPassagers(List<Passager> passagers)
    {
        this.passagers = passagers;
    }
    
    public void demarrer()
    {
        System.out.println("vroum");
    }
    
    public void decoller()
    {
        System.out.println("wouaow ça vole");
    }
    
    public void atterir()
    {
        System.out.println("splash");
    }
}