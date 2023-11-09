package biblioteca.Categorias;

public class DatoListaCategoria {
    
    private int id;
    private String nombre;

    public DatoListaCategoria() {
    }

    public DatoListaCategoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Categoria {" + "id = " + id + ", nombre = " + nombre + '}';
    }
}
