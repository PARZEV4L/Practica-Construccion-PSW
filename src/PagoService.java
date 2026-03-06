public class PagoService {
    public void procesarPago(double monto) {

        if (monto <= 0) {
            throw new IllegalArgumentException("Monto inválido. Debe ser mayor a 0.");
        }

        System.out.println("Procesando pago de: " + monto);

        try {

        } catch (ArithmeticException e) {

            System.err.println("Error interno procesando la transacción: " + e.getMessage());
        }
    }
}