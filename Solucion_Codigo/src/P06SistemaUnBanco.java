class Cuenta {
    protected String numeroCuenta;
    protected String nombreCliente;
    protected double balance;

    public Cuenta(String numeroCuenta, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.balance = 0.0;
    }

    public void depositar(double monto) {
        balance += monto;
    }

    public void retirar(double monto) {
        balance -= monto;
    }

    public double obtenerBalance() {
        return balance;
    }
}

class CuentaAhorros extends Cuenta {
    public CuentaAhorros(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    public void calcularInteres() {
        balance += balance * 0.03;
    }
}

class CuentaCheques extends Cuenta {
    public CuentaCheques(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }
}

class CuentaPlatino extends Cuenta {
    public CuentaPlatino(String numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    public void calcularInteres() {
        balance += balance * 0.10;
    }
}
