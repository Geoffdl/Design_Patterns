package fr.diginamic.geoff.factoy.factory;

import fr.diginamic.geoff.factoy.elements.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class ElementFactoryTest
{
    ElementFactory factory = new ElementFactory();
    
    @Test
    public void createAdditif()
    {
        Element additif = factory.getInstance(TypeElement.ADDITIF, "E320", 200, Unite.MICRO_GRAMMES);
        assertInstanceOf(Additif.class, additif);
        assertEquals("E320", additif.getNom());
        assertEquals(200, additif.getValeur());
        assertEquals(Unite.MICRO_GRAMMES, additif.getUnite());
    }
    
    @Test
    public void createIngredient()
    {
        Element ingredient = factory.getInstance(TypeElement.INGREDIENT, "raisin", 5000, Unite.MILLI_GRAMMES);
        assertInstanceOf(Ingredient.class, ingredient);
    }
    
    @Test
    public void createAllergene()
    {
        Element allergene = factory.getInstance(TypeElement.ALLERGENE, "crustace", 150, Unite.MICRO_GRAMMES);
        assertInstanceOf(Allergene.class, allergene);
    }
    
}