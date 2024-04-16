/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Charly Cimino
 */
public class EmpleadoOptions extends javax.swing.JFrame {

    /**
     * Creates new form EmpleadoOptions
     */
    public EmpleadoOptions() {
        initComponents();
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
        GestionRutas = new javax.swing.JButton();
        GestionUsuarios = new javax.swing.JButton();
        GestionTrenes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        GestionRutas.setBackground(new java.awt.Color(37, 167, 240));
        GestionRutas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GestionRutas.setForeground(new java.awt.Color(255, 255, 255));
        GestionRutas.setText("Gestion Rutas");
        GestionRutas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestionRutasMouseClicked(evt);
            }
        });
        GestionRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionRutasActionPerformed(evt);
            }
        });

        GestionUsuarios.setBackground(new java.awt.Color(37, 167, 240));
        GestionUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GestionUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        GestionUsuarios.setText("Gestion Usuarios");
        GestionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionUsuariosActionPerformed(evt);
            }
        });

        GestionTrenes.setBackground(new java.awt.Color(37, 167, 240));
        GestionTrenes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        GestionTrenes.setForeground(new java.awt.Color(255, 255, 255));
        GestionTrenes.setText("Gestion Trenes");
        GestionTrenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestionTrenesMouseClicked(evt);
            }
        });
        GestionTrenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionTrenesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GestionTrenes)
                    .addComponent(GestionUsuarios)
                    .addComponent(GestionRutas))
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(GestionTrenes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(GestionRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(GestionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GestionRutasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestionRutasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GestionRutasMouseClicked

    private void GestionRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionRutasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GestionRutasActionPerformed

    private void GestionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GestionUsuariosActionPerformed

    private void GestionTrenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestionTrenesMouseClicked
        Trenes options = new Trenes();
        options.setVisible(true);
        options.pack();
        options.setLocationRelativeTo(null);
    }//GEN-LAST:event_GestionTrenesMouseClicked

    private void GestionTrenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionTrenesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GestionTrenesActionPerformed

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
            java.util.logging.Logger.getLogger(EmpleadoOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadoOptions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GestionRutas;
    private javax.swing.JButton GestionTrenes;
    private javax.swing.JButton GestionUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
