public class TarjetaDeDebito extends Tarjeta {

    public TarjetaDeDebito(String titular) {
        super(titular);
    }

    @Override
    public double procesarPago(double monto, String dia, boolean esFestivo) {
        int porcentaje = 10;
        if (esFestivo || dia.equals("sabado") || dia.equals("domingo")) {
            porcentaje = 0;
        }
        double comision = monto * porcentaje / 100;
        double total = monto + comision;
        System.out.println("Debito de " + getTitular() + " | Monto: " + String.format("%.2f", monto)
                + " | Comision: " + porcentaje + "% | Total: " + String.format("%.2f", total));
        return total;
    }
}
