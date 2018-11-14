
package proyecto2ipc1;


public class Curso {
    int nCurso;

    public Curso(int nCurso, String catedratico, String creditos, String laboratorio, String preRequisito, String PostRequisito) {
        this.nCurso = nCurso;
        this.catedratico = catedratico;
        this.creditos = creditos;
        this.laboratorio = laboratorio;
        this.preRequisito = preRequisito;
        this.PostRequisito = PostRequisito;
    }
    String catedratico;
    String creditos;
    String laboratorio;
    String preRequisito;;
    String PostRequisito;

    public int getnCurso() {
        return nCurso;
    }

    public void setnCurso(int nCurso) {
        this.nCurso = nCurso;
    }

    public String getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(String catedratico) {
        this.catedratico = catedratico;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getPreRequisito() {
        return preRequisito;
    }

    public void setPreRequisito(String preRequisito) {
        this.preRequisito = preRequisito;
    }

    public String getPostRequisito() {
        return PostRequisito;
    }

    public void setPostRequisito(String PostRequisito) {
        this.PostRequisito = PostRequisito;
    }
}
