package POO_Actividad_Integradora2.Egg;

import java.util.ArrayList;
import java.util.Scanner;

import javax.crypto.AEADBadTagException;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;

        Biblioteca biblioteca = new Biblioteca();
        ArrayList<Persona> usuarios = new ArrayList<>();

        do {
            mostrarMenu();
            opcion = Integer.valueOf(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("\nAgregando libro... \n");
                    System.out.print("\nIngrese el título: ");
                    String titulo = sc.nextLine();

                    System.out.print("\nIngrese el nombre del autor: ");
                    String nombre = sc.nextLine();

                    System.out.print("\nIngrese el número de páginas: ");
                    int nroPaginas = Integer.valueOf(sc.nextLine());

                    biblioteca.agregarLibro(new Libro(titulo, nombre, nroPaginas));

                    System.out.println("\nLibro agregado al catálogo... \n");
                    break;
                
                case 2:
                    System.out.println("\nMostrando información de todos los libros... \n");
                    for (Libro libro : biblioteca.getCatalogo()) {
                        libro.mostrarInformacion();
                        System.out.println("-------------------");
                    }
                    break;

                case 3:
                    //mostarr la lista de libros que se pueden prestar
                    System.out.println("\nMostrando información de todos los libros disponibles.. \n");
                    for (Libro libro : biblioteca.getCatalogo()) {
                        if(!libro.isPrestado()){
                            System.out.println("Libro n° - " + (biblioteca.getCatalogo().indexOf(libro)+1));
                            libro.mostrarInformacion();
                            System.out.println("-------------------");
                        }
                    }

                    
                    //ingrese el nombre del usuario para prestale el libro
                    if(usuarios.isEmpty()){
                        System.out.println("No hay usuarios para prestar libros");
                    }else{
                        System.out.println("Ingrese su nombre: ");
                        String nombreUsuario = sc.nextLine();
                        System.out.println("Escribe el indice del libro: ");
                        //escoger con el indice el libro que quiero
                        int indiceLibro = Integer.valueOf(sc.nextLine());
                        //ciclo para encontrar suuario
                        for (Persona p : usuarios) {
                            if(p.getNombre().equals(nombreUsuario)){
                                p.agregarLibro(biblioteca.getCatalogo().get(indiceLibro-1));
                            }
                        }
                        //dar notificación
                        System.out.println("Libro agregado correctamente...");
                    }
                    break;
                case 4:
                    System.out.println("\nSaliendo... \n");
                    break;
                case 5:
                    System.out.println("Ingrese su nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese su apellido: ");
                    String apellido = sc.nextLine();
                    //agregar usuario
                    usuarios.add(new Persona(nombre, apellido));
                    //notificación
                    System.out.println("Usuario creado correctamente!");
                    break;
                case 6:
                    System.out.println("\nSaliendo... \n");
                    break;
                default:
                    System.out.println("\nSeleccione una opción correcta... \n");
                    break;
            }
            
        } while (opcion != 6);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.print("""

                Menu:
                1. Agregar libro
                2. Mostrar información de los libros
                3. Prestar libro
                4. Devolver libro
                5. Crear usuario
                6. Salir

                Opcion: 
                """);
    }
}
