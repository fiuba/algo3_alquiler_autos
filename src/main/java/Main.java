public class Main {
    public static void main(String[] args) {

        // Caso 1: BMW premium
        Coche coche = new Coche(5, true);
        int precioCoche = coche.calcularPrecio(2);
        System.out.println("Precio coche: " + precioCoche);

        // Caso 2: Camión
        Camion camion = new Camion(1000);
        int precioCamion = camion.calcularPrecio(10);
        System.out.println("Precio camion: " + precioCamion);


        // Inmuebles

        Cabana cabana = new Cabana(4);
        System.out.println("Precio cabaña: " + cabana.calcularPrecio(3));

        Departamento depto = new Departamento(50);
        System.out.println("Precio departamento: " + depto.calcularPrecio(2));

        HabitacionHotel hotel = new HabitacionHotel(2);
        System.out.println("Precio hotel: " + hotel.calcularPrecio(3));
    }
}