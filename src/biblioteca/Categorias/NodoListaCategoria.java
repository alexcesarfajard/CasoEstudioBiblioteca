package biblioteca.Categorias;

public class NodoListaCategoria {

    private DatoListaCategoria dato;
    private NodoListaCategoria next;

    public NodoListaCategoria(DatoListaCategoria dato) {
        this.dato = dato;
    }

    public String toString() {
        return "Nodo {" + " Dato = " + dato + "}";
    }

    public DatoListaCategoria getDato() {
        return dato;
    }

    public void setDato(DatoListaCategoria dato) {
        this.dato = dato;
    }

    public NodoListaCategoria getNext() {
        return next;
    }

    public void setNext(NodoListaCategoria next) {
        this.next = next;
    }
    
}
