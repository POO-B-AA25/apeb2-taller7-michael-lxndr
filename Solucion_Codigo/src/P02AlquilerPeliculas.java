class Pelicula {
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

    public double calcularPrecio() {
        return 0.0;
    }

    public String toString() {
        return titulo + " (" + anio + ")";
    }
}

class DVD extends Pelicula {
    private double capacidadGB;

    public DVD(String titulo, String autor, int anio, String idioma, double capacidadGB) {
        super(titulo, autor, anio, idioma);
        this.capacidadGB = capacidadGB;
    }

    @Override
    public double calcularPrecio() {
        return 11.0;
    }
}

class VHS extends Pelicula {
    private String tipoCinta;

    public VHS(String titulo, String autor, int anio, String idioma, String tipoCinta) {
        super(titulo, autor, anio, idioma);
        this.tipoCinta = tipoCinta;
    }

    @Override
    public double calcularPrecio() {
        return 10.0;
    }
}
