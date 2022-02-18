package edu.poniperro.bicipalma.domain.estacion;

import edu.poniperro.bicipalma.domain.vehiculo.Bicicleta;
import edu.poniperro.bicipalma.domain.vehiculo.Movible;

public class Estacion {
    private int id;
    private String direccion;
    private int numAnclajes;
    private int bicisAncladas = 0;
    private int[] anclajes;

    public Estacion(int id, String direccion, int numAnclajes/*, boolean[] anclajes*/) {
        this.id = id;
        this.direccion = direccion;
        this.numAnclajes = numAnclajes;
        this.anclajes = new int[numAnclajes];
    }

    private int getId() {
        return id;
    }

    private String getDireccion() {
        return direccion;
    }

    public int getNumAnclajes() {
        return numAnclajes;
    }

    @Override
    public String toString() {
        return "id: " + getId() + '\n' + "direccion: " + getDireccion() + '\n' + "numero de anclajes: " + getNumAnclajes();
    }

    public void consultarEstacion() {
        System.out.print(this);
    }

    public int anclajesLibres(){
        /*habrá el numAnclajes que se pasen por parametro - los ocupado por bicis*/
        return numAnclajes - bicisAncladas;
    }

    public void anclarBicicleta(Bicicleta bicicleta){
        for (int i=0; i < anclajes.length; i++){
            if (anclajes[i] == 0){
                anclajes[i] = bicicleta.getId();
                bicisAncladas = bicisAncladas + 1;
                break;
            }
        }
    }
    public void consultarAnclajes() {
        for (int j=0; j < anclajes.length; j++) {
            if (anclajes[j] != 0) {
                System.out.println("Anclaje " + j + " " + anclajes[j]);
            }
            else {
                System.out.println("Anclaje " + j + "  libre");
            }
        }
    }

}