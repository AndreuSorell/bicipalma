package edu.poniperro.bicipalma.domain.estacion;

import edu.poniperro.bicipalma.domain.vehiculo.Movible;

public class Anclaje {
    private boolean ocupado = false;
    private Movible bici = null;

    Anclaje() {};

    boolean isOcupado() {
        return this.ocupado;
    }

    Movible getBici() {
        return this.bici;
    }

    void anclarBici(Movible bici) {
        this.bici = bici;
        this.ocupado = true;
    }
    
    void liberarBici() {
        this.bici = null;
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return "ocupado: " + ocupado;
    }

}
