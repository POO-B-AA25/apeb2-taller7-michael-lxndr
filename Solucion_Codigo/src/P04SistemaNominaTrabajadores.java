abstract class Trabajador {
    protected String nombre;
    protected String direccion;
    protected String dni;
    protected Jefe jefe;

    public abstract double calcularPago();
}

class FijoMensual extends Trabajador {
    private double sueldoMensual;

    public FijoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularPago() {
        return sueldoMensual;
    }
}

class Comisionista extends Trabajador {
    private double porcentaje;
    private double ventas;

    public Comisionista(double porcentaje, double ventas) {
        this.porcentaje = porcentaje;
        this.ventas = ventas;
    }

    @Override
    public double calcularPago() {
        return ventas * porcentaje;
    }
}

class PorHoras extends Trabajador {
    private int horas;
    private double tarifaBase;
    private double tarifaExtra;

    public PorHoras(int horas, double tarifaBase, double tarifaExtra) {
        this.horas = horas;
        this.tarifaBase = tarifaBase;
        this.tarifaExtra = tarifaExtra;
    }

    @Override
    public double calcularPago() {
        if (horas <= 40) {
            return horas * tarifaBase;
        } else {
            return 40 * tarifaBase + (horas - 40) * tarifaExtra;
        }
    }
}

class Jefe extends Trabajador {
    private double sueldo;

    public Jefe(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public double calcularPago() {
        return sueldo;
    }
}
