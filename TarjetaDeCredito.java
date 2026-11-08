public class TarjetaDeCredito extends Tarjeta {

    public TarjetaDeCredito(String titular) {
        super(titular);
    }

    @Override
    public double procesarPago(double monto, String dia, boolean esFestivo) {
        int porcentaje = 15;
        double comision = monto * porcentaje / 100;
        double total = monto + comision;
        System.out.println("Credito de " + getTitular() + " | Monto: " + String.format("%.2f", monto)
                + " | Comision: " + porcentaje + "% | Total: " + String.format("%.2f", total));
        return total;
    }
}
