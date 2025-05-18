package fr.diginamic.geoff.patterns.creational.factoy.factory;

import fr.diginamic.geoff.patterns.creational.factoy.elements.Element;
import fr.diginamic.geoff.patterns.creational.factoy.elements.TypeElement;
import fr.diginamic.geoff.patterns.creational.factoy.elements.Unite;

/**
 * Interface for element creation
 */
public interface IElementFactory
{
    /**
     * Create an element based on its type
     * @param type   Type of the element @TypeElement enumeration
     * @param nom    name of the element
     * @param valeur weight of the element
     * @param unite  unit for the weight
     * @return an instance of the specified element
     */
    Element getInstance(TypeElement type, String nom, double valeur, Unite unite);
}
