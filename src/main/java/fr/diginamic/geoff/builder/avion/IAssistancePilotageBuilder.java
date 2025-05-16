package fr.diginamic.geoff.builder.avion;

/**
 * Interface pour AP builder
 *
 * @param <T> target entity
 * @param <D> builder entity
 */
public interface IAssistancePilotageBuilder<T, D>
{
    /**
     * finish construction
     *
     * @return constructed T
     */
    T build();
    
    /**
     * add Gps
     *
     * @param reference gps ref
     * @return append builder
     */
    D appendGps(String reference);
    
    /**
     * add Gps
     *
     * @param reference gps ref
     * @return append builder
     */
    D appendAutoPilote(String reference);
    
    /**
     * add Gps
     *
     * @param reference gps ref
     * @return append builder
     */
    D appendAltimetre(String reference);
}