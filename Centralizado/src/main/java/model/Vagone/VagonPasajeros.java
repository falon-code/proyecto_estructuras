package model.Vagone;

public class VagonPasajeros extends Vagon {

    private int puestosEstandar;
    private int puestosEjecutivos;
    private int puestosPremiums;

    public VagonPasajeros(int idVagon, int puestosEstandar, int puestosEjecutivos, int puestosPremiums) {
        super(idVagon);
        this.puestosEstandar = puestosEstandar;
        this.puestosEjecutivos = puestosEjecutivos;
        this.puestosPremiums = puestosPremiums;
    }

    public int getPuestosEstandar() {
        return puestosEstandar;
    }

    public void setPuestosEstandar(int puestosEstandar) {
        this.puestosEstandar = puestosEstandar;
    }

    public int getPuestosEjecutivos() {
        return puestosEjecutivos;
    }

    public void setPuestosEjecutivos(int puestosEjecutivos) {
        this.puestosEjecutivos = puestosEjecutivos;
    }

    public int getPuestosPremiums() {
        return puestosPremiums;
    }

    public void setPuestosPremiums(int puestosPremiums) {
        this.puestosPremiums = puestosPremiums;
    }

    public boolean apartarPuesto() {
        return true;
    }
}
