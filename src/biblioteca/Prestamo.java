package biblioteca;

public class Prestamo {

    private int id;
    private int idlibro;
    private String fechainicial;
    private String fechafinal;
    private int idpersona;
    private String nombrepersona;
    private String telefono;

    public Prestamo() {
    }

    public Prestamo(int id, int idlibro, String fechainicial, String fechafinal, int idpersona, String nombrepersona, String telefono) {
        this.id = id;
        this.idlibro = idlibro;
        this.fechainicial = fechainicial;
        this.fechafinal = fechafinal;
        this.idpersona = idpersona;
        this.nombrepersona = nombrepersona;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdlibro() {
        return idlibro;
    }

    public void setIdlibro(int idlibro) {
        this.idlibro = idlibro;
    }

    public String getFechainicial() {
        return fechainicial;
    }

    public void setFechainicial(String fechainicial) {
        this.fechainicial = fechainicial;
    }

    public String getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(String fechafinal) {
        this.fechafinal = fechafinal;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombrepersona() {
        return nombrepersona;
    }

    public void setNombrepersona(String nombrepersona) {
        this.nombrepersona = nombrepersona;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Prestamo {" + " id = " + id + ", id libro = " + idlibro + ", Fecha prestamo = " + fechainicial
                + ", Fecha devolucion = " + fechafinal + ", id persona = " + idpersona + ", nombre = " + nombrepersona
                + ", telefono = " + telefono + '}';
    }

}
