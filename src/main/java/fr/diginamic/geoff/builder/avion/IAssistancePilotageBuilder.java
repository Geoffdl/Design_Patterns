package fr.diginamic.geoff.builder.avion;

public interface IAssistancePilotageBuilder<T, D>
{
    
    T build();
    
    D appendGps(String reference);
    
    D appendAutoPilote(String reference);
    
    D appendAltimetre(String reference);
}