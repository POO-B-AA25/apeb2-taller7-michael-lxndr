import java.util.List;

class Palabra {
    private String texto;

    public Palabra(String texto) { this.texto = texto; }

    public String toString() { return texto; }
}

class Sentencia {
    private List<Palabra> palabras;

    public Sentencia(List<Palabra> palabras) { this.palabras = palabras; }

    public String toString() { return palabras.toString(); }
}

class Parrafo {
    private List<Sentencia> sentencias;

    public Parrafo(List<Sentencia> sentencias) { this.sentencias = sentencias; }

    public String toString() { return sentencias.toString(); }
}

class Figura {
    private String descripcion;

    public Figura(String descripcion) { this.descripcion = descripcion; }

    public String toString() { return descripcion; }
}

class Seccion {
    private List<Parrafo> parrafos;
    private List<Figura> figuras;

    public Seccion(List<Parrafo> parrafos, List<Figura> figuras) {
        this.parrafos = parrafos;
        this.figuras = figuras;
    }

    public String toString() { return "Parrafos: " + parrafos + ", Figuras: " + figuras; }
}

class Capitulo {
    private List<Seccion> secciones;

    public Capitulo(List<Seccion> secciones) { this.secciones = secciones; }

    public String toString() { return "Secciones: " + secciones; }
}
