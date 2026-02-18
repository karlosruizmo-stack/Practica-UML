import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    ArrayList<Contacto> lista = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void agregar() {
        System.out.print("Nombre: ");
        String n = sc.nextLine();

        System.out.print("Telefono: ");
        String t = sc.nextLine();

        System.out.print("Correo: ");
        String c = sc.nextLine();

        Contacto nuevo = new Contacto(n, t, c);
        lista.add(nuevo);
    }

    public void mostrar() {
        for (Contacto c : lista) {
            c.mostrar();
        }
    }

    public void buscar() {
        System.out.print("Nombre a buscar: ");
        String nombre = sc.nextLine();

        for (Contacto c : lista) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                c.mostrar();
                return;
            }
        }
        System.out.println("No encontrado");
    }

    public void eliminar() {
        System.out.print("Nombre a eliminar: ");
        String nombre = sc.nextLine();
//Esta parte la bsuque por internet.
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equalsIgnoreCase(nombre)) {
                lista.remove(i);
                System.out.println("Eliminado");
                return;
            }
        }
        System.out.println("No existe");
    }
}


