import java.util.*;

class Teatro {
    private final List<Zona> zonas;
    private final List<Entrada> entradas;
    private int contadorEntradas = 1;

    public Teatro() {
        zonas = new ArrayList<>();
        entradas = new ArrayList<>();
    }

    public void agregarZona(Zona zona) {
        zonas.add(zona);
    }

    public Entrada venderEntrada(String tipo, Zona zona, String nombreComprador) {
        if (zona.reservarLocalidad()) {
            Entrada entrada;
            int id = contadorEntradas++;
            entrada = switch (tipo.toLowerCase()) {
                case "normal" -> new EntradaNormal(id, zona, nombreComprador);
                case "reducida" -> new EntradaReducida(id, zona, nombreComprador);
                case "abonado" -> new EntradaAbonado(id, zona, nombreComprador);
                default -> throw new IllegalArgumentException("Tipo de entrada no válido");
            };
            entradas.add(entrada);
            return entrada;
        } else {
            System.out.println("No hay localidades disponibles en la zona seleccionada.");
            return null;
        }
    }

    public Entrada consultarEntrada(int id) {
        for (Entrada e : entradas) {
            if (e.getId() == id) return e;
        }
        return null;
    }
}

class Zona {
    private final String nombre;
    private final int localidades;
    private final double precioNormal;
    private final double precioAbonado;
    private int localidadesDisponibles;

    public Zona(String nombre, int localidades, double precioNormal, double precioAbonado) {
        this.nombre = nombre;
        this.localidades = localidades;
        this.localidadesDisponibles = localidades;
        this.precioNormal = precioNormal;
        this.precioAbonado = precioAbonado;
    }

    public boolean reservarLocalidad() {
        if (localidadesDisponibles > 0) {
            localidadesDisponibles--;
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public double getPrecioAbonado() {
        return precioAbonado;
    }

    @Override
    public String toString() {
        return nombre + " (Disponibles: " + localidadesDisponibles + "/" + localidades + ")";
    }
}

abstract class Entrada {
    protected int id;
    protected Zona zona;
    protected String nombreComprador;

    public Entrada(int id, Zona zona, String nombreComprador) {
        this.id = id;
        this.zona = zona;
        this.nombreComprador = nombreComprador;
    }

    public int getId() {
        return id;
    }

    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return String.format("Entrada #%d | Zona: %-10s | Comprador: %-15s | Precio: $%-6.2f",
                id, zona.getNombre(), nombreComprador, calcularPrecio());
    }
}

class EntradaNormal extends Entrada {
    public EntradaNormal(int id, Zona zona, String nombreComprador) {
        super(id, zona, nombreComprador);
    }

    @Override
    public double calcularPrecio() {
        return zona.getPrecioNormal();
    }
}

class EntradaReducida extends Entrada {
    public EntradaReducida(int id, Zona zona, String nombreComprador) {
        super(id, zona, nombreComprador);
    }

    @Override
    public double calcularPrecio() {
        // Por ejemplo, 15% de descuento sobre el precio normal
        return zona.getPrecioNormal() * 0.85;
    }
}

class EntradaAbonado extends Entrada {
    public EntradaAbonado(int id, Zona zona, String nombreComprador) {
        super(id, zona, nombreComprador);
    }

    @Override
    public double calcularPrecio() {
        return zona.getPrecioAbonado();
    }
}