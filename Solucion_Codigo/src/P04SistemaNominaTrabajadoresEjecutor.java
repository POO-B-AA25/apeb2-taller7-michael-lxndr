public class P04SistemaNominaTrabajadoresEjecutor {
    public static void main(String[] args) {
        // Crear jefes
        Jefe jefe1 = new Jefe("Laura Gómez", "Calle 1", "12345678", 5000.0);
        Jefe jefe2 = new Jefe("Carlos Ruiz", "Calle 2", "87654321", 6000.0);

        // Crear trabajadores de distintos tipos
        Trabajador fijo = new FijoMensual("Ana Torres", "Av. Siempre Viva 123", "11111111", jefe1, 2500.0);
        Trabajador comisionista = new Comisionista("Luis Pérez", "Calle Luna 45", "22222222", jefe1, 10.0, 15000.0);
        Trabajador porHoras = new PorHoras("Marta Díaz", "Calle Sol 67", "33333333", jefe2, 50, 20.0, 30.0);

        // Mostrar nómina
        Trabajador[] trabajadores = {jefe1, jefe2, fijo, comisionista, porHoras};
        for (Trabajador t : trabajadores) {
            System.out.println(t);
            System.out.println("Pago mensual: $" + String.format("%.2f", t.calcularPago()));
            System.out.println();
        }
    }
}