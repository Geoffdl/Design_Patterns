package fr.diginamic.geoff.patterns.creational.builder.avion;

public class Equipage
{
    private String nom;
    private String prenom;
    
    public Equipage(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    /**
     * Gets nom for the class Equipage
     * @return value of nom
     */
    public String getNom()
    {
        return nom;
    }
    
    /**
     * Sets nom for the class Equipage.
     * @param nom value of nom
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    /**
     * Gets prenom for the class Equipage
     * @return value of prenom
     */
    public String getPrenom()
    {
        return prenom;
    }
    
    /**
     * Sets prenom for the class Equipage.
     * @param prenom value of prenom
     */
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }
}
