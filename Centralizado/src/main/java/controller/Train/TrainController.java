
package controller.Train;

import Model.linkedlist.singly.LinkedList;
import model.Marca;
import model.Tren;
import shared.jsonAdapter.JsonAdapter;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class TrainController {
 private LinkedList<Tren> trainList;
    private JsonAdapter<Tren> jsonAdapter; // Instancia del JsonAdapter para Tren

    public TrainController() {
        this.trainList = new LinkedList<>();
        this.jsonAdapter = JsonAdapter.getInstance(); // Inicializa el JsonAdapter
    }

    public void addTrain(Tren tren) {
        trainList.add(tren);
    }

    public LinkedList<Tren> getTrainList() {
        return trainList;
    }

    public void loadTrainData(String filePath) {
        // Cargar datos de tren desde el archivo JSON usando el JsonAdapter
        trainList = jsonAdapter.getObjects(filePath, Tren[].class);
    }

    public boolean saveTrainData(String filePath) {
        // Guardar datos de tren en el archivo JSON usando el JsonAdapter
        return jsonAdapter.writeObjects(filePath, trainList);
    }
}
