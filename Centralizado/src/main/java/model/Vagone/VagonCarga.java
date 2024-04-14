package model.Vagone;

public class VagonCarga extends Vagon{

    private int maximoEquipaje;

   public VagonCarga(int idVagon, int maximoEquipaje) {
        super(idVagon);
        this.maximoEquipaje = maximoEquipaje;
    }

    public int getMaximoEquipaje() {
        return maximoEquipaje;
    }

    public void setMaximoEquipaje(int maximoEquipaje) {
        this.maximoEquipaje = maximoEquipaje;
    }


}
