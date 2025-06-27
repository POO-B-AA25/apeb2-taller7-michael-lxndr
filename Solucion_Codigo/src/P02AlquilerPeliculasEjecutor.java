import java.util.*;

public class P02AlquilerPeliculasEjecutor {
    public static void main(String[] args) {
        // Crear DVDs
        List<String> idiomasDVD1 = Arrays.asList("Español", "Inglés", "Francés");
        Pelicula dvd1 = new DVD("Matrix", "Wachowski", 1999, idiomasDVD1, 4.7);

        List<String> idiomasDVD2 = Arrays.asList("Español", "Portugués");
        Pelicula dvd2 = new DVD("El laberinto del fauno", "Guillermo del Toro", 2006, idiomasDVD2, 8.5);

        // Crear VHS
        Pelicula vhs1 = new VHS("Jurassic Park", "Spielberg", 1993, "Español", "Cinta magnética tipo I");
        Pelicula vhs2 = new VHS("Titanic", "James Cameron", 1997, "Inglés", "Cinta magnética tipo II");

        // Mostrar información y precios
        List<Pelicula> peliculas = Arrays.asList(dvd1, dvd2, vhs1, vhs2);
        for (Pelicula p : peliculas) {
            System.out.println(p);
        }
    }
}