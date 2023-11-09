package biblioteca.libros;

import biblioteca.libros.Libro;

public class NodoLibro {

    private Libro dato;
    private NodoLibro siguiente;

    public NodoLibro(Libro dato) {
        this.dato = dato;
    }

    public Libro getDato() {
        return dato;
    }

    public void setDato(Libro dato) {
        this.dato = dato;
    }

    public NodoLibro getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLibro siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return this.dato.toString();
    }
}
