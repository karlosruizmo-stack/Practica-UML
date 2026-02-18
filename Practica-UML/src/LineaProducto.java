public class LineaProducto {
    private Producto producto;
    private int cantidad;
    private double precioTotal;

    public LineaProducto(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioTotal = producto.getPrecio() * cantidad;
    }

    public double getPrecioTotal() { return precioTotal; }


    public String toString() {
        return cantidad + "x " + producto.getNombre() + " (Subtotal: $" + precioTotal + ")";
    }
}
