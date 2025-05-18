package fr.diginamic.geoff.patterns.creational.factoy.factory;

import fr.diginamic.geoff.patterns.creational.factoy.elements.*;

/**
 * Implementation of the elementFactory interface
 */
public class ElementFactory implements IElementFactory
{
    @Override
    public Element getInstance(TypeElement type, String nom, double valeur, Unite unite)
    {
        if (type == null)
        {
            return null;
        }
        return switch (type)
        {
            case INGREDIENT -> new Ingredient(nom, valeur, unite);
            case ADDITIF -> new Additif(nom, valeur, unite);
            case ALLERGENE -> new Allergene(nom, valeur, unite);
        };
    }
}
