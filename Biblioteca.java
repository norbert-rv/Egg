package POO_Actividad_Integradora2.Egg;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> catalogo = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        System.out.println("\nAgregando libro al catálogo...\n");

        catalogo.add(libro);

        catalogo.sort((libro1, libro2) -> { return  libro1.compareTo(libro2); });
    }

    public int tamanioCatalogo() {
        return catalogo.size();
    }
    
    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Libro> catalogo) {
        this.catalogo = catalogo;
    }

    public void prestarLibro(Libro libro, Persona usuario){
        //cambiamos el estado del libro
        libro.setPrestado(true);
        //agremos ese libro en la lista personal del usuario
        usuario.agregarLibro(libro);
    }
}
