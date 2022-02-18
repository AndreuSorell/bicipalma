package edu.poniperro.bicipalma.domain.vehiculo;

public class Bicicleta implements Movible{
    private final int id;

    public Bicicleta(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return Integer.toString(getId());
    }
    
}