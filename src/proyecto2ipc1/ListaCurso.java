package proyecto2ipc1;

public class ListaCurso {

    NodoCurso primero;
    NodoCurso ultimo;

    public ListaCurso() {
        primero = null;
        ultimo = null;
    }

    public boolean vacio() {
        boolean condicion;
        condicion = false;
        NodoCurso aux;
        aux = primero;
        do {
            if (primero == null) {
                condicion = false;
            } else {
                condicion = true;
            }
        } while (aux != primero);

        return condicion;
    }

    public void agregarCurso(String ncurso, String curso, String catedratico, String creditos, String laboratorio, String Seccion, String pre_requisito, String post_requisito) {
        NodoCurso nuevo = new NodoCurso();
        nuevo.ncurso = ncurso;
        nuevo.curso = curso;
        nuevo.catedratico = catedratico;
        nuevo.creditos = creditos;
        nuevo.laboratorio = laboratorio;
        nuevo.seccion = Seccion;
        nuevo.pre_requisito = pre_requisito;
        nuevo.post_requisito = post_requisito;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            //nuevo.anterior=ultimo; 
            ultimo = nuevo;

        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            //nuevo.anterior=ultimo;
            ultimo = nuevo;
            // primero.anterior=ultimo;

        }

    }

    public boolean EliminarCurso(String dato) {
        NodoCurso actual;
        boolean condicion = false;
        actual = ultimo;
        while (actual.siguiente != ultimo && !condicion) {
            condicion = (actual.siguiente.ncurso.equals(dato));
            if (!condicion) {
                actual = actual.siguiente;
            }
        }
        condicion = (actual.siguiente.ncurso.equals(dato));
        if (condicion) {
            NodoCurso aux = actual.siguiente;
            
                actual.siguiente = aux.siguiente;
            
            aux = null;
        }
        return condicion == true;
    }

    public boolean CursoExiste() {
        boolean condicion = true;
        NodoCurso aux = new NodoCurso();
        aux = primero;

        if (aux == null) {
            condicion = true;
        } else {
            do {
                if (AgregarCursos.txtcodigo.getText().equals(aux.ncurso)) {

                    condicion = false;
                }
                aux = aux.siguiente;
            } while (aux != primero);
        }

        return condicion;
    }
}
