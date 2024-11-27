package POO_Actividad_Integradora2.Egg;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private ArrayList<Libro> misLibros;

    public Persona(){};

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public ArrayList<Libro> getMisLibros() {
        return misLibros;
    }
    
    public void setMisLibros(ArrayList<Libro> misLibros) {
        this.misLibros = misLibros;
    }

    public void agregarLibro(Libro libro){
        this.misLibros.add(libro);
    }

    public void eliminarLibro(Libro libro){
        this.misLibros.remove(libro);
    }
    
}
