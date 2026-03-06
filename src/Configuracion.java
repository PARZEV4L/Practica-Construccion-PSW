public class Configuracion {

    public static String getUrl() {
        return System.getenv("DB_URL");
    }

    public static String getUsuario() {
        return System.getenv("DB_USER");
    }

    public static String getPassword() {
        return System.getenv("DB_PASSWORD");
    }
}
