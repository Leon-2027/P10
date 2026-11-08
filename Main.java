import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tarjeta> tarjetas = new ArrayList<>();
        tarjetas.add(new TarjetaDeDebito("Ana"));
        tarjetas.add(new TarjetaDeCredito("Luis"));
        tarjetas.add(new TarjetaDeDebito("Marta"));
        tarjetas.add(new TarjetaDeCredito("Sofia"));

        System.out.println("--- Miercoles ---");
        procesarTodas(tarjetas, 1000, "miercoles", false);

        System.out.println("\n--- Sabado ---");
        procesarTodas(tarjetas, 1000, "sabado", false);

        System.out.println("\n--- Dia festivo (miercoles) ---");
        procesarTodas(tarjetas, 1000, "miercoles", true);
    }

    static void procesarTodas(ArrayList<Tarjeta> lista, double monto, String dia, boolean esFestivo) {
        for (Tarjeta t : lista) {
            t.procesarPago(monto, dia, esFestivo);
        }
    }
}
