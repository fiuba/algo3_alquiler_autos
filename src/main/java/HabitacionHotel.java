public class HabitacionHotel extends Inmueble {
    private int camas;

    public HabitacionHotel(int camas) {
        this.camas = camas;
    }

    @Override
    public int calcularPrecio(int dias) {
        return camas * (dias + 500);
    }
}
