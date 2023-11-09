package biblioteca;

public class ListaPrestamo {

    private NodoListaPrestamo cabeza;
    private NodoListaPrestamo ultimo;

    public void nuevoPrestamo(Prestamo p) {

        if (cabeza == null) {
            cabeza = new NodoListaPrestamo(p);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
            ultimo.setAnterior(ultimo);
        } else {
            if (cabeza.getDato().getId() > p.getId()) {
                NodoListaPrestamo aux = new NodoListaPrestamo(p);

                aux.setSiguiente(cabeza);
                cabeza = aux;
                ultimo.setSiguiente(cabeza);
                cabeza.setAnterior(ultimo);
            } else {
                if (p.getId() > ultimo.getDato().getId()) {
                    ultimo.setSiguiente(new NodoListaPrestamo(p));
                    ultimo = ultimo.getSiguiente();
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAnterior(ultimo);
                } else {
                    NodoListaPrestamo aux = cabeza;

                    while (aux.getSiguiente().getDato().getId() < p.getId()) {
                        aux = aux.getSiguiente();
                    }

                    NodoListaPrestamo temp = new NodoListaPrestamo(p);
                    temp.setSiguiente(aux.getSiguiente());
                    temp.setAnterior(temp);
                    aux.setSiguiente(temp);
                    temp.getSiguiente().setAnterior(temp);
                }
            }
        }
    }

    public String mostrarPrestamos() {
        String respuesta = "Prestamos realizados en la biblioteca \n";

        if (cabeza != null) {
            NodoListaPrestamo aux = cabeza;

            respuesta += aux.toString() + "\n";
            aux = aux.getSiguiente();

            while (aux != cabeza) {
                respuesta += aux.toString() + "\n";
                aux = aux.getSiguiente();
            }

        } else {
            respuesta += "La lista está vacía";
        }

        return respuesta;
    }

}
