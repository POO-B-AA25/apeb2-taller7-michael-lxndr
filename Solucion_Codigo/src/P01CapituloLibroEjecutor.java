public class P01CapituloLibroEjecutor {
    public static void main(String[] args) {
        Capitulo capitulo = new Capitulo("Introducción a la Programación");

        Seccion seccion1 = new Seccion("Conceptos Básicos");
        Parrafo parrafo1 = new Parrafo();
        Sentencia sentencia1 = new Sentencia();
        sentencia1.agregarPalabra(new Palabra("La"));
        sentencia1.agregarPalabra(new Palabra("programación"));
        sentencia1.agregarPalabra(new Palabra("es"));
        sentencia1.agregarPalabra(new Palabra("fundamental."));
        parrafo1.agregarSentencia(sentencia1);

        Sentencia sentencia2 = new Sentencia();
        sentencia2.agregarPalabra(new Palabra("Permite"));
        sentencia2.agregarPalabra(new Palabra("automatizar"));
        sentencia2.agregarPalabra(new Palabra("tareas."));
        parrafo1.agregarSentencia(sentencia2);

        seccion1.agregarParrafo(parrafo1);
        seccion1.agregarFigura(new Figura("Diagrama de flujo básico"));

        capitulo.agregarSeccion(seccion1);

        // Otra sección
        Seccion seccion2 = new Seccion("Lenguajes de Programación");
        Parrafo parrafo2 = new Parrafo();
        Sentencia sentencia3 = new Sentencia();
        sentencia3.agregarPalabra(new Palabra("Existen"));
        sentencia3.agregarPalabra(new Palabra("muchos"));
        sentencia3.agregarPalabra(new Palabra("lenguajes."));
        parrafo2.agregarSentencia(sentencia3);

        seccion2.agregarParrafo(parrafo2);
        seccion2.agregarFigura(new Figura("Tabla de lenguajes populares"));

        capitulo.agregarSeccion(seccion2);

        // Mostrar el capítulo completo
        System.out.println(capitulo);
    }
}