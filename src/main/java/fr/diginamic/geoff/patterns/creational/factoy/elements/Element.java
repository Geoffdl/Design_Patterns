package fr.diginamic.geoff.patterns.creational.factoy.elements;

/**
 * parent class that food are made of
 */
public abstract class Element
{
    private final String nom;
    private final double valeur;
    private final Unite unite;
    
    /**
     * Constructor
     * @param nom    de l'élément
     * @param valeur poids de l'élément
     * @param unite  unite de poids
     */
    public Element(String nom, double valeur, Unite unite)
    {
        this.nom = nom;
        this.valeur = valeur;
        this.unite = unite;
    }
    
    /**
     * Gets nom for the class Element
     * @return value of nom
     */
    public String getNom()
    {
        return nom;
    }
    
    /**
     * Gets valeur for the class Element
     * @return value of valeur
     */
    public double getValeur()
    {
        return valeur;
    }
    
    /**
     * Gets unite for the class Element
     * @return value of unite
     */
    public Unite getUnite()
    {
        return unite;
    }
}
