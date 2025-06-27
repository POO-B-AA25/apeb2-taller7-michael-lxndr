abstract class CuentaBancaria {
    protected final String numeroCuenta;
    protected final String nombreCliente;
    protected double balance;

    public CuentaBancaria(String numeroCuenta, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.balance = 0.0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
        }
    }

    public abstract void retirar(double cantidad);

    @Override
    public String toString() {
        return String.format("Cuenta: %s | Cliente: %s | Balance: $%.2f", numeroCuenta, nombreCliente, balance);
    }
}

class CuentaCheques extends CuentaBancaria {
    public CuentaCheques(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    @Override
    public void retirar(double cantidad) {
        // Permite sobregiro
        if (cantidad > 0) {
            balance -= cantidad;
        }
    }
}

class CuentaAhorros extends CuentaBancaria {
    private final double tasaInteres;

    public CuentaAhorros(String numeroCuenta, String nombreCliente, double tasaInteres) {
        super(numeroCuenta, nombreCliente);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void retirar(double cantidad) {
        // No permite sobregiro
        if (cantidad > 0 && balance >= cantidad) {
            balance -= cantidad;
        }
    }

    public void calcularInteres() {
        if (balance > 0) {
            balance += balance * tasaInteres / 100.0;
        }
    }
}

class CuentaPlatino extends CuentaBancaria {
    private static final double TASA_PLATINO = 10.0;

    public CuentaPlatino(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    @Override
    public void retirar(double cantidad) {
        // Permite sobregiro, sin castigos
        if (cantidad > 0) {
            balance -= cantidad;
        }
    }

    public void calcularInteres() {
        balance += balance * TASA_PLATINO / 100.0;
    }
}