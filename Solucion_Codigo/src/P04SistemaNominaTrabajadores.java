abstract class Trabajador {
    protected final String nombre;
    protected final String direccion;
    protected final String dni;
    protected final Jefe jefe;

    public Trabajador(String nombre, String direccion, String dni, Jefe jefe) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.jefe = jefe;
    }

    public abstract double calcularPago();

    @Override
    public String toString() {
        return String.format("%s (DNI: %s), Dirección: %s, Jefe: %s",
                nombre, dni, direccion, (jefe != null ? jefe.nombre : "Sin jefe"));
    }
}

class FijoMensual extends Trabajador {
    private final double sueldoMensual;

    public FijoMensual(String nombre, String direccion, String dni, Jefe jefe, double sueldoMensual) {
        super(nombre, direccion, dni, jefe);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularPago() {
        return sueldoMensual;
    }

    @Override
    public String toString() {
        return "[FijoMensual] " + super.toString() + String.format(", Sueldo: $%.2f", sueldoMensual);
    }
}

class Comisionista extends Trabajador {
    private final double porcentaje;
    private final double ventas;

    public Comisionista(String nombre, String direccion, String dni, Jefe jefe, double porcentaje, double ventas) {
        super(nombre, direccion, dni, jefe);
        this.porcentaje = porcentaje;
        this.ventas = ventas;
    }

    @Override
    public double calcularPago() {
        return ventas * porcentaje / 100.0;
    }

    @Override
    public String toString() {
        return "[Comisionista] " + super.toString() + String.format(", Ventas: $%.2f, Porcentaje: %.2f%%", ventas, porcentaje);
    }
}

class PorHoras extends Trabajador {
    private final int horas;
    private final double tarifaBase;
    private final double tarifaExtra;

    public PorHoras(String nombre, String direccion, String dni, Jefe jefe, int horas, double tarifaBase, double tarifaExtra) {
        super(nombre, direccion, dni, jefe);
        this.horas = horas;
        this.tarifaBase = tarifaBase;
        this.tarifaExtra = tarifaExtra;
    }

    @Override
    public double calcularPago() {
        int horasNormales = Math.min(horas, 40);
        int horasExtras = Math.max(horas - 40, 0);
        return horasNormales * tarifaBase + horasExtras * tarifaExtra;
    }

    @Override
    public String toString() {
        return "[PorHoras] " + super.toString() + String.format(", Horas: %d, Tarifa base: $%.2f, Tarifa extra: $%.2f", horas, tarifaBase, tarifaExtra);
    }
}

class Jefe extends Trabajador {
    private final double sueldo;

    public Jefe(String nombre, String direccion, String dni, double sueldo) {
        super(nombre, direccion, dni, null);
        this.sueldo = sueldo;
    }

    @Override
    public double calcularPago() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "[Jefe] " + nombre + " (DNI: " + dni + "), Dirección: " + direccion + ", Sueldo: $" + String.format("%.2f", sueldo);
    }
}