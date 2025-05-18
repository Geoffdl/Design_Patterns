package fr.diginamic.geoff.grasps.services;

import fr.diginamic.geoff.grasps.Params;
import fr.diginamic.geoff.grasps.beans.Client;
import fr.diginamic.geoff.grasps.beans.Reservation;
import fr.diginamic.geoff.grasps.beans.TypeReservation;
import fr.diginamic.geoff.grasps.builders.ReservationBuilder;
import fr.diginamic.geoff.grasps.daos.ClientDao;
import fr.diginamic.geoff.grasps.daos.TypeReservationDao;

/**
 * Controls the Dao calls and treat the data
 */
public class ReservationService
{
    private ClientDao clientDao;
    private TypeReservationDao typeReservationDao;
    
    public ReservationService()
    {
        this.clientDao = new ClientDao();
        this.typeReservationDao = new TypeReservationDao();
    }
    
    public Reservation createReservation(Params params) throws ReservationException
    {
        Client client = clientDao.extraireClient(params.getIdentifiantClient());
        if (client == null)
        {
            throw new ReservationException("Couldn't extract client data");
        }
        
        TypeReservation typeReservation = typeReservationDao.extraireTypeReservation(params.getTypeReservation());
        if (typeReservation == null)
        {
            throw new ReservationException("Couldn't extract typeReservation data");
        }
        
        ReservationBuilder rb = new ReservationBuilder(typeReservation, client);
        
        return rb.appendDate(params.getDateReservation())
                 .appendNbPlaces(params.getNbPlaces())
                 .appendMontantTotal()
                 .build();
    }
}
