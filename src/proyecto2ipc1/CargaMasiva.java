package proyecto2ipc1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import static proyecto2ipc1.AgregarEstudiante.txtcarnet;
import static proyecto2ipc1.AgregarEstudiante.txtdpi;

public class CargaMasiva extends JFrame {

    JFileChooser seleccionararchivo = new JFileChooser();
    File archivo;

    public CargaMasiva() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 600);

        setLocationRelativeTo(null);
        //TABLA
        //COMPONENTES
        JPanel mostrarusuario = new JPanel();
        JButton pregresar = new JButton("Regresar");
        JButton pcargar = new JButton("Cargar");
        JButton pgenerar = new JButton("Generar");

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
        //tablamostrarusuario2.addColumn("Apellido");
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
        pcargar.setBounds(100, 44, 120, 30);
        mostrarusuario.add(pcargar);
        pgenerar.setBounds(350, 44, 120, 30);
        mostrarusuario.add(pgenerar);

        //COLOR
        mostrarusuario.setBackground(Color.cyan);

        pregresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdministrarEstudiantes administrador = new AdministrarEstudiantes();
                administrador.setVisible(true);
                CargaMasiva.this.dispose();
            }
        });
        pcargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                seleccionararchivo.setFileFilter(new FileNameExtensionFilter("todos los archivos *.ipc_e", "ipc_e", "IPC_E"));
                int abrir = seleccionararchivo.showDialog(null, "Abrir");
                if (abrir == JFileChooser.APPROVE_OPTION) {
                    String PATH = seleccionararchivo.getSelectedFile().getAbsolutePath();
                    if (PATH.endsWith(".ipc_e") || PATH.endsWith(".IPC_E")) {
                        archivo = seleccionararchivo.getSelectedFile();
                        leer_archivo(archivo);

                    } else {
                        System.out.println("No es ipc_e");
                    }
                }
            }
        });

        pgenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NodoEstudiante actual = new NodoEstudiante();
                actual = Proyecto2IPC1.estudiante.primero;
                do {

                    String mostrar[] = {actual.carnet, actual.dpi, actual.Nombre, actual.correo,
                        actual.direccion, actual.credito, actual.contrasena};
                    tablamostrarusuario2.addRow(mostrar);
                    actual = actual.siguiente;
                } while (actual != Proyecto2IPC1.estudiante.primero);

                tablamosrarusuario.setModel(tablamostrarusuario2);

            }
        });

        
    }

    public void leer_archivo(File archivo2) {
        FileReader FR = null;
        BufferedReader BR = null;

        String linea;
        //String Random;
        
        try {
            String datos[];
            String contra;
            //int contador = 0;
            FR = new FileReader(archivo);
            BR = new BufferedReader(FR);
            while ((linea = BR.readLine()) != null) {
                datos = linea.split("\\;");

               
               
                    //Random=String.valueOf(random());
                    //datos[datos.length-1]=String.valueOf(random());
                    contra=String.valueOf(random());
                    System.out.println(datos[datos.length-1]+" "+datos.length);
                   // datos[6]=Random;
                   if(datos.length==6){
                        Proyecto2IPC1.estudiante.IngresarEstudiante(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[0]+contra);
                   }
                   

                 
                  
            }

        } catch (IOException e) {

        }

    }
    public int random() {

        int numero;

        numero = (int) (Math.random() * (151 - 50) + 50);

        return numero;

    }

}
