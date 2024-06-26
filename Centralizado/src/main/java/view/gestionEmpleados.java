/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Model.linkedlist.singly.LinkedList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Empleado;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 *
 * @author Charly Cimino
 */
public class gestionEmpleados extends javax.swing.JFrame {
    DefaultTableModel modelo;
        private LinkedList<Empleado> listaEmpleados;
            private final String pathFile = "C:\\Users\\tostiarepa64\\Downloads\\proyecto_estructuras\\Centralizado\\src\\main\\java\\baseDatos\\empleados.json";



    /**
     * Creates new form gestionEmpleados
     */
    public gestionEmpleados() {
        initComponents();modelo = new DefaultTableModel();
        listaEmpleados = new LinkedList<>();
        modelo.addColumn("Usuario");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Nombre");
        modelo.addColumn("Identificacion");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        this.Tabla.setModel(modelo);
         cargarEmpleadosDesdeArchivo();

    }
    
    
    private void cargarEmpleadosDesdeArchivo() {
    // Cargar el contenido del archivo JSON en un objeto JSONObject
    JSONObject jsonObject = loadJsonObjectFromFile(pathFile);

    if (jsonObject != null && jsonObject.has("empleados")) {
        JSONArray empleadosJsonArray = jsonObject.getJSONArray("empleados");

        // Limpiar el modelo de la tabla antes de cargar nuevos datos
        modelo.setRowCount(0);

        // Iterar sobre el JSONArray de empleados
        for (int i = 0; i < empleadosJsonArray.length(); i++) {
            JSONObject empleadoJson = empleadosJsonArray.getJSONObject(i);

            // Obtener los datos del empleado desde el objeto JSON
            String usuario = empleadoJson.getString("usuario");
            String contraseña = empleadoJson.getString("contraseña");
            String nombre = empleadoJson.getString("nombre");
            String identificacion = empleadoJson.getString("identificacion");
            String direccion = empleadoJson.getString("direccion");
            String telefono = empleadoJson.getString("telefono");

            // Agregar una nueva fila a la tabla con los datos del empleado
            Object[] fila = {usuario, contraseña, nombre, identificacion, direccion, telefono};
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

        Uuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Contraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        Identificacion = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        Direccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        Telefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        BtnAgregar = new javax.swing.JButton();
        BtnBajar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnVolverAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Uuario.setText("Usuario");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

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

        Contraseña.setText("Constraseña");

        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });

        Nombre.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        Identificacion.setText("Identificacion");

        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        Direccion.setText("Direccion");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        Telefono.setText("Telefono");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

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

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnVolverAdmin.setText("Volver");
        BtnVolverAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverAdminActionPerformed(evt);
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
                                .addComponent(Uuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Contraseña)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Identificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Direccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Telefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(BtnBajar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(BtnModificar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtnVolverAdmin)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(91, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Uuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Contraseña)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Identificacion)
                            .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Direccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Telefono))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAgregar)
                            .addComponent(BtnBajar))
                        .addGap(18, 18, 18)
                        .addComponent(BtnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnVolverAdmin)
                        .addGap(69, 69, 69))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private JsonObject convertirEmpleadoAJsonObject(Empleado empleado) {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("usuario", empleado.getUsuario());
    jsonObject.addProperty("contraseña", empleado.getContraseña());
    jsonObject.addProperty("nombre", empleado.getNombre());
    jsonObject.addProperty("identificacion", empleado.getIdentificacion());
    jsonObject.addProperty("direccion", empleado.getDireccion());
    jsonObject.addProperty("telefono", empleado.getTelefono());
    return jsonObject;
}

    
    
    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
    String usuario = txtUsuario.getText();
    String contraseña = txtContraseña.getText();
    String nombre = txtNombre.getText();
    String identificacion = txtIdentificacion.getText();
    String direccion = txtDireccion.getText();
    String telefono = txtTelefono.getText();

    // Validar que el campo usuario no esté vacío (esencial para cada empleado)
    if (usuario.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo Usuario no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Crear un nuevo objeto Empleado
    Empleado nuevoEmpleado = new Empleado(usuario, contraseña, nombre, identificacion, direccion, telefono);

    // Agregar el empleado a la lista de empleados
    listaEmpleados.add(nuevoEmpleado);

    // Limpiar los campos después de agregar el empleado
    limpiarCampos();

    // Crear un Gson para convertir objetos a JSON
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // Convertir la lista de Empleados a un JsonObject con clave "empleados"
    JsonObject empleadosJsonObject = new JsonObject();
    JsonArray empleadosJsonArray = new JsonArray();

    // Usar un bucle for normal para recorrer la lista de empleados
    for (int i = 0; i < listaEmpleados.size(); i++) {
        Empleado empleado = listaEmpleados.get(i);
        JsonObject empleadoJsonObject = new JsonObject();
        empleadoJsonObject.addProperty("usuario", empleado.getUsuario());
        empleadoJsonObject.addProperty("contraseña", empleado.getContraseña());
        empleadoJsonObject.addProperty("nombre", empleado.getNombre());
        empleadoJsonObject.addProperty("identificacion", empleado.getIdentificacion());
        empleadoJsonObject.addProperty("direccion", empleado.getDireccion());
        empleadoJsonObject.addProperty("telefono", empleado.getTelefono());
        empleadosJsonArray.add(empleadoJsonObject);

        // Agregar la fila directamente al modelo de la tabla
        Object[] fila = {empleado.getUsuario(), empleado.getContraseña(), empleado.getNombre(), empleado.getIdentificacion(), empleado.getDireccion(), empleado.getTelefono()};
        modelo.addRow(fila);
    }

    empleadosJsonObject.add("empleados", empleadosJsonArray); // Agregar el array de empleados al objeto JSON principal

    // Convertir el JsonObject a una cadena JSON formateada
    String jsonString = gson.toJson(empleadosJsonObject);

    // Guardar la cadena JSON en el archivo (pathFile debe ser definido previamente)
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathFile))) {
        writer.write(jsonString);
        JOptionPane.showMessageDialog(this, "Datos de empleados guardados exitosamente", "Guardado", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar los datos de empleados", "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Notificar al modelo de la tabla que los datos han cambiado
    modelo.fireTableDataChanged();
    }//GEN-LAST:event_BtnAgregarActionPerformed

      private void limpiarCampos() {
        // Limpiar los campos de entrada después de agregar un empleado
        txtUsuario.setText("");
        txtContraseña.setText("");
        txtNombre.setText("");
        txtIdentificacion.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }
    
    
    
    private void BtnBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBajarActionPerformed
          
  // Obtener el nombre de usuario del empleado a eliminar
    String usuarioAEliminar = JOptionPane.showInputDialog(this, "Ingrese el usuario del empleado a eliminar:");

    // Cargar el archivo JSON existente
    JSONObject jsonObject = loadJsonObjectFromFile(pathFile);

    if (jsonObject != null) {
        // Obtener el array de empleados del JSON
        JSONArray empleadosJsonArray = jsonObject.getJSONArray("empleados");

        // Crear un nuevo array para almacenar empleados después de la eliminación
        JSONArray nuevosEmpleadosArray = new JSONArray();

        // Flag para verificar si se encontró el empleado
        boolean empleadoEncontrado = false;

        // Iterar sobre los empleados y copiar aquellos que no deben ser eliminados
        for (int i = 0; i < empleadosJsonArray.length(); i++) {
            JSONObject empleado = empleadosJsonArray.getJSONObject(i);
            String usuario = empleado.getString("usuario");

            if (!usuario.equals(usuarioAEliminar)) {
                // Agregar empleados no eliminados al nuevo array
                nuevosEmpleadosArray.put(empleado);
            } else {
                empleadoEncontrado = true;
            }
        }

        if (empleadoEncontrado) {
            // Reemplazar el array de empleados en el objeto JSON original
            jsonObject.put("empleados", nuevosEmpleadosArray);

            // Guardar el JSON actualizado en el archivo
            saveJsonObjectToFile(jsonObject);

            // Actualizar la tabla con la nueva lista de empleados
            updateTableFromJsonArray(nuevosEmpleadosArray);

            JOptionPane.showMessageDialog(this, "Empleado eliminado exitosamente", "Eliminación", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ningún empleado con el usuario especificado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Error: No se pudo cargar el archivo JSON", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BtnBajarActionPerformed

    private void updateTableFromJsonArray(JSONArray empleadosArray) {
    // Limpiar el modelo de la tabla
    modelo.setRowCount(0);

    // Iterar sobre el array de empleados JSON y agregarlos a la tabla
    for (int i = 0; i < empleadosArray.length(); i++) {
        JSONObject empleado = empleadosArray.getJSONObject(i);

        String usuario = empleado.getString("usuario");
        String contraseña = empleado.getString("contraseña");
        String nombre = empleado.getString("nombre");
        String identificacion = empleado.getString("identificacion");
        String direccion = empleado.getString("direccion");
        String telefono = empleado.getString("telefono");

        // Agregar la fila a la tabla
        Object[] fila = {usuario, contraseña, nombre, identificacion, direccion, telefono};
        modelo.addRow(fila);
    }

    // Notificar al modelo de la tabla que los datos han cambiado
    modelo.fireTableDataChanged();
}
    
  private JSONObject loadJsonObjectFromFile(String filePath) {
    try (FileReader reader = new FileReader(filePath)) {
        JSONTokener tokener = new JSONTokener(reader);
        return new JSONObject(tokener);
    } catch (IOException e) {
        System.err.println("Error al leer el archivo JSON: " + e.getMessage());
        e.printStackTrace();
    } catch (JSONException e) {
        System.err.println("Error al parsear el contenido JSON: " + e.getMessage());
        e.printStackTrace();
    }
    return null;
}



    
   private void saveJsonObjectToFile(JSONObject jsonObject) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathFile))) {
            writer.write(jsonObject.toString(4)); // Escribir el JSON formateado en el archivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
      // Obtener el índice de la fila seleccionada en la tabla
    int filaSeleccionada = Tabla.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un empleado de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener los valores de los campos de texto para el empleado modificado
    String usuario = txtUsuario.getText();
    String contraseña = txtContraseña.getText();
    String nombre = txtNombre.getText();
    String identificacionStr = txtIdentificacion.getText();
    String direccion = txtDireccion.getText();
    String telefonoStr = txtTelefono.getText();

    // Validar y convertir los campos de identificación y teléfono
    int identificacion;
    int telefono;

    try {
        identificacion = Integer.parseInt(identificacionStr);
        telefono = Integer.parseInt(telefonoStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa valores numéricos válidos para identificación y teléfono.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener el empleado seleccionado en la tabla
    Empleado empleadoSeleccionado = listaEmpleados.get(filaSeleccionada);

    // Actualizar los valores del empleado seleccionado
    empleadoSeleccionado.setUsuario(usuario);
    empleadoSeleccionado.setContraseña(contraseña);
    empleadoSeleccionado.setNombre(nombre);
    empleadoSeleccionado.setIdentificacion(String.valueOf(identificacion)); // Convertir a String para mantener el tipo original
    empleadoSeleccionado.setDireccion(direccion);
    empleadoSeleccionado.setTelefono(String.valueOf(telefono)); // Convertir a String para mantener el tipo original

    // Actualizar la fila en la tabla con los nuevos valores
    Tabla.setValueAt(usuario, filaSeleccionada, 0);
    Tabla.setValueAt(contraseña, filaSeleccionada, 1);
    Tabla.setValueAt(nombre, filaSeleccionada, 2);
    Tabla.setValueAt(identificacion, filaSeleccionada, 3);
    Tabla.setValueAt(direccion, filaSeleccionada, 4);
    Tabla.setValueAt(telefono, filaSeleccionada, 5);

    // Limpiar los campos después de modificar el empleado
    limpiarCampos();

    // Guardar los cambios en el archivo JSON
    guardarEmpleadosEnArchivo();

    JOptionPane.showMessageDialog(this, "Empleado modificado exitosamente.", "Modificación", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnVolverAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverAdminActionPerformed
        AdminOptions B = new AdminOptions();
        B.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_BtnVolverAdminActionPerformed

    private void guardarEmpleadosEnArchivo() {
    // Crear un Gson para convertir objetos a JSON
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // Convertir la lista de Empleados a un JsonObject con clave "empleados"
    JsonObject empleadosJsonObject = new JsonObject();
    JsonArray empleadosJsonArray = new JsonArray();

    // Usar un bucle for normal para recorrer la lista de empleados
    for (int i = 0; i < listaEmpleados.size(); i++) {
        Empleado empleado = listaEmpleados.get(i);

        JsonObject empleadoJsonObject = new JsonObject();
        empleadoJsonObject.addProperty("usuario", empleado.getUsuario());
        empleadoJsonObject.addProperty("contraseña", empleado.getContraseña());
        empleadoJsonObject.addProperty("nombre", empleado.getNombre());
        empleadoJsonObject.addProperty("identificacion", empleado.getIdentificacion());
        empleadoJsonObject.addProperty("direccion", empleado.getDireccion());
        empleadoJsonObject.addProperty("telefono", empleado.getTelefono());

        empleadosJsonArray.add(empleadoJsonObject);
    }

    empleadosJsonObject.add("empleados", empleadosJsonArray); // Agregar el array de empleados al objeto JSON principal

    // Convertir el JsonObject a una cadena JSON formateada
    String jsonString = gson.toJson(empleadosJsonObject);

    // Guardar la cadena JSON en el archivo (pathFile debe ser definido previamente)
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathFile))) {
        writer.write(jsonString);
        JOptionPane.showMessageDialog(this, "Datos de empleados guardados exitosamente", "Guardado", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al guardar los datos de empleados", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    
    
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
            java.util.logging.Logger.getLogger(gestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBajar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnVolverAdmin;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Identificacion;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel Uuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

   
}
