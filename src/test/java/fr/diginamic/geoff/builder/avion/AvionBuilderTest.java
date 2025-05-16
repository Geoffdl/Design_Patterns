package fr.diginamic.geoff.builder.avion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AvionBuilderTest
{
    @Test
    public void testAvionBuilder()
    {
        Roue roue1 = new Roue("roue1", 22);
        Roue roue2 = new Roue("roue2", 22);
        Roue roue3 = new Roue("roue3", 22);
        Roue roue4 = new Roue("roue4", 22);
        Passager passager1 = new Passager("Bob", "Passenger", "FR39392810");
        Passager passager2 = new Passager("Bob", "Passenger", "FR39392810");
        Passager passager3 = new Passager("Bob", "Passenger", "FR39392810");
        Pilote pilote1 = new Pilote("Jane", "Do");
        Pilote pilote2 = new Pilote("Jane", "Do");
        Equipage equipage1 = new Equipage("Lily", "pad");
        Equipage equipage2 = new Equipage("Marc", "Cram");
        
        AvionBuilder builder = new AvionBuilder("A123", 100, List.of(roue1, roue2, roue3, roue4));
        
        Avion superAvion = builder.appendPassager(passager1).appendPassager(passager2).appendPassager(passager3)
                                  .appendPilote(pilote1).appendPilote(pilote2).appendEquipage(equipage1)
                                  .appendEquipage(equipage2).appendModele("Airbus", ModeleAvion.A380)
                                  .appendMoteur("3833993", TypeMoteur.BW272)
                                  .appendPostePilotage("FX303092", 5, 3, "zx283", "yw2928", "ty3838", "qw2837")
                                  .appendSiege(48, Classe.ECO, Rangee.A).appendSiege(48, Classe.ECO, Rangee.A)
                                  .appendSiege(1, Classe.BUSINESS, Rangee.A).appendSiege(2, Classe.BUSINESS, Rangee.B)
                                  .build();
        
        superAvion.demarrer();
        superAvion.decoller();
        superAvion.atterir();
        
        assertEquals("A123", superAvion.getIdUnique());
        assertEquals(100, superAvion.getCapacite());
        assertEquals(4, superAvion.getRoues().size());
        assertEquals("roue1", superAvion.getRoues().getFirst().getReference());
        assertEquals(22, superAvion.getRoues().getFirst().getTailleEnPouces());
        
        assertEquals(3, superAvion.getPassagers().size());
        assertEquals("Bob", superAvion.getPassagers().getFirst().getNom());
        assertEquals("Passenger", superAvion.getPassagers().getFirst().getPrenom());
        assertEquals("FR39392810", superAvion.getPassagers().getFirst().getNumeroIdentite());
        
        assertEquals(2, superAvion.getPilotes().size());
        assertEquals("Jane", superAvion.getPilotes().getFirst().getNom());
        assertEquals("Do", superAvion.getPilotes().getFirst().getPrenom());
        
        assertNotNull(superAvion.getModeleAvion());
        assertEquals("Airbus", superAvion.getModeleAvion().getConstructeur());
        assertEquals(ModeleAvion.A380, superAvion.getModeleAvion().getModeleAvion());
        
        assertNotNull(superAvion.getMoteur());
        assertEquals("3833993", superAvion.getMoteur().getReference());
        assertEquals(TypeMoteur.BW272, superAvion.getMoteur().getTypeMoteur());
        
        assertNotNull(superAvion.getPostePilotage());
        assertEquals("FX303092", superAvion.getPostePilotage().getReference());
        assertEquals(5, superAvion.getPostePilotage().getSurface());
        assertEquals(3, superAvion.getPostePilotage().getPlaces());
        
        assertEquals(3, superAvion.getSieges().size());
        assertTrue(superAvion.getSieges().stream()
                             .anyMatch(s -> s.getNumero() == 48 && s.getClasse() == Classe.ECO && s.getRangee() == Rangee.A));
        assertTrue(superAvion.getSieges().stream()
                             .anyMatch(s -> s.getNumero() == 1 && s.getClasse() == Classe.BUSINESS && s.getRangee() == Rangee.A));
        assertTrue(superAvion.getSieges().stream()
                             .anyMatch(s -> s.getNumero() == 2 && s.getClasse() == Classe.BUSINESS && s.getRangee() == Rangee.B));
    }
}