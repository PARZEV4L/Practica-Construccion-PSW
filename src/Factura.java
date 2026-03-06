public class Factura {

    private static final double DESCUENTO_VIP = 0.20;
    private static final double DESCUENTO_NORMAL = 0.05;
    private static final double DESCUENTO_EMPLEADO = 0.30;
    private static final double DESCUENTO_EXTRA = 50000;
    private static final double UMBRAL_VOLUMEN = 1000000;

    public double calcular(double precio, int cantidad, String tipoCliente) {

        double total = precio * cantidad;

        switch (tipoCliente.toUpperCase()) {
            case "VIP":
                total -= (total * DESCUENTO_VIP);
                break;
            case "NORMAL":
                total -= (total * DESCUENTO_NORMAL);
                break;
            case "EMPLEADO":
                total -= (total * DESCUENTO_EMPLEADO);
                break;
            default:
                System.out.println("Tipo de cliente no reconocido.");
                break;
        }

        if (total > UMBRAL_VOLUMEN) {
            total -= DESCUENTO_EXTRA;
        }

        System.out.println("El total es: " + total);
        return total;
    }
}