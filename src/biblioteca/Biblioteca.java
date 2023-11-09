package biblioteca;

import biblioteca.libros.ListaLibro;
import biblioteca.libros.Libro;
import biblioteca.Categorias.DatoListaCategoria;
import biblioteca.Categorias.ListaCategorias;

public class Biblioteca {

    public static void main(String[] args) {

        //System.out.println("Hello World");
        ListaCategorias categorias = new ListaCategorias();
        ListaLibro libros = new ListaLibro();
        ListaPrestamo prestamos = new ListaPrestamo();

        /*
        //insertando categorias
        categorias.nuevaCategiria(new DatoListaCategoria(1, "Accion"));
        categorias.nuevaCategiria(new DatoListaCategoria(2, "Romance"));
        categorias.nuevaCategiria(new DatoListaCategoria(3, "Novelas"));
        categorias.nuevaCategiria(new DatoListaCategoria(4, "Ciencia"));
        categorias.nuevaCategiria(new DatoListaCategoria(5, "Misterio"));
        
        //mostrando categorias
        System.out.println(categorias.toString());
        
        //modificando categoria
        categorias.modificarCategoria(new DatoListaCategoria(2, "Romance"));
        
        System.out.println(categorias.toString());
        
        //Buscando una categoria por id
        System.out.println(categorias.buscarCategoria(1));
        
                
        //insertando libros
        libros.nuevoLibro(new Libro(1, "La revolucion", "Pepito", "Editorial", 1));
        libros.nuevoLibro(new Libro(2, "La odisea", "Juanito", "Editorial", 1));
        libros.nuevoLibro(new Libro(3, "Hacia un mundo nuevo", "Sutanito", "Editorial", 1));
        libros.nuevoLibro(new Libro(4, "La esposa del viajero en el tiempo",
                "Sutanito", "Editorial", 2));
        libros.nuevoLibro(new Libro(5, "Orgullo y prejuicio", "Juanito", "Editorial", 2));
        libros.nuevoLibro(new Libro(6, "Cien años de soledad", "Juanito", "Editorial", 3));
        
        //mostrando libros
        System.out.println(libros.mostrarlibros());
        
        //Buscando libro por id
        System.out.println(libros.buscarLibro(1));
         */
        prestamos.nuevoPrestamo(new Prestamo(1, 2, "08/10/2023", "18/10/2023", 1, "Alex", "88776655"));
        prestamos.nuevoPrestamo(new Prestamo(2, 3, "08/10/2023", "18/10/2023", 2, "Alex", "88776655"));
        
        System.out.println(prestamos.mostrarPrestamos());
    }

}
