package fr.diginamic.geoff.patterns.behavioral.state;

/**
 * Content of commande's container
 */
public class Produit
{
    private String nom;
    private String grade;
    private double prix;
    
    public Produit()
    {
    }
    
    public Produit(String nom, String grade, double prix)
    {
        this.nom = nom;
        this.grade = grade;
        this.prix = prix;
    }
    
    /**
     * Getter
     * @return nom
     */
    public String getNom()
    {
        return nom;
    }
    
    /**
     * Setter
     * @param nom sets value
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    /**
     * Getter
     * @return grade
     */
    public String getGrade()
    {
        return grade;
    }
    
    /**
     * Setter
     * @param grade sets value
     */
    public void setGrade(String grade)
    {
        this.grade = grade;
    }
    
    /**
     * Getter
     * @return prix
     */
    public double getPrix()
    {
        return prix;
    }
    
    /**
     * Setter
     * @param prix sets value
     */
    public void setPrix(double prix)
    {
        this.prix = prix;
    }
}
