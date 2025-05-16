package fr.diginamic.geoff.builder.avion;

import java.util.List;

public class AvionBuilder implements IAvionBuilder<Avion, AvionBuilder>
{
    private Avion avion;
    private String idUnique;
    private int capacite;
    private List<Roue> roues;
    
    public AvionBuilder(String idUnique, int capacite, List<Roue> roues)
    {
        this.avion = new Avion(idUnique, capacite, roues);
        this.idUnique = idUnique;
        this.capacite = capacite;
        this.roues = roues;
    }
    
    @Override
    public Avion build()
    {
        return avion;
    }
    
    @Override
    public AvionBuilder appendPassager(Passager passager)
    {
        this.avion.getPassagers().add(passager);
        return this;
    }
    
    @Override
    public AvionBuilder appendPilote(Pilote pilote)
    {
        this.avion.getPilotes().add(pilote);
        return this;
    }
    
    @Override
    public AvionBuilder appendEquipage(Equipage membreEquipage)
    {
        this.avion.getEquipages().add(membreEquipage);
        return this;
    }
    
    @Override
    public AvionBuilder appendModele(String constructeur, ModeleAvion modeleAvion)
    {
        this.avion.setModeleAvion(new Modele(constructeur, modeleAvion));
        return this;
    }
    
    @Override
    public AvionBuilder appendSiege(int numeroSiege, Classe classeSiege, Rangee rangee)
    {
        Siege siege = new Siege(rangee, classeSiege, numeroSiege);
        if (!this.avion.getSieges().contains(siege) && siege.getNumero() <= avion.getCapacite())
        {
            this.avion.getSieges().add(new Siege(rangee, classeSiege, numeroSiege));
        }
        return this;
    }
    
    @Override
    public AvionBuilder appendPostePilotage(String reference, double surface, int places, String refAp, String refGps, String refAltimetre, String refAutoPilote)
    {
        
        AssistancePilotageBuilder apb = new AssistancePilotageBuilder(refAp);
        AssistancePilotage assistancePilotage = apb.appendAltimetre(refAltimetre).appendGps(refGps).appendAutoPilote(refAutoPilote).build();
        
        this.avion.setPostePilotage(new PostePilotage(reference, surface, places, assistancePilotage));
        return this;
    }
    
    @Override
    public AvionBuilder appendMoteur(String reference, TypeMoteur typeMoteur)
    {
        this.avion.setMoteur(new Moteur(reference, 0, typeMoteur));
        return this;
    }
    
}