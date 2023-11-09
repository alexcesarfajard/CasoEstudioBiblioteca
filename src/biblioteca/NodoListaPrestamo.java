package biblioteca;

public class NodoListaPrestamo {

    private Prestamo dato;
    private NodoListaPrestamo anterior;
    private NodoListaPrestamo siguiente;

    public NodoListaPrestamo() {

    }

    public NodoListaPrestamo(Prestamo dato) {
        this.dato = dato;
    }

    public Prestamo getDato() {
        return dato;
    }

    public void setDato(Prestamo dato) {
        this.dato = dato;
    }

    public NodoListaPrestamo getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaPrestamo anterior) {
        this.anterior = anterior;
    }

    public NodoListaPrestamo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaPrestamo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "" + this.dato;
    }
 
}
