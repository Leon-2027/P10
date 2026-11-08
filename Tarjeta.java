public class Tarjeta {
    private String titular;

    public Tarjeta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double procesarPago(double monto, String dia, boolean esFestivo) {
        return monto;
    }
}
