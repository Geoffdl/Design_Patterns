package fr.diginamic.geoff.patterns.creational.builder.avion;

public class Passager
{
    private String nom;
    private String prenom;
    private String numeroIdentite;
    
    public Passager(String nom, String prenom, String numeroIdentite)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroIdentite = numeroIdentite;
    }
    
    /**
     * Gets nom for the class Passager
     * @return value of nom
     */
    public String getNom()
    {
        return nom;
    }
    
    /**
     * Sets nom for the class Passager.
     * @param nom value of nom
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    /**
     * Gets prenom for the class Passager
     * @return value of prenom
     */
    public String getPrenom()
    {
        return prenom;
    }
    
    /**
     * Sets prenom for the class Passager.
     * @param prenom value of prenom
     */
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }
    
    /**
     * Gets numeroIdentite for the class Passager
     * @return value of numeroIdentite
     */
    public String getNumeroIdentite()
    {
        return numeroIdentite;
    }
    
    /**
     * Sets numeroIdentite for the class Passager.
     * @param numeroIdentite value of numeroIdentite
     */
    public void setNumeroIdentite(String numeroIdentite)
    {
        this.numeroIdentite = numeroIdentite;
    }
}
