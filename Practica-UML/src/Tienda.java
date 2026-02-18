import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Producto> productos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        Tienda miTienda = new Tienda();
        miTienda.inicializarDatos();
        miTienda.mostrarEstado();
    }

    public void inicializarDatos() {
        // Crear Productos
        Producto p1 = new Producto("Laptop", 1200.0, 10);
        Producto p2 = new Producto("Mouse", 25.0, 50);
        productos.add(p1);
        productos.add(p2);

        // Creamos cliente
        Cliente c1 = new Cliente("Ana Garcia", "ana@email.com", "Calle Falsa 123");
        clientes.add(c1);

        // Aqui el cliente crea el pedido
        Pedido ped1 = new Pedido("18/02/2026", c1);
        ped1.agregarLinea(p1, 1);
        ped1.agregarLinea(p2, 2);
        pedidos.add(ped1);
    }

    public void mostrarEstado() {
        System.out.println("--- PRODUCTOS EN TIENDA ---");
        productos.forEach(System.out::println);

        System.out.println("\n--- CLIENTES REGISTRADOS ---");
        clientes.forEach(System.out::println);

        System.out.println("\n--- HISTORIAL DE PEDIDOS ---");
        pedidos.forEach(System.out::println);
    }
}
