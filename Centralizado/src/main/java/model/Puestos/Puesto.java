package model.Puestos;

public abstract class Puesto {

    private int idPuesto;

    public Puesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }
}
