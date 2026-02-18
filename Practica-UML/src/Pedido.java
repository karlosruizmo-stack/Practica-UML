import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String fecha;
    private Cliente cliente;
    private List<LineaProducto> lineas;
    private double costeTotal;

    public Pedido(String fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.lineas = new ArrayList<>();
        this.costeTotal = 0;
    }

    public void agregarLinea(Producto p, int cantidad) {
        LineaProducto linea = new LineaProducto(p, cantidad);
        lineas.add(linea);
        calcularCosteTotal();
    }

    private void calcularCosteTotal() {
        costeTotal = 0;
        for (LineaProducto l : lineas) {
            costeTotal += l.getPrecioTotal();
        }
    }
    // Delimitación de producto a nivel caracteristico
    public String toString() {
        return "Pedido de " + cliente + " | Fecha: " + fecha + " | TOTAL: $" + costeTotal;
    }
}