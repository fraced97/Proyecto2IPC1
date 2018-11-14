
package proyecto2ipc1;


public class ListaDCEstudiante {
    NodoEstudiante primero;
    NodoEstudiante ultimo;
    static int contador;
    
    public ListaDCEstudiante(){
        primero = null;
        ultimo=null;
        contador=0;
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
        nuevo.contrasena=contrasena;
        
        if(primero==null){
            primero=nuevo;
            primero.siguiente=primero;
            nuevo.anterior=ultimo; 
            ultimo=nuevo;
            contador++;
            
        }else{
        ultimo.siguiente=nuevo;
        nuevo.siguiente=primero;
        nuevo.anterior=ultimo;
        ultimo=nuevo;
        primero.anterior=ultimo;
        contador++;
    }
        
    }
    
    public void MostrarEstudiantes(){
        NodoEstudiante actual = new NodoEstudiante();
        actual=primero;
        do{
            //agregar en una tabla
            System.out.println(actual.carnet+"  ---  "+actual.Nombre+"  ---   "+actual.contrasena);
            actual=actual.siguiente;
        }while(actual!=primero);
            
    
    }
    
    public void EliminarEstudiante(){
        NodoEstudiante primera_posicion = new NodoEstudiante();
        NodoEstudiante anterior = new NodoEstudiante();
        primera_posicion=primero;
        anterior=ultimo;
        do{
            anterior=primera_posicion;
            primera_posicion=primera_posicion.siguiente;
        }while(primera_posicion!=primero);
        
        
    }
    
    /*public void ModificarEstudiante(String c){
        NodoEstudiante posicion = new NodoEstudiante();
        posicion=primero;
        do{
            if(posicion.carnet==c){
                
            }
            posicion=posicion.siguiente;
        }while(posicion!=primero);
    }*/
    
    public boolean CDPIExiste(){
        boolean condicion = true;
        NodoEstudiante aux = new NodoEstudiante();
        aux=primero;
        
        if(aux==null){
            condicion=true;
        }else{
             do{
            if(AgregarEstudiante.txtcarnet.getText().equals(aux.carnet)
                    ||AgregarEstudiante.txtdpi.getText().equals(aux.dpi)){
                
                condicion=false;
            }
            aux=aux.siguiente;
        }while(aux!=primero);
        }
       
        
        return condicion;
    }
}
