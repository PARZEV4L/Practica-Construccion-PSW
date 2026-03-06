public class Usuario {

    private String nombre;
    private String correo;
    private String contrasena;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public void guardarUsuario() {
        System.out.println("Conectando a la base de datos...");
        System.out.println("INSERT INTO usuarios VALUES('" + nombre + "','" + correo + "')");
        System.out.println("Usuario guardado correctamente.");
    }

    public void enviarCorreoBienvenida() {
        System.out.println("Enviando correo de bienvenida a: " + correo);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }
}