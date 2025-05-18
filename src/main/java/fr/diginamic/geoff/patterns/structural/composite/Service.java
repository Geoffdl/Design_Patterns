package fr.diginamic.geoff.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * -- Composite pattern -- composite element
 */
public class Service implements IElement
{
    private String nom;
    private List<IElement> iElementList = new ArrayList<>();
    
    public Service(String nom)
    {
        this.nom = nom;
    }
    
    @Override
    public double calculerSalaire()
    {
        return iElementList.stream().mapToDouble(IElement::calculerSalaire).sum();
    }
    
    /**
     * add to the list
     * @param e element
     */
    public void addElement(IElement e)
    {
        iElementList.add(e);
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
     * @return iElementList
     */
    public List<IElement> getiElementList()
    {
        return iElementList;
    }
    
    /**
     * Setter
     * @param iElementList sets value
     */
    public void setiElementList(List<IElement> iElementList)
    {
        this.iElementList = iElementList;
    }
}
