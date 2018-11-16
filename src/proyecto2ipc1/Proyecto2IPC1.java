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

public class Proyecto2IPC1 {

    /**
     * @param args the command line arguments
     */
   
    public static ListaDCEstudiante estudiante = new ListaDCEstudiante();
    public static ListaCurso curso = new ListaCurso();
    public static void main(String[] args) {
        // TODO code application logic here
        MenuPrincipal menu = new MenuPrincipal("Menu");
        menu.setVisible(true);
       // new MenuPrincipal("Menu").setVisible(true);
    }
    
}
