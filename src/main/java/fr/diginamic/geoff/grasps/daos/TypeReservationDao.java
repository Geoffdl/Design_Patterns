package fr.diginamic.geoff.grasps.daos;

import fr.diginamic.geoff.grasps.beans.TypeReservation;

import java.util.List;
import java.util.Optional;

public class TypeReservationDao implements Dao<TypeReservation>
{
    private static TypeReservation[] types = {new TypeReservation("TH", 150.0, 15.0), new TypeReservation("CI", 10.9,
                                                                                                          0.0)};
    
    @Override
    public TypeReservation getById(String id)
    {
        Optional<TypeReservation> opt = List.of(types).stream().filter(t -> t.getType().equals(id)).findAny();
        if (opt.isPresent())
        {
            return opt.get();
        }
        return null;
    }
}
