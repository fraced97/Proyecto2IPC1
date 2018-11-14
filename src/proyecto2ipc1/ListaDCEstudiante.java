
package proyecto2ipc1;


public class ListaDCEstudiante {
    NodoEstudiante primero;
    NodoEstudiante ultimo;
    
    public ListaDCEstudiante(){
        primero = null;
        ultimo=null;
    }
    
    public void IngresarEstudiante(String carnet,String dpi,String Nombre, String Apellido,String correo,String direccion,String credito,String contrasena){
        NodoEstudiante nuevo = new NodoEstudiante();
        nuevo.carnet=carnet;
        nuevo.dpi=dpi;
        nuevo.Nombre=Nombre;
        nuevo.Apellido=Apellido;
        nuevo.correo=correo;
        nuevo.direccion=direccion;
        nuevo.credito=credito;
        
        if(primero==null){
            primero=nuevo;
            primero.siguiente=primero;
            nuevo.anterior=ultimo; 
            ultimo=nuevo;
            
        }else{
        ultimo.siguiente=nuevo;
        nuevo.siguiente=primero;
        nuevo.anterior=ultimo;
        ultimo=nuevo;
        primero.anterior=ultimo;
    }
        
    }
    
    public void MostrarEstudiantes(){
        NodoEstudiante actual = new NodoEstudiante();
        actual=primero;
        do{
            //agregar en una tabla
            System.out.println(actual.carnet+" ---  "+actual.Nombre);
            actual=actual.siguiente;
        }while(actual!=primero);
            
    
    }
    
    public void EliminarEstudiante(){
        
    }
    
    public void ModificarEstudiante(String c){
        NodoEstudiante posicion = new NodoEstudiante();
        posicion=primero;
        do{
            if(posicion.carnet==c){
                
            }
            posicion=posicion.siguiente;
        }while(posicion!=primero);
    }
}
