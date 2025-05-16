package fr.diginamic.geoff.builder.avion;

import java.util.Objects;

public class Siege
{
    private Rangee rangee;
    private Classe classe;
    private int numero;
    
    public Siege(Rangee rangee, Classe classe, int numero)
    {
        this.rangee = rangee;
        this.classe = classe;
        this.numero = numero;
    }
    
    /**
     * Gets rangee for the class Siege
     *
     * @return value of rangee
     */
    public Rangee getRangee()
    {
        return rangee;
    }
    
    /**
     * Sets rangee for the class Siege.
     *
     * @param rangee value of rangee
     */
    public void setRangee(Rangee rangee)
    {
        this.rangee = rangee;
    }
    
    /**
     * Gets classe for the class Siege
     *
     * @return value of classe
     */
    public Classe getClasse()
    {
        return classe;
    }
    
    /**
     * Sets classe for the class Siege.
     *
     * @param classe value of classe
     */
    public void setClasse(Classe classe)
    {
        this.classe = classe;
    }
    
    /**
     * Gets numero for the class Siege
     *
     * @return value of numero
     */
    public int getNumero()
    {
        return numero;
    }
    
    /**
     * Sets numero for the class Siege.
     *
     * @param numero value of numero
     */
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Siege siege))
        {
            return false;
        }
        return numero == siege.numero && rangee == siege.rangee && classe == siege.classe;
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(rangee, classe, numero);
    }
}