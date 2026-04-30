public class Cabana extends Inmueble {
    private int inquilinos;

    public Cabana(int inquilinos) {
        this.inquilinos = inquilinos;
    }

    @Override
    public int calcularPrecio(int dias) {
        return dias * (inquilinos * inquilinos);
    }
}
