package fr.diginamic.geoff.builder.avion;

public class Modele
{
    private String constructeur;
    private ModeleAvion modeleAvion;
    
    public Modele(String constructeur, ModeleAvion avion)
    {
        this.constructeur = constructeur;
        this.modeleAvion = avion;
    }
    
    /**
     * Gets constructeur for the class Modele
     *
     * @return value of constructeur
     */
    public String getConstructeur()
    {
        return constructeur;
    }
    
    /**
     * Sets constructeur for the class Modele.
     *
     * @param constructeur value of constructeur
     */
    public void setConstructeur(String constructeur)
    {
        this.constructeur = constructeur;
    }
    
    /**
     * Gets avion for the class Modele
     *
     * @return value of avion
     */
    public ModeleAvion getModeleAvion()
    {
        return modeleAvion;
    }
    
    /**
     * Sets avion for the class Modele.
     *
     * @param modeleAvion value of avion
     */
    public void setModeleAvion(ModeleAvion modeleAvion)
    {
        this.modeleAvion = modeleAvion;
    }
}