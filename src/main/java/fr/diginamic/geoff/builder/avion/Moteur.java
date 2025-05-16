package fr.diginamic.geoff.builder.avion;

import java.time.Year;

public class Moteur
{
    private String reference;
    private double mileage;
    private Year anneeConstruction;
    
    private TypeMoteur typeMoteur;
    
    public Moteur(String reference, double mileage, TypeMoteur typeMoteur)
    {
        this.reference = reference;
        this.mileage = mileage;
        this.anneeConstruction = Year.now();
        this.typeMoteur = typeMoteur;
    }
    
    /**
     * Gets reference for the class Moteur
     *
     * @return value of reference
     */
    public String getReference()
    {
        return reference;
    }
    
    /**
     * Sets reference for the class Moteur.
     *
     * @param reference value of reference
     */
    public void setReference(String reference)
    {
        this.reference = reference;
    }
    
    /**
     * Gets mileage for the class Moteur
     *
     * @return value of mileage
     */
    public double getMileage()
    {
        return mileage;
    }
    
    /**
     * Sets mileage for the class Moteur.
     *
     * @param mileage value of mileage
     */
    public void setMileage(double mileage)
    {
        this.mileage = mileage;
    }
    
    /**
     * Gets anneeConstruction for the class Moteur
     *
     * @return value of anneeConstruction
     */
    public Year getAnneeConstruction()
    {
        return anneeConstruction;
    }
    
    /**
     * Sets anneeConstruction for the class Moteur.
     *
     * @param anneeConstruction value of anneeConstruction
     */
    public void setAnneeConstruction(Year anneeConstruction)
    {
        this.anneeConstruction = anneeConstruction;
    }
    
    /**
     * Gets typeMoteur for the class Moteur
     *
     * @return value of typeMoteur
     */
    public TypeMoteur getTypeMoteur()
    {
        return typeMoteur;
    }
    
    /**
     * Sets typeMoteur for the class Moteur.
     *
     * @param typeMoteur value of typeMoteur
     */
    public void setTypeMoteur(TypeMoteur typeMoteur)
    {
        this.typeMoteur = typeMoteur;
    }
}