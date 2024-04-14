package shared.jsonAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Model.linkedlist.singly.LinkedList;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JsonAdapter<E> { /**
 * Bloqueo para escritura de archivos
 */
private final Object fileWriterLock;

    /**
     * Constructor de la clase
     */
    private JsonAdapter() {
        this.fileWriterLock = new Object();
    }

    /**
     * Método que retorna una instancia de la clase
     * @param <E> Tipo de objeto a manejar
     * @return Instancia de la clase
     */
    public static synchronized <E> JsonAdapter<E> getInstance() {
        return new JsonAdapter<>();
    }

    /**
     * Método que obtiene objetos de un archivo JSON
     * @param pathFile Ruta del archivo
     * @param classOfT Clase del objeto
     * @return Objeto de tipo E
     */
    public LinkedList<E> getObjects(String pathFile, Class<E[]> classOfT) {
        LinkedList<E> objList = new LinkedList<>();
        try {
            Gson gson = new GsonBuilder().create();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile));
            E[] objArray = gson.fromJson(bufferedReader, classOfT);
            if (objArray != null) {
                for (E obj : objArray) {
                    objList.add(obj);
                }
            }
        } catch (IOException e) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, e.getMessage(), e);
        }
        return objList;
    }

    /**
     * Método que escribe objetos en un archivo JSON
     * @param pathFile Ruta del archivo
     * @param objects Objeto a escribir
     * @return True si se escribió correctamente, false en caso contrario
     */
    public Boolean writeObjects(String pathFile, LinkedList<E> objects) {
        boolean successful = false;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(pathFile)) {
            synchronized (fileWriterLock) {
                // Limpiar el archivo (eliminar todos los objetos)
                writer.write("");

                gson.toJson(objects.toArray(), writer);

                successful = true;
            }
        } catch (IOException e) {
            Logger.getLogger(JsonAdapter.class.getName()).log(Level.WARNING, e.getMessage(), e);
        }
        return successful;
}

}
