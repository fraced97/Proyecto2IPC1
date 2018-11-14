
package proyecto2ipc1;


public class Estudiante {

    public Estudiante(String carnet, String dpi, String Nombre, String Apellido, String correo, String direccion, String credito, String contrasena) {
        this.carnet = carnet;
        this.dpi = dpi;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.credito = credito;
        this.contrasena = contrasena;
    }
    String carnet;
    String dpi;
    String Nombre;
    String Apellido;
    String correo;
    String direccion;
    String credito;
    String contrasena;

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
