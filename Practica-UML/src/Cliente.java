public class Cliente {
    private String nombre;
    private String email;
    private String direccion;

    public Cliente(String nombre, String email, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + " | Email: " + email;
    }
}
