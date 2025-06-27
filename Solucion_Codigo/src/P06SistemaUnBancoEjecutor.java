public class P06SistemaUnBancoEjecutor {
    public static void main(String[] args) {
        CuentaBancaria[] cuentas = new CuentaBancaria[4];
        cuentas[0] = new CuentaCheques("1001", "Ana Torres");
        cuentas[1] = new CuentaAhorros("2001", "Luis Pérez", 3.5);
        cuentas[2] = new CuentaPlatino("3001", "Marta Díaz");
        cuentas[3] = new CuentaAhorros("2002", "Carlos Ruiz", 2.0);

        // Depósitos iniciales
        cuentas[0].depositar(500);
        cuentas[1].depositar(1000);
        cuentas[2].depositar(2000);
        cuentas[3].depositar(150);

        // Retiros
        cuentas[0].retirar(600);   // Sobregiro permitido
        cuentas[1].retirar(200);   // Permitido
        cuentas[2].retirar(2500);  // Sobregiro permitido
        cuentas[3].retirar(200);   // No permitido, balance insuficiente

        // Calcular intereses donde aplica
        for (CuentaBancaria c : cuentas) {
            if (c instanceof CuentaAhorros ahorros) {
                ahorros.calcularInteres();
            } else if (c instanceof CuentaPlatino platino) {
                platino.calcularInteres();
            }
        }

        // Mostrar estado de cuenta
        System.out.println("=== Estado de cuentas ===");
        for (CuentaBancaria c : cuentas) {
            System.out.println(c);
        }
    }
}