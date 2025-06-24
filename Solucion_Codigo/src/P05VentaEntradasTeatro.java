class Zona {
    String nombre;
    int localidades;
    double precioNormal;
    double precioAbonado;

    public Zona(String nombre, int localidades, double precioNormal, double precioAbonado) {
        this.nombre = nombre;
        this.localidades = localidades;
        this.precioNormal = precioNormal;
        this.precioAbonado = precioAbonado;
    }
}

abstract class Entrada {
    protected int id;
    protected Zona zona;
    protected String nombreComprador;

    public abstract double calcularPrecio();
}

class EntradaNormal extends Entrada {
    public EntradaNormal(int id, Zona zona, String nombre) {
        this.id = id;
        this.zona = zona;
        this.nombreComprador = nombre;
    }

    @Override
    public double calcularPrecio() {
        return zona.precioNormal;
    }
}

class EntradaReducida extends Entrada {
    public EntradaReducida(int id, Zona zona, String nombre) {
        this.id = id;
        this.zona = zona;
        this.nombreComprador = nombre;
    }

    @Override
    public double calcularPrecio() {
        return zona.precioNormal * 0.85;
    }
}

class EntradaAbonado extends Entrada {
    public EntradaAbonado(int id, Zona zona, String nombre) {
        this.id = id;
        this.zona = zona;
        this.nombreComprador = nombre;
    }

    @Override
    public double calcularPrecio() {
        return zona.precioAbonado;
    }
}
