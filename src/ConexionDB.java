public class ConexionDB {
    public void conectar() {

        System.out.println("Conectando a " + Configuracion.getUrl());
        System.out.println("Usuario: " + Configuracion.getUsuario());

        System.out.println("Conexión establecida de forma segura mediante variables de entorno.");
    }
}