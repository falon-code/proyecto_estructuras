package model;

import model.Vagone.Vagon;


public class Boleta {
    
    private Tren tren;
    private Pasajero pasajero;
    private Vagon vagon;
    private Puesto puesto;
    private double valorPasaje;
    public Boleta(Tren tren, Pasajero pasajero, Vagon vagon, Puesto puesto, double valorPasaje) {
        this.tren = tren;
        this.pasajero = pasajero;
        this.vagon = vagon;
        this.puesto = puesto;
        this.valorPasaje = valorPasaje;
    }
    public Tren getTren() {
        return tren;
    }
    public void setTren(Tren tren) {
        this.tren = tren;
    }
    public Pasajero getPasajero() {
        return pasajero;
    }
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
    public Vagon getVagon() {
        return vagon;
    }
    public void setVagon(Vagon vagon) {
        this.vagon = vagon;
    }
    public Puesto getPuesto() {
        return puesto;
    }
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    public double getValorPasaje() {
        return valorPasaje;
    }
    public void setValorPasaje(double valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
    
}
