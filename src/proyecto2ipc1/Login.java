/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2ipc1;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        bingresar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 80, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 160, 110, 40);
        jPanel1.add(txtusuario);
        txtusuario.setBounds(120, 120, 270, 30);

        bingresar.setBackground(new java.awt.Color(153, 204, 0));
        bingresar.setText("Ingresar");
        bingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bingresarActionPerformed(evt);
            }
        });
        jPanel1.add(bingresar);
        bingresar.setBounds(100, 260, 130, 50);

        bcancelar.setBackground(new java.awt.Color(204, 255, 0));
        bcancelar.setText("Cancelar");
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });
        jPanel1.add(bcancelar);
        bcancelar.setBounds(290, 260, 130, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Bienvenido");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 20, 190, 40);
        jPanel1.add(txtcontra);
        txtcontra.setBounds(120, 210, 270, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bingresarActionPerformed
        // TODO add your handling code here:

        String xusuario = txtusuario.getText();
        String xpassword = txtcontra.getText();

        if (xusuario.equalsIgnoreCase("201700350") && xpassword.equalsIgnoreCase("201700350")) {
            Administrador administrador = new Administrador();
            administrador.setVisible(true);
            Login.this.dispose();

        } else if (!xusuario.equalsIgnoreCase("201700350") && xpassword.equalsIgnoreCase("201700350")) {
            JOptionPane.showMessageDialog(null, "<html> Usuario Incorrecto <html>", "Error", JOptionPane.ERROR_MESSAGE);

        } else if (xusuario.equalsIgnoreCase("201700350") && !xpassword.equalsIgnoreCase("201700350")) {
            JOptionPane.showMessageDialog(null, "<html> Contraseña incorrecta <html>", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (xusuario.isEmpty() && xpassword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese Usuario y Contraseña", "Error", 1);

        } else {
            NodoEstudiante aux;
            aux = Proyecto2IPC1.estudiante.primero;
            do {

                if (xusuario.equals(aux.carnet) && xpassword.equals(aux.contrasena)) {
                    new VentanaEstudiante(String.format("USAC | %s",aux.Nombre+"---"+aux.carnet)).setVisible(true);
                    Login.this.dispose();
                } else if (xusuario.equals(aux.carnet) && !xpassword.equals(aux.contrasena)) {
                    JOptionPane.showMessageDialog(null, "<html> Contraseña incorrecta <html>", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!xusuario.equals(aux.carnet) && xpassword.equals(aux.contrasena)) {
                    JOptionPane.showMessageDialog(null, "<html> Usuario Incorrecto <html>", "Error", JOptionPane.ERROR_MESSAGE);
                }

                aux = aux.siguiente;
            } while (aux != Proyecto2IPC1.estudiante.primero);

        }
    }//GEN-LAST:event_bingresarActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        // TODO add your handling code here:
        new MenuPrincipal("Menu").setVisible(true);
        Login.this.dispose();
    }//GEN-LAST:event_bcancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcancelar;
    private javax.swing.JButton bingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
