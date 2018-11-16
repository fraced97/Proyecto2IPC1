
package proyecto2ipc1;


public class NodoCurso {
    
    String ncurso;          
    String curso;           
    String catedratico;             
    String creditos;
    String laboratorio;
    String seccion;
    String pre_requisito;
    String post_requisito;
        
    NodoCurso siguiente;
    
    public NodoCurso(){
    siguiente=this;
    }
    
}
