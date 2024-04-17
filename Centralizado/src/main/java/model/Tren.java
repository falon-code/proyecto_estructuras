package model;

import java.io.Serializable;

import Model.linkedlist.singly.LinkedList;
import model.Vagone.Vagon;
public class Tren implements Serializable{

    private static int mercedesIdCounter = 0;
    private static int arnoldIdCounter = 0;

    private String nombreTren;
    private String idTren;
    private int capacidadTotal;
    private int kilometraje;
    private LinkedList<Vagon> vagones;
    private Marca marca;
    private boolean disponible; 

    public Tren(String nombreTren, Marca marca, int capacidadTotal) {
        this.nombreTren = nombreTren;
        this.marca = this.marca;
        this.capacidadTotal = capacidadTotal;
        this.kilometraje = 0;
        this.vagones = new LinkedList<>();
        
        // Generate sequential ID based on the train's brand
        if (marca == Marca.MERCEDES_BENZ) {
            mercedesIdCounter++;
            this.idTren = "M" + mercedesIdCounter;
        } else if (marca == Marca.ARNOLD) {
            arnoldIdCounter++;
            this.idTren = "A" + arnoldIdCounter;
        }
    }


    

    // Getters and Setters

    public String getNombreTren() {
        return nombreTren;
    }

    public String getIdTren() {
        return idTren;
    }

    public int getCapacidadCarga() {
        return capacidadTotal;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadTotal = capacidadCarga;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public LinkedList<Vagon> getVagones() {
        return vagones;
    }

    public void setVagones(LinkedList<Vagon> vagones) {
        this.vagones = vagones;
    }

    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    // Methods to add, remove, and modify wagons
    public boolean agregarVagon(Vagon vagon) {
        return vagones.add(vagon);
    }

    public boolean eliminarVagon(Vagon vagon) {
        return vagones.remove(vagon);
    }

    public boolean consultarVagon(Vagon vagon) {
        return vagones.contains(vagon);
    }

    public boolean modificarVagon(Vagon vagonAntiguo, Vagon vagonNuevo) {
        if (vagones.contains(vagonAntiguo)) {
            vagones.remove(vagonAntiguo);
            vagones.add(vagonNuevo);
            return true;
        } else {
            return false;
        }
    }
        public boolean estaDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void setIdTren(String id) {
        this.idTren = id;
    }


}







