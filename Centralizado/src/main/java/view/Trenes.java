/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.linkedlist.singly.LinkedList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Marca;
import model.Tren;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import shared.jsonAdapter.JsonAdapter;

/**
 *
 * @author Charly Cimino
 */
public class Trenes extends javax.swing.JFrame {

    DefaultTableModel modelo;
    private LinkedList<Tren> listaTrenes;
    private final String pathFile = "C:\\Users\\tostiarepa64\\Downloads\\proyecto_estructuras\\Centralizado\\src\\main\\java\\baseDatos\\trenes.json";

    /**
     * Creates new form Trenes
     */
    public Trenes() {
        initComponents();
        listaTrenes = new LinkedList<>();
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("ID");
        modelo.addColumn("Capacidad");
        modelo.addColumn("Marca");
        modelo.addColumn("Kilometraje");
        modelo.addColumn("Disponibilidad");
        this.Tabla.setModel(modelo);
            cargarTrenesDesdeArchivo();
    }
    
    private void cargarTrenesDesdeArchivo() {
    // Cargar el contenido del archivo JSON en un objeto JSONObject
    JSONObject jsonObject = loadJsonObjectFromFile(pathFile);

    if (jsonObject != null && jsonObject.has("trenes")) {
        JSONArray trenesJsonArray = jsonObject.getJSONArray("trenes");

        // Limpiar el modelo de la tabla antes de cargar nuevos datos
        modelo.setRowCount(0);

        // Iterar sobre el JSONArray de trenes
        for (int i = 0; i < trenesJsonArray.length(); i++) {
            JSONObject trenJson = trenesJsonArray.getJSONObject(i);

            // Obtener los datos del tren desde el objeto JSON
            String nombreTren = trenJson.getString("nombreTren");
            String idTren = trenJson.optString("ID", ""); // Obtener ID del tren o cadena vacía si no está presente
            int capacidadCarga = trenJson.getInt("capacidadCarga");
            String marca = trenJson.getString("marca");
            double kilometraje = trenJson.optDouble("kilometraje", 0.0); // Obtener kilometraje o 0.0 si no está presente
            boolean disponibilidad = trenJson.optBoolean("disponibilidad", false); // Obtener disponibilidad o false si no está presente
            String disponibilidadStr = disponibilidad ? "Disponible" : "No Disponible";

            // Agregar una nueva fila a la tabla con los datos del tren
            Object[] fila = {nombreTren, idTren, capacidadCarga, marca, kilometraje, disponibilidadStr};
            modelo.addRow(fila);
        }
    }
}

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BtnAgregar = new javax.swing.JButton();
        BtnBajar = new javax.swing.JButton();
        txtMarca = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtVagones = new javax.swing.JTextField();
        BtnVolver = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Marca:");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnBajar.setText("Bajar");
        BtnBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBajarActionPerformed(evt);
            }
        });

        txtMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercedez-Benz", "Arnold" }));
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jLabel4.setText("Vagones");

        txtVagones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVagonesActionPerformed(evt);
            }
        });

        BtnVolver.setText("Volver");
        BtnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnVolverMouseClicked(evt);
            }
        });
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnBajar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVagones, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(BtnVolver)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtVagones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAgregar)
                            .addComponent(BtnBajar))
                        .addGap(18, 18, 18)
                        .addComponent(BtnVolver)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        String nombre = txtNombre.getText().trim();
    String capacidadStr = txtVagones.getText().trim();
    String marcaStr = (String) txtMarca.getSelectedItem();
    Marca marca;

    // Validar entrada no vacía
    if (nombre.isEmpty() || capacidadStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe completar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (marcaStr.equals("Mercedes-Benz")) {
        marca = Marca.MERCEDES_BENZ;
    } else if (marcaStr.equals("Arnold")) {
        marca = Marca.ARNOLD;
    } else {
        JOptionPane.showMessageDialog(this, "Marca de tren inválida", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Convertir la capacidad a entero
    int capacidad;
    try {
        capacidad = Integer.parseInt(capacidadStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La capacidad debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar la capacidad según la marca seleccionada
    if ((marca == Marca.MERCEDES_BENZ && (capacidad < 1 || capacidad > 28))
            || (marca == Marca.ARNOLD && (capacidad < 1 || capacidad > 32))) {
        JOptionPane.showMessageDialog(this, "La capacidad para este tipo de tren debe estar entre 1 y 28 para Mercedez-Benz o entre 1 y 32 para Arnold", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Generar ID único con prefijo según la marca seleccionada
    String idTren;
    if (marca == Marca.MERCEDES_BENZ) {
        idTren = generateUniqueId("M");
    } else { // marca == Marca.ARNOLD
        idTren = generateUniqueId("A");
    }

    // Crear el nuevo objeto Tren con los datos obtenidos
    Tren nuevoTren = new Tren(nombre, marca, capacidad);
    nuevoTren.setIdTren(idTren); // Asignar el ID generado al nuevo tren

    // Agregar el tren a la lista de trenes
    listaTrenes.add(nuevoTren);

    // Crear JSON para el nuevo tren
    JSONObject nuevoTrenJson = new JSONObject();
    nuevoTrenJson.put("nombreTren", nuevoTren.getNombreTren());
    nuevoTrenJson.put("ID", nuevoTren.getIdTren());
    nuevoTrenJson.put("capacidadCarga", nuevoTren.getCapacidadCarga()); // Usar getCapacidadTotal
    nuevoTrenJson.put("marca", marcaStr);
    nuevoTrenJson.put("kilometraje", nuevoTren.getKilometraje());
    nuevoTrenJson.put("disponibilidad", nuevoTren.estaDisponible()); // Usar isDisponible

    // Cargar JSON existente desde el archivo
    JSONObject jsonObject = loadJsonObjectFromFile(pathFile);

    if (jsonObject == null) {
        jsonObject = new JSONObject(); // Crear un nuevo objeto JSON si no se pudo cargar
    }

    // Obtener el array de trenes del JSON o crear uno nuevo si no existe
    JSONArray trenesJsonArray;
    if (jsonObject.has("trenes")) {
        trenesJsonArray = jsonObject.getJSONArray("trenes");
    } else {
        trenesJsonArray = new JSONArray();
    }

    // Agregar el nuevo tren al array de trenes
    trenesJsonArray.put(nuevoTrenJson);

    // Actualizar el JSON en el objeto principal
    jsonObject.put("trenes", trenesJsonArray);

    // Guardar el JSON actualizado en el archivo
    saveJsonObjectToFile(jsonObject, pathFile);

    // Actualizar la tabla en la interfaz gráfica con los nuevos datos
    updateTableFromJsonArray(trenesJsonArray);

    // Limpiar campos después de agregar
    limpiarCampos();

    // Mostrar mensaje de éxito
    JOptionPane.showMessageDialog(this, "Tren agregado exitosamente y guardado en el archivo", "Éxito", JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_BtnAgregarActionPerformed

     private String generateUniqueId(String prefix) {
    // Generar un ID único con prefijo específico (por ejemplo, "M" o "A")
    return prefix + UUID.randomUUID().toString().substring(0, 8); // Usamos los primeros 8 caracteres del UUID
}
    
    private String calcularDisponibilidad(Tren tren) {
        // Aquí debes implementar la lógica para determinar la disponibilidad
        // Por ejemplo, podrías tener un campo en la clase Tren que indique si está disponible o no
        // Y aquí puedes verificar ese campo y devolver "Disponible" o "No Disponible"
        // Ejemplo:
        if (tren.estaDisponible()) {
            return "Disponible";
        } else {
            return "No Disponible";
        }
    }

    private void limpiarCampos() {
        // Limpiar los campos de entrada después de agregar un tren
        txtNombre.setText("");
        txtVagones.setText("");
    }


    private void BtnBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajarActionPerformed
        // Obtener el nombre del tren a eliminar
        String nombreTrenAEliminar = JOptionPane.showInputDialog(this, "Ingrese el nombre del tren a eliminar:");

        // Cargar el archivo JSON existente de trenes
        JSONObject jsonObject = loadJsonObjectFromFile(pathFile);

        if (jsonObject != null && jsonObject.has("trenes")) {
            // Obtener el array de trenes del JSON
            JSONArray trenesJsonArray = jsonObject.getJSONArray("trenes");

            // Crear un nuevo array para almacenar trenes después de la eliminación
            JSONArray nuevosTrenesArray = new JSONArray();

            // Flag para verificar si se encontró y eliminó el tren
            boolean trenEncontrado = false;

            // Iterar sobre los trenes y copiar aquellos que no deben ser eliminados
            for (int i = 0; i < trenesJsonArray.length(); i++) {
                JSONObject tren = trenesJsonArray.getJSONObject(i);
                String nombreTren = tren.getString("nombreTren");

                // Comparar nombres después de eliminar espacios adicionales y sin considerar diferencias entre mayúsculas y minúsculas
                if (nombreTren.trim().equalsIgnoreCase(nombreTrenAEliminar.trim())) {
                    // Se encontró el tren, marcar como encontrado
                    trenEncontrado = true;
                } else {
                    // Agregar trenes no eliminados al nuevo array
                    nuevosTrenesArray.put(tren);
                }
            }

            if (trenEncontrado) {
                // Reemplazar el array de trenes en el objeto JSON original
                jsonObject.put("trenes", nuevosTrenesArray);

                // Guardar el JSON actualizado en el archivo de trenes
                saveJsonObjectToFile(jsonObject, pathFile);

                // Limpiar el modelo de la tabla
                DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
                modelo.setRowCount(0); // Eliminar todas las filas de la tabla

                // Volver a llenar la tabla con los datos actualizados del JSON
                updateTableFromJsonArray(nuevosTrenesArray);

                JOptionPane.showMessageDialog(this, "Tren eliminado exitosamente", "Eliminación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún tren con el nombre especificado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error: No se pudo cargar el archivo JSON de trenes", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnBajarActionPerformed
 private void updateTableFromJsonArray(JSONArray trenesJsonArray) {
    DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
    modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevas filas

    try {
        // Iterar sobre el array de trenes JSON y agregarlos a la tabla
        for (int i = 0; i < trenesJsonArray.length(); i++) {
            JSONObject tren = trenesJsonArray.getJSONObject(i);

            // Extraer datos del tren del objeto JSON
            String nombreTren = tren.getString("nombreTren");
            String idTren = tren.optString("ID", ""); // Obtener ID del tren o cadena vacía si no está presente
            int capacidadCarga = tren.getInt("capacidadCarga");
            String marca = tren.getString("marca");
            double kilometraje = tren.optDouble("kilometraje", 0.0); // Obtener kilometraje o 0.0 si no está presente
            boolean disponibilidad = tren.optBoolean("disponibilidad", false); // Obtener disponibilidad o false si no está presente
            String disponibilidadStr = disponibilidad ? "Disponible" : "No Disponible";

            // Agregar la fila a la tabla
            Object[] fila = {
                nombreTren,
                idTren,
                capacidadCarga,
                marca,
                kilometraje,
                disponibilidadStr
            };
            modelo.addRow(fila);
        }

        // Notificar al modelo de la tabla que los datos han cambiado
        modelo.fireTableDataChanged();
    } catch (JSONException e) {
        JOptionPane.showMessageDialog(this, "Error al procesar el JSON de trenes: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}




    private void saveJsonObjectToFile(JSONObject jsonObject, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(jsonObject.toString(4)); // Escribir el JSON formateado en el archivo
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo JSON", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private JSONObject loadJsonObjectFromFile(String filePath) {
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
            return new JSONObject(jsonString);
        } catch (IOException | JSONException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar el archivo JSON", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }

    private void limpiarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        modelo.setRowCount(0); // Eliminar todas las filas de la tabla
    }

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void txtVagonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVagonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVagonesActionPerformed

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
            EmpleadoOptions o = new EmpleadoOptions();
            o.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void BtnVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVolverMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnVolverMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Trenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBajar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> txtMarca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVagones;
    // End of variables declaration//GEN-END:variables
}
