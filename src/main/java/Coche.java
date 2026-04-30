public class Coche extends Vehiculo {
    private int plazas;
    private boolean premium;

    public Coche(int plazas, boolean premium) {
        this.plazas = plazas;
        this.premium = premium;
    }

    @Override
    public int calcularPrecio(int dias) {
        int total = calcularBase(dias);
        if (premium) {
            total += plazas * 150;
        }
        return total;
    }
}
