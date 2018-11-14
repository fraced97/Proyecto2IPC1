package proyecto2ipc1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MostrarEstudiante extends JFrame {

    public MostrarEstudiante() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 600);
        setLocationRelativeTo(null);

        //TABLA
        //COMPONENTES
        JPanel mostrarusuario = new JPanel();
        JButton pregresar = new JButton("Regresar");

        JTable tablamosrarusuario = new JTable();
        DefaultTableModel tablamostrarusuario2 = new DefaultTableModel() {   //no se pueda editar la tabla
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JScrollPane scroll9 = new JScrollPane(tablamosrarusuario);

        //LAYOUT
        this.setLayout(null);
        mostrarusuario.setBounds(0, 0, 900, 600);
        getContentPane().add(mostrarusuario);

        //VISIBILIDAD
        this.setVisible(true);
        mostrarusuario.setLayout(null);
        mostrarusuario.setVisible(true);

        tablamostrarusuario2.addColumn("Carnet");
        tablamostrarusuario2.addColumn("Dpi");
        tablamostrarusuario2.addColumn("Nombre");
        tablamostrarusuario2.addColumn("Apellido");
        tablamostrarusuario2.addColumn("Correo");
        tablamostrarusuario2.addColumn("Direccion");
        tablamostrarusuario2.addColumn("Creditos");
        tablamostrarusuario2.addColumn("Contraseña");
        tablamosrarusuario.setModel(tablamostrarusuario2);
        tablamosrarusuario.setBackground(Color.white);

        scroll9.setBounds(40, 100, 800, 400);
        mostrarusuario.add(scroll9);

        //BOTONES
        pregresar.setBounds(700, 44, 120, 30);
        mostrarusuario.add(pregresar);

        //COLOR
        mostrarusuario.setBackground(Color.cyan);

        pregresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdministrarEstudiantes administrador = new AdministrarEstudiantes();
                administrador.setVisible(true);
                MostrarEstudiante.this.dispose();
            }
        });
        ////Se ingresan datos a la Tabla
        NodoEstudiante actual = new NodoEstudiante();
        actual = Proyecto2IPC1.estudiante.primero;
        do {

            String mostrar[] = {actual.carnet, actual.dpi, actual.Nombre, actual.Apellido, actual.correo,
                actual.direccion, actual.credito, actual.contrasena};
            tablamostrarusuario2.addRow(mostrar);
            actual = actual.siguiente;
        } while (actual != Proyecto2IPC1.estudiante.primero);

        tablamosrarusuario.setModel(tablamostrarusuario2);
        ////////////////////////////////////////////////////////
    }

}
