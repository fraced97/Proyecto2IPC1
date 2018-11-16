
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


public class MostrarCurso extends JFrame{
    
    
    public MostrarCurso(String title){
        super(title);
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

        tablamostrarusuario2.addColumn("Codigo");
        tablamostrarusuario2.addColumn("Curso");
        tablamostrarusuario2.addColumn("Catedratico");
        tablamostrarusuario2.addColumn("Creditos");
        tablamostrarusuario2.addColumn("Laboratorio");
        tablamostrarusuario2.addColumn("Pre Requisito");
        tablamostrarusuario2.addColumn("Post Requisito");
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
                AdministrarCursos administrador = new AdministrarCursos();
                administrador.setVisible(true);
                MostrarCurso.this.dispose();
            }
        });
        ////Se ingresan datos a la Tabla
        NodoCurso actual = new NodoCurso();
        actual = Proyecto2IPC1.curso.primero;
        do {

            String mostrar[] = {actual.ncurso, actual.curso, actual.catedratico , actual.creditos,
                actual.laboratorio, actual.pre_requisito, actual.post_requisito};
            tablamostrarusuario2.addRow(mostrar);
            actual = actual.siguiente;
        } while (actual != Proyecto2IPC1.curso.primero);

        tablamosrarusuario.setModel(tablamostrarusuario2);
    }
}
