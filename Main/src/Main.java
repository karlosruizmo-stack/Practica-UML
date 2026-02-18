import java.util.ArrayList;
import java.util.Scanner;

public class Main   {
    // He hecho una lista de arrays para que me guarde los datos
    static ArrayList<String> nombres = new ArrayList<>();
    static ArrayList<String> telefonos = new ArrayList<>();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- AGENDA DE CONTACTOS ---");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Modificar contacto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> añadirContacto();
                case 2 -> buscarContacto();
                case 3 -> mostrarContactos();
                case 4 -> modificarContacto();
            }
        } while (opcion != 5);
    }

    public static void añadirContacto() {
        System.out.print("Ingrese el nombre: ");
        nombres.add(leer.nextLine());
        System.out.print("Ingrese el teléfono: ");
        telefonos.add(leer.nextLine());
        System.out.println("Guardado.");
    }

    public static void buscarContacto() {
        System.out.print("Nombre a buscar: ");
        String busqueda = leer.nextLine();
        int indice = nombres.indexOf(busqueda);

        if (indice != -1) {
            System.out.println("Teléfono de " + busqueda + ": " + telefonos.get(indice));
        } else {
            System.out.println("No se encontró el contacto.");
        }
    }

    public static void mostrarContactos() {
        if (nombres.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            for (int i = 0; i < nombres.size(); i++) {
                System.out.println(i + ". " + nombres.get(i) + " - " + telefonos.get(i));
            }
        }
    }

    public static void modificarContacto() {
        System.out.print("Nombre del contacto a modificar: ");
        String nombre = leer.nextLine();
        int indice = nombres.indexOf(nombre);

        if (indice != -1) {
            System.out.print("Nuevo teléfono para " + nombre + ": ");
            telefonos.set(indice, leer.nextLine());
            System.out.println("Contacto actualizado.");
        } else {
            System.out.println("El contacto no existe.");
        }
    }
}
