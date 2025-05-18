package fr.diginamic.geoff.patterns.structural.composite;

/**
 * -- Composite pattern -- Leaf element for the Component IElement
 */
public class Employee implements IElement
{
    private String nom;
    private String prenom;
    private double salaire;
    
    public Employee(String nom, String prenom, double salaire)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }
    
    @Override
    public double calculerSalaire()
    {
        return getSalaire();
    }
    
    /**
     * Getter
     * @return salaire
     */
    public double getSalaire()
    {
        return salaire;
    }
    
    /**
     * Setter
     * @param salaire sets value
     */
    public void setSalaire(double salaire)
    {
        this.salaire = salaire;
    }
    
    /**
     * Getter
     * @return nom (String)
     */
    public String getNom()
    {
        return nom;
    }
    
    /**
     * Setter
     * @param nom (String)
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    /**
     * Getter
     * @return prenom (String)
     */
    public String getPrenom()
    {
        return prenom;
    }
    
    /**
     * Setter
     * @param prenom (String)
     */
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }
}
