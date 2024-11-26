package bibliotecaIntegrador;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;

        Biblioteca biblioteca = new Biblioteca();

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
                    System.out.println("\nSaliendo... \n");
                    break;

                default:
                    System.out.println("\nSeleccione una opción correcta... \n");
                    break;
            }
            
        } while (opcion != 3);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.print("""

                Menu:
                1. Agregar libro
                2. Mostrar información de los libros
                3. Salir

                Opcion: 
                """);
    }
}
