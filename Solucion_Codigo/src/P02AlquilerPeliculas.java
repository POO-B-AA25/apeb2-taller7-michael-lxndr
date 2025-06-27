import java.util.*;

abstract class Pelicula {
    protected String titulo;
    protected String autor;
    protected int anio;
    protected String idioma;

    public Pelicula(String titulo, String autor, int anio, String idioma) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.idioma = idioma;
    }

    public String datosBaseFormateados() {
        return String.format("Título: %-25s Autor: %-20s Año: %-4d \t\t Idioma: %-10s",
                titulo, autor, anio, idioma);
    }
}

class DVD extends Pelicula {
    private final double capacidadGB;
    private final List<String> idiomas;

    public DVD(String titulo, String autor, int anio, List<String> idiomas, double capacidadGB) {
        super(titulo, autor, anio, idiomas.isEmpty() ? "" : idiomas.getFirst());
        this.idiomas = new ArrayList<>(idiomas);
        this.capacidadGB = capacidadGB;
    }

    private double calcularPrecio() {
        // Precio base para VHS: $10, DVD es 10% más caro
        return 10.0 * 1.10;
    }

    @Override
    public String toString() {
        return String.format("[DVD] %s Capacidad: %-3.1fGB \t Idiomas: %-30s Precio alquiler: $%-5.2f",
                datosBaseFormateados(), capacidadGB, idiomas.toString(), calcularPrecio());
    }
}

class VHS extends Pelicula {
    private final String tipoCinta;

    public VHS(String titulo, String autor, int anio, String idioma, String tipoCinta) {
        super(titulo, autor, anio, idioma);
        this.tipoCinta = tipoCinta;
    }

    private double calcularPrecio() {
        // Precio base para VHS: $10
        return 10.0;
    }

    @Override
    public String toString() {
        return String.format("[VHS] %s Tipo de cinta: %-45s Precio alquiler: $%-5.2f",
                datosBaseFormateados(), tipoCinta, calcularPrecio());
    }
}