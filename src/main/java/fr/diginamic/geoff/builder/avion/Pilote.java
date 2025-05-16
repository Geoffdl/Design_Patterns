package fr.diginamic.geoff.builder.avion;

public class Pilote
{
    private String nom;
    private String prenom;
    
    public Pilote(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    /**
     * Gets nom for the class Pilote
     *
     * @return value of nom
     */
    public String getNom()
    {
        return nom;
    }
    
    /**
     * Sets nom for the class Pilote.
     *
     * @param nom value of nom
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    /**
     * Gets prenom for the class Pilote
     *
     * @return value of prenom
     */
    public String getPrenom()
    {
        return prenom;
    }
    
    /**
     * Sets prenom for the class Pilote.
     *
     * @param prenom value of prenom
     */
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }
}