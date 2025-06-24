public class P02AlquilerPeliculasEjecutor {
    public static void main(String[] args) {
        DVD dvd = new DVD("Matrix", "Wachowski", 1999, "Español/Inglés", 4.7);
        VHS vhs = new VHS("Titanic", "Cameron", 1997, "Inglés", "Magnetica tipo I");

        System.out.println(dvd + " - Precio: $" + dvd.calcularPrecio());
        System.out.println(vhs + " - Precio: $" + vhs.calcularPrecio());
    }
}
