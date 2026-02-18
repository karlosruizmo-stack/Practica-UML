public class Contacto {

    private String nombre;
    private String telefono;
    private String correo;

    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Correo: " + correo);
        System.out.println("-------------------------");
    }

    public void modificar(String nombre, String telefono, String correo) {
        if (!nombre.isEmpty()) this.nombre = nombre;
        if (!telefono.isEmpty()) this.telefono = telefono;
        if (!correo.isEmpty()) this.correo = correo;
    }
}
