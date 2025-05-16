package fr.diginamic.geoff.factoy.factory;

import fr.diginamic.geoff.factoy.elements.*;

/**
 * Implementation of the elementFactory interface
 */
public class ElementFactory implements IElementFactory
{
    
    @Override
    public Element getInstance(TypeElement type, String nom, double valeur, Unite unite)
    {
        return switch (type)
        {
            case INGREDIENT -> new Ingredient(nom, valeur, unite);
            case ADDITIF -> new Additif(nom, valeur, unite);
            case ALLERGENE -> new Allergene(nom, valeur, unite);
        };
    }
}