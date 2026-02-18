import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main agenda = new Main();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== AGENDA DE CONTACTOS =====");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Modificar contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Salir");
            System.out.print("Opcion: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    agenda.agregarContacto();
                    break;
                case 2:
                    agenda.mostrarContactos();
                    break;
                case 3:
                    agenda.buscarContacto();
                    break;
                case 4:
                    agenda.modificarContacto();
                    break;
                case 5:
                    agenda.eliminarContacto();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida\n");
            }

        } while (opcion != 6);
    }

    private void agregarContacto() {
    }

    private void mostrarContactos() {

    }

    private void modificarContacto() {

    }

    private void eliminarContacto() {

    }

    private void buscarContacto() {

    }
}

