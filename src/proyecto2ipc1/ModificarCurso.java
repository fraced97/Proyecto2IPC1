/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2ipc1;

import javax.swing.JOptionPane;
import static proyecto2ipc1.ModificarEstudiante.jComboBox1;

/**
 *
 * @author USUARIO
 */
public class ModificarCurso extends javax.swing.JFrame {

    /**
     * Creates new form ModificarCurso
     */
    public ModificarCurso() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        //////////////////////////MOSTRAR Codigo Curso EN COMBOBOX///////////////////////////////////////////
        NodoCurso aux;
        aux = Proyecto2IPC1.curso.primero;
        do {
            jComboBox1.addItem(aux.ncurso);
            aux = aux.siguiente;
        } while (aux != Proyecto2IPC1.curso.primero);
        
        /////////////////////////////////////////////////////////////////////
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bmodificar = new javax.swing.JButton();
        bsalir = new javax.swing.JButton();
        bcurso = new javax.swing.JTextField();
        bcatedratico = new javax.swing.JTextField();
        bcredito = new javax.swing.JTextField();
        blab = new javax.swing.JTextField();
        bpre = new javax.swing.JTextField();
        bpost = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        bobtener = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Modificar Curso");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 10, 260, 60);

        jLabel2.setText("Codigo");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 80, 50, 20);

        jLabel3.setText("Curso");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 140, 60, 20);

        jLabel4.setText("Catedratico");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 190, 70, 20);

        jLabel5.setText("Creditos");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 250, 60, 20);

        jLabel6.setText("Laboratorio");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 80, 60, 20);

        jLabel7.setText("Pre Requisito");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 140, 80, 20);

        jLabel8.setText("Post Requisito");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(290, 200, 80, 20);

        bmodificar.setBackground(new java.awt.Color(0, 255, 0));
        bmodificar.setText("Modificar");
        bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(bmodificar);
        bmodificar.setBounds(210, 290, 130, 50);

        bsalir.setBackground(new java.awt.Color(255, 0, 0));
        bsalir.setText("Salir");
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });
        jPanel1.add(bsalir);
        bsalir.setBounds(380, 290, 130, 50);
        jPanel1.add(bcurso);
        bcurso.setBounds(80, 140, 170, 30);
        jPanel1.add(bcatedratico);
        bcatedratico.setBounds(90, 190, 160, 30);

        bcredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcreditoActionPerformed(evt);
            }
        });
        jPanel1.add(bcredito);
        bcredito.setBounds(80, 240, 180, 30);
        jPanel1.add(blab);
        blab.setBounds(360, 80, 170, 30);

        bpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpreActionPerformed(evt);
            }
        });
        jPanel1.add(bpre);
        bpre.setBounds(370, 140, 160, 30);

        bpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpostActionPerformed(evt);
            }
        });
        jPanel1.add(bpost);
        bpost.setBounds(370, 200, 160, 30);

        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(70, 80, 180, 30);

        bobtener.setBackground(new java.awt.Color(0, 204, 204));
        bobtener.setText("Obtener");
        bobtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobtenerActionPerformed(evt);
            }
        });
        jPanel1.add(bobtener);
        bobtener.setBounds(40, 290, 130, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bcreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcreditoActionPerformed

    private void bpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpreActionPerformed

    private void bpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpostActionPerformed

    private void bobtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bobtenerActionPerformed
        // TODO add your handling code here:
        NodoCurso aux;
        aux = Proyecto2IPC1.curso.primero;
        do {
            if(jComboBox1.getSelectedItem()==aux.ncurso){
                bcurso.setText(aux.curso);
                bcatedratico.setText(aux.catedratico);
                bcredito.setText(aux.creditos);
                blab.setText(aux.laboratorio);
                bpre.setText(aux.pre_requisito);
                bpost.setText(aux.post_requisito);
                
            }
            aux = aux.siguiente;
        } while (aux != Proyecto2IPC1.curso.primero);
    }//GEN-LAST:event_bobtenerActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalirActionPerformed
        // TODO add your handling code here:
        new AdministrarCursos().setVisible(true);
        ModificarCurso.this.dispose();
    }//GEN-LAST:event_bsalirActionPerformed

    private void bmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodificarActionPerformed
        // TODO add your handling code here:
        NodoCurso aux;
        aux = Proyecto2IPC1.curso.primero;
        do {
            if(jComboBox1.getSelectedItem()==aux.ncurso){
                //aux.Apellido=bapellido.getText();
                aux.curso=bcurso.getText();
                aux.catedratico=bcatedratico.getText();
                aux.creditos = bcredito.getText();
                aux.laboratorio=blab.getText();
                aux.pre_requisito=bpre.getText();
                aux.post_requisito=bpost.getText();
                
                JOptionPane.showMessageDialog(null, "Se ha realizado los Cambios con Exito", "Cambios", 1);
            }
            aux = aux.siguiente;
        } while (aux != Proyecto2IPC1.curso.primero);
    }//GEN-LAST:event_bmodificarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bcatedratico;
    private javax.swing.JTextField bcredito;
    private javax.swing.JTextField bcurso;
    private javax.swing.JTextField blab;
    private javax.swing.JButton bmodificar;
    private javax.swing.JButton bobtener;
    private javax.swing.JTextField bpost;
    private javax.swing.JTextField bpre;
    private javax.swing.JButton bsalir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
