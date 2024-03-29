/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2ipc1;

/**
 *
 * @author USUARIO
 */
public class AdministrarEstudiantes extends javax.swing.JFrame {

    /**
     * Creates new form AdministrarEstudiantes
     */
    public AdministrarEstudiantes() {
        initComponents();
        setLocationRelativeTo(null);
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
        bagregar = new javax.swing.JButton();
        bmodificar = new javax.swing.JButton();
        bmostrar = new javax.swing.JButton();
        beliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bcargamasiva = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        bagregar.setBackground(new java.awt.Color(0, 255, 51));
        bagregar.setText("Agregar");
        bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagregarActionPerformed(evt);
            }
        });
        jPanel1.add(bagregar);
        bagregar.setBounds(60, 90, 110, 40);

        bmodificar.setBackground(new java.awt.Color(204, 204, 0));
        bmodificar.setText("Modificar");
        bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(bmodificar);
        bmodificar.setBounds(270, 90, 110, 40);

        bmostrar.setBackground(new java.awt.Color(204, 0, 204));
        bmostrar.setText("Mostrar");
        bmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmostrarActionPerformed(evt);
            }
        });
        jPanel1.add(bmostrar);
        bmostrar.setBounds(60, 160, 110, 40);

        beliminar.setBackground(new java.awt.Color(255, 102, 0));
        beliminar.setText("Eliminar");
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
            }
        });
        jPanel1.add(beliminar);
        beliminar.setBounds(270, 160, 110, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Administrar Estudiantes");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 10, 390, 50);

        bcargamasiva.setBackground(new java.awt.Color(204, 204, 0));
        bcargamasiva.setText("Carga Masiva");
        bcargamasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcargamasivaActionPerformed(evt);
            }
        });
        jPanel1.add(bcargamasiva);
        bcargamasiva.setBounds(60, 240, 120, 40);

        bsalir.setBackground(new java.awt.Color(255, 0, 0));
        bsalir.setText("Salir");
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });
        jPanel1.add(bsalir);
        bsalir.setBounds(270, 240, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagregarActionPerformed
        // TODO add your handling code here:
        AgregarEstudiante estudiante = new AgregarEstudiante();
        estudiante.setVisible(true);
        AdministrarEstudiantes.this.dispose();
    }//GEN-LAST:event_bagregarActionPerformed

    private void bmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodificarActionPerformed
        // TODO add your handling code here:
        ModificarEstudiante modificar = new ModificarEstudiante();
        modificar.setVisible(true);
        AdministrarEstudiantes.this.dispose();
    }//GEN-LAST:event_bmodificarActionPerformed

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed
        // TODO add your handling code here:
        new EliminarEstudiante().setVisible(true);
        AdministrarEstudiantes.this.dispose();
    }//GEN-LAST:event_beliminarActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        // TODO add your handling code here:
        new Administrador().setVisible(true);
        AdministrarEstudiantes.this.dispose();
    }//GEN-LAST:event_bsalirActionPerformed

    private void bmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmostrarActionPerformed
        // TODO add your handling code here:
       new MostrarEstudiante().setVisible(true);
       AdministrarEstudiantes.this.dispose();
    }//GEN-LAST:event_bmostrarActionPerformed

    private void bcargamasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcargamasivaActionPerformed
        // TODO add your handling code here:
        new CargaMasiva().setVisible(true);
        AdministrarEstudiantes.this.dispose();
    }//GEN-LAST:event_bcargamasivaActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrarEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrarEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrarEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrarEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrarEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagregar;
    private javax.swing.JButton bcargamasiva;
    private javax.swing.JButton beliminar;
    private javax.swing.JButton bmodificar;
    private javax.swing.JButton bmostrar;
    private javax.swing.JButton bsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
