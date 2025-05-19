package fr.diginamic.geoff.grasps.daos;

public interface Dao<T>
{
    T getById(String id);
}
