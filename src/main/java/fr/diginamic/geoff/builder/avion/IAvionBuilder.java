package fr.diginamic.geoff.builder.avion;

public interface IAvionBuilder<T, D>
{
    T build();
    
    D appendPassager(Passager passager);
    
    D appendPilote(Pilote pilote);
    
    D appendEquipage(Equipage equipage);
    
    D appendModele(String constructeur, ModeleAvion modeleAvion);
    
    D appendSiege(int numeroSiege, Classe classeSiege, Rangee rangee);
    
    D appendPostePilotage(String reference, double surface, int places, String refAp, String refGps, String refAltimetre, String refAutoPilote);
    
    D appendMoteur(String reference, TypeMoteur typeMoteur);
    
}