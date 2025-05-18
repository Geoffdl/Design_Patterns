package fr.diginamic.geoff.grasps.builders;

public interface IReservationBuilder<T, D>
{
    /**
     * Complete building process and sets client
     * @return reservation
     */
    T build();
    
    /**
     * sets a LocalDateTime to reservation from String date with format "dd/MM/yyyy HH:mm:ss"
     * @param dateTime raw dateTime from params
     * @return appended builder
     */
    D appendDate(String dateTime);
    
    /**
     * sets number of places
     * @param nbPlaces number of places
     * @return appended builder
     */
    D appendNbPlaces(int nbPlaces);
    
    /**
     * Calculates montant with/o discount based on client status
     * @return appended builder
     */
    D appendMontantTotal();
}
