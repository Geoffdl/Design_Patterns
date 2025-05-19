package fr.diginamic.geoff.patterns.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IElementTest
{
    /**
     * DELTA
     */
    private static final double DELTA = 0.0000001;
    IElement employee1 = new Employee("RANMEY", "Jb", 7_500);
    IElement employee2 = new Employee("DOE", "Jane", 3_500);
    IElement employee3 = new Employee("GUINEAU", "Kevin", 7_500);
    IElement employee4 = new Employee("MARTIN", "Paul", 3_500);
    IElement employee5 = new Employee("RASPEY", "Cécile", 10_000);
    IElement employee6 = new Employee("BECHKAR", "Bilel", 8_000);
    Service service1 = new Service("Java Dev");
    Service service2 = new Service("Big Data");
    Service service3 = new Service("DSIN");
    
    @Test
    public void testCompositeCalculerSalaire()
    {
        service1.addElement(employee1);
        service1.addElement(employee2);
        service2.addElement(employee3);
        service2.addElement(employee4);
        service3.addElement(employee5);
        service3.addElement(employee6);
        
        double salaireService1 = service1.calculerSalaire();
        double salaireService2 = service2.calculerSalaire();
        double salaireService3 = service3.calculerSalaire();
        
        assertEquals(11_000, salaireService1, DELTA);
        assertEquals(11_000, salaireService2, DELTA);
        assertEquals(18_000, salaireService3, DELTA);
        
        service1.addElement(service2);
        service1.addElement(service3);
        
        salaireService1 = service1.calculerSalaire();
        assertEquals(40_000, salaireService1, DELTA);
    }
}
