public class CalculadoraSalario {
    private static final int HORAS_BASE = 160;

    public double salarioDesarrollador(double horas) {
        return calcularSalarioBase(horas, 50000, 75000);
    }

    public double salarioDisenador(double horas) {
        return calcularSalarioBase(horas, 40000, 60000);
    }

    public double salarioTester(double horas) {
        return calcularSalarioBase(horas, 30000, 45000);
    }

    private double calcularSalarioBase(double horas, double tarifaNormal, double tarifaExtra) {
        double total = horas * tarifaNormal;
        if (horas > HORAS_BASE) {
            total += (horas - HORAS_BASE) * tarifaExtra;
        }
        return total;
    }
}
