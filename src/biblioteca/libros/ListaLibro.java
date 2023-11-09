package biblioteca.libros;

import biblioteca.libros.Libro;

public class ListaLibro {

    private NodoLibro cabeza;

    public ListaLibro() {
        this.cabeza = null;
    }

    public void nuevoLibro(Libro libro) {

        if (cabeza == null) {
            cabeza = new NodoLibro(libro);
        } else {

            if (libro.getId() < cabeza.getDato().getId()) {

                NodoLibro auxiliar = new NodoLibro(libro);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;

            } else {

                if (cabeza.getSiguiente() == null) {
                    cabeza.setSiguiente(new NodoLibro(libro));
                } else {

                    NodoLibro auxiliar = cabeza;
                    while (auxiliar.getSiguiente() != null
                            && auxiliar.getSiguiente().getDato().getId() < libro.getId()) {
                        auxiliar = auxiliar.getSiguiente();
                    }
                    NodoLibro nuevo = new NodoLibro(libro);
                    nuevo.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(nuevo);
                }
            }
        }
    }

    public String mostrarlibros() {

        String respuesta = "Lista de libros\n\n";

        NodoLibro auxiliar = cabeza;

        if (auxiliar == null) {
            System.out.println("La lista está vacía");
        } else {
            while (auxiliar != null) {
                respuesta += auxiliar.toString() + " \n ";
                auxiliar = auxiliar.getSiguiente();
            }
        }

        return respuesta;
    }

    public String buscarLibro(int id) {
        String respuesta = "";

        NodoLibro auxiliar = cabeza;

        if (auxiliar == null) {
            respuesta += "La lista está vacía";
        } else {
            while (auxiliar != null) {
                
                if (auxiliar.getDato().getId() == id){
                    respuesta += "El libro buscado fue: " + auxiliar.getDato().toString();
                }
                
                auxiliar = auxiliar.getSiguiente();
            }
        }

        return respuesta;
    }

}
