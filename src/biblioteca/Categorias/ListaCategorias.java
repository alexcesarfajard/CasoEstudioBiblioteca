package biblioteca.Categorias;

import biblioteca.Categorias.NodoListaCategoria;

public class ListaCategorias {

    NodoListaCategoria cabeza;
    NodoListaCategoria ultimo;

    //Metodo insertar categoria
    public void nuevaCategiria(DatoListaCategoria d) {

        if (cabeza == null) {
            cabeza = new NodoListaCategoria(d);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
        } else {
            if (d.getId() < cabeza.getDato().getId()) {
                NodoListaCategoria aux = new NodoListaCategoria(d);
                aux.setNext(cabeza);
                cabeza = aux;
                ultimo.setNext(cabeza);
            } else {
                if (ultimo.getDato().getId() < d.getId()) {
                    NodoListaCategoria aux = new NodoListaCategoria(d);
                    ultimo.setNext(aux);
                    ultimo = aux;
                    ultimo.setNext(cabeza);
                } else {
                    NodoListaCategoria aux = cabeza;
                    while (aux.getNext().getDato().getId() < d.getId()) {
                        aux = aux.getNext();
                    }
                    NodoListaCategoria temporal = new NodoListaCategoria(d);
                    temporal.setNext(aux.getNext());
                    aux.setNext(temporal);
                }
            }
        }
    }

    public String toString() {
        String resp = "Categorias Registradas\n\n";

        NodoListaCategoria aux = cabeza;

        if (aux != null) {
            resp += aux.toString() + "\n";
            aux = aux.getNext();

            while (aux != cabeza) {
                resp += aux.toString() + "\n";
                aux = aux.getNext();
            }
        } else {
            resp += "No hay categorias registradas";
        }
        return resp;
    }

    public void modificarCategoria(DatoListaCategoria d) {
        if (cabeza != null) {

            if (cabeza != null) {

                if (d.getId() >= cabeza.getDato().getId() && d.getId() <= cabeza.getDato().getId()) {
                    NodoListaCategoria aux = cabeza;

                    while (aux != ultimo && aux.getDato().getId() <= d.getId()) {
                        aux = aux.getNext();
                    }
                    if (aux.getDato().getId() == d.getId()) {
                        aux.getDato().setNombre(d.getNombre());
                    }
                }
            }
        } else {
            System.out.println("No hay categorias registradas");
        }
    }

    public String buscarCategoria(int id) {

        String categoria = "";
        boolean existe = false;

        if (cabeza != null) {

            if (id >= cabeza.getDato().getId()) {

                NodoListaCategoria aux = cabeza;

                while (aux != ultimo) {
                    if (aux.getDato().getId() == id) {
                        categoria += "La categoria buscanda fue: " + aux.getDato().getNombre();
                        existe = true;
                    }
                    aux = aux.getNext();
                }
            }
        } else {
            System.out.println("La lista está vacía");
        }
        
        if(existe == false){
            categoria += "No existe una categoria con ese id";
        }

        return categoria;
    }

}
