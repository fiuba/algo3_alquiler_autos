public class Camion extends Vehiculo {
    private int pma;

    public Camion(int pma) {
        this.pma = pma;
    }

    @Override
    public int calcularPrecio(int dias) {
        return calcularBase(dias) + (300 * pma);
    }
}