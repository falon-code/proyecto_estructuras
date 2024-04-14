package model;

import java.io.Serializable;

import Model.linkedlist.singly.LinkedList;
import model.Vagone.Vagon;
public class Tren implements Serializable{

    private String nombreTren;
    private int idTren;
    private int capacidadCarga;
    private int kilometraje;
    private  LinkedList<Vagon> vagones;
    private Marca marca;

    
    public Tren(String nombreTren, int idTren, int capacidadCarga, int kilometraje, LinkedList<Vagon> vagones,
            Marca marca) {
        this.nombreTren = nombreTren;
        this.idTren = idTren;
        this.capacidadCarga = capacidadCarga;
        this.kilometraje = kilometraje;
        this.vagones = vagones;
        this.marca = marca;
    }

    public String getNombreTren() {
        return nombreTren;
    }


    public void setNombreTren(String nombreTren) {
        this.nombreTren = nombreTren;
    }


    public int getIdTren() {
        return idTren;
    }


    public void setIdTren(int idTren) {
        this.idTren = idTren;
    }


    public int getCapacidadCarga() {
        return capacidadCarga;
    }


    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
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

    
    public boolean agregarVagon(Vagon vagon) {
        return vagones.add(vagon);  
    }

    public boolean eliminarVagon(Vagon vagon) {
        return vagones.remove(vagon); 
    }

    public boolean consultarVagon(Vagon vagon) {
        return vagones.contains(vagon);  // Verifica si el vagón está en la lista de vagones del tren
    }

    public boolean modificarVagon(Vagon vagonAntiguo, Vagon vagonNuevo) {
        if (vagones.contains(vagonAntiguo)) {
            vagones.remove(vagonAntiguo);  
            vagones.add(vagonNuevo);  
            return true;
        } else {
            return false;  // El vagón antiguo no existe en la lista de vagones del tren
        }
    }


}
