package model;

public class Ruta {
    private Estacion estacionSalida;
    private Estacion estacionLlegada;
    private double kilometraje;

    public Ruta(Estacion estacionSalida, Estacion estacionLlegada, double kilometraje) {
        this.estacionSalida = estacionSalida;
        this.estacionLlegada = estacionLlegada;
        this.kilometraje = kilometraje;
    }

    public Estacion getEstacionSalida() {
        return estacionSalida;
    }

    public void setEstacionSalida(Estacion estacionSalida) {
        this.estacionSalida = estacionSalida;
    }

    public Estacion getEstacionLlegada() {
        return estacionLlegada;
    }

    public void setEstacionLlegada(Estacion estacionLlegada) {
        this.estacionLlegada = estacionLlegada;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

}
