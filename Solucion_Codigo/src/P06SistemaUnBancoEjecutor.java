public class P06SistemaUnBancoEjecutor {
    public static void main(String[] args) {
        CuentaAhorros ca = new CuentaAhorros("001", "María");
        ca.depositar(1000);
        ca.calcularInteres();

        CuentaCheques cc = new CuentaCheques("002", "Juan");
        cc.depositar(500);
        cc.retirar(600); // sobregiro permitido

        CuentaPlatino cp = new CuentaPlatino("003", "Esteban");
        cp.depositar(2000);
        cp.calcularInteres();

        System.out.println("Ahorros: $" + ca.obtenerBalance());
        System.out.println("Cheques: $" + cc.obtenerBalance());
        System.out.println("Platino: $" + cp.obtenerBalance());
    }
}
