package fr.diginamic.geoff.patterns.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommandeEtatTest
{
    Commande commande = new Commande();
    Produit produit1 = new Produit("Test", "A", 20);
    Produit produit2 = new Produit("Patate", "D", 30);
    
    @Test
    public void testAjouterProduitInCreation()
    {
        commande.ajouterProduit(produit1);
        assertEquals(1, commande.getProduits().size());
        assertEquals(produit1, commande.getProduits().get(0));
    }
    
    @Test
    public void testPayerInCreation()
    {
        commande.ajouterProduit(produit1);
        commande.ajouterProduit(produit2);
        commande.payer();
        
        assertEquals(50.0, commande.getMontant(), 0.0001);
        assertInstanceOf(CommandePaiement.class, commande.getEtat());
    }
    
    @Test
    public void testAnnulerInCreation()
    {
        
        commande.annuler();
        
        assertInstanceOf(CommandeAnnuler.class, commande.getEtat());
    }
    
    @Test
    public void testAjouterProduitInPaiementThrows()
    {
        
        commande.ajouterProduit(produit1);
        commande.payer();
        
        assertThrows(CommandeStateException.class, () -> commande.ajouterProduit(produit2));
    }
    
    @Test
    public void testAnnulerInPaiement()
    {
        commande.ajouterProduit(produit1);
        commande.payer();
        commande.annuler();
        
        assertInstanceOf(CommandeAnnuler.class, commande.getEtat());
    }
    
    @Test
    public void testLivrerInCreationThrows()
    {
        
        assertThrows(CommandeStateException.class, () -> commande.livrer("12 rue de Diginamic, Peyrols"));
    }
}
