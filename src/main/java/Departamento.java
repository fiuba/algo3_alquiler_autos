public class Departamento extends Inmueble {
    private int metrosCuadrados;

    public Departamento(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public int calcularPrecio(int dias) {
        return metrosCuadrados * dias;
    }
}
