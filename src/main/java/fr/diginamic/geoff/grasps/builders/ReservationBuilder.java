package fr.diginamic.geoff.grasps.builders;

import fr.diginamic.geoff.grasps.beans.Client;
import fr.diginamic.geoff.grasps.beans.Reservation;
import fr.diginamic.geoff.grasps.beans.TypeReservation;
import fr.diginamic.geoff.grasps.utils.DateUtils;

/**
 * Builder pattern for reservation
 * Uses base entities and front data to build a new reservations
 */
public class ReservationBuilder implements IReservationBuilder<Reservation, ReservationBuilder>
{
    private Reservation reservation;
    private TypeReservation typeReservation;
    private Client client;
    
    /**
     * Creates a reservation from front data and base entities
     * @param typeReservation existing type of reservation
     * @param client          existing client
     */
    public ReservationBuilder(TypeReservation typeReservation, Client client)
    {
        this.typeReservation = typeReservation;
        this.client = client;
        this.reservation = new Reservation();
    }
    
    @Override
    public Reservation build()
    {
        reservation.setClient(client);
        client.getReservations().add(reservation);
        return this.reservation;
    }
    
    @Override
    public ReservationBuilder appendDate(String dateTime)
    {
        reservation.setDate(DateUtils.stringToLocalDateTime(dateTime));
        return this;
    }
    
    @Override
    public ReservationBuilder appendNbPlaces(int nbPlaces)
    {
        reservation.setNbPlaces(nbPlaces);
        return this;
    }
    
    @Override
    public ReservationBuilder appendMontantTotal()
    {
        double total = typeReservation.getMontant() * reservation.getNbPlaces();
        if (client.isPremium())
        {
            reservation.setTotal(total * (1 - typeReservation.getReductionPourcent() / 100.0));
        }
        else
        {
            reservation.setTotal(total);
        }
        return this;
    }
}
