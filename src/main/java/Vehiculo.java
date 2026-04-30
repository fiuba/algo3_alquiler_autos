public abstract class Vehiculo {
    public int calcularBase(int dias) {
        return dias * 500;
    }

    public abstract int calcularPrecio(int dias);
}
