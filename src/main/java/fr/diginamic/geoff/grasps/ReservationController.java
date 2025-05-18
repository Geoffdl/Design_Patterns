package fr.diginamic.geoff.grasps;

import fr.diginamic.geoff.grasps.beans.Reservation;
import fr.diginamic.geoff.grasps.services.ReservationException;
import fr.diginamic.geoff.grasps.services.ReservationService;

/**
 * Controller qui prend en charge la gestion des réservations client
 * @author RichardBONNAMY
 */
public class ReservationController
{
    /**
     * Méthode qui créée une réservation pour un client à partir des informations transmises
     * @param params contient toutes les infos permettant de créer une réservation
     * @return Reservation
     */
    public Reservation creerReservation(Params params)
    {
        ReservationService reservationService = new ReservationService();
        
        try
        {
            return reservationService.createReservation(params);
        }
        catch (ReservationException e)
        {
            //log error
            System.out.println(e.getMessage());
            return null;
        }
    }
}
