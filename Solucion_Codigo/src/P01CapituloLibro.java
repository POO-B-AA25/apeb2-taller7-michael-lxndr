import java.util.*;

class Capitulo {
    private final String titulo;
    private final List<Seccion> secciones;

    public Capitulo(String titulo) {
        this.titulo = titulo;
        this.secciones = new ArrayList<>();
    }

    public void agregarSeccion(Seccion seccion) {
        secciones.add(seccion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CAPÍTULO: " + titulo + "\n");
        for (Seccion s : secciones) {
            sb.append(s).append("\n");
        }
        return sb.toString();
    }
}

class Seccion {
    private final String titulo;
    private final List<Parrafo> parrafos;
    private final List<Figura> figuras;

    public Seccion(String titulo) {
        this.titulo = titulo;
        this.parrafos = new ArrayList<>();
        this.figuras = new ArrayList<>();
    }

    public void agregarParrafo(Parrafo parrafo) {
        parrafos.add(parrafo);
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\tSECCIÓN: " + titulo + "\n");
        for (Parrafo p : parrafos) {
            sb.append(p).append("\n");
        }
        for (Figura f : figuras) {
            sb.append("    ").append(f).append("\n");
        }
        return sb.toString();
    }
}

class Parrafo {
    private final List<Sentencia> sentencias;

    public Parrafo() {
        this.sentencias = new ArrayList<>();
    }

    public void agregarSentencia(Sentencia sentencia) {
        sentencias.add(sentencia);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\t\tPÁRRAFO:\n");
        for (Sentencia s : sentencias) {
            sb.append("\t\t\t").append(s).append("\n");
        }
        return sb.toString();
    }
}

class Sentencia {
    private final List<Palabra> palabras;

    public Sentencia() {
        this.palabras = new ArrayList<>();
    }

    public void agregarPalabra(Palabra palabra) {
        palabras.add(palabra);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Palabra p : palabras) {
            sb.append(p).append(" ");
        }
        return sb.toString().trim();
    }
}

class Palabra {
    private final String texto;

    public Palabra(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }
}

class Figura {
    private final String descripcion;

    public Figura(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "\tFIGURA: " + descripcion;
    }
}