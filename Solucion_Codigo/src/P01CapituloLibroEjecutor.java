import java.util.Arrays;

public class P01CapituloLibroEjecutor {
    public static void main(String[] args) {
        Palabra p1 = new Palabra("Hola");
        Palabra p2 = new Palabra("mundo");

        Sentencia s1 = new Sentencia(Arrays.asList(p1, p2));
        Parrafo parrafo1 = new Parrafo(Arrays.asList(s1));
        Figura figura1 = new Figura("Figura 1: Diagrama UML");

        Seccion seccion1 = new Seccion(Arrays.asList(parrafo1), Arrays.asList(figura1));
        Capitulo capitulo = new Capitulo(Arrays.asList(seccion1));

        System.out.println(capitulo);
    }
}
