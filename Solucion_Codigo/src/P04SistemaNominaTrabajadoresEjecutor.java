public class P04SistemaNominaTrabajadoresEjecutor {
    public static void main(String[] args) {
        Jefe jefe = new Jefe(2000);
        jefe.nombre = "Carlos";

        FijoMensual fijo = new FijoMensual(900);
        fijo.nombre = "Lucía";
        fijo.jefe = jefe;

        Comisionista com = new Comisionista(0.1, 1500);
        com.nombre = "Pedro";
        com.jefe = jefe;

        PorHoras porHoras = new PorHoras(50, 5, 7);
        porHoras.nombre = "Diana";
        porHoras.jefe = jefe;

        System.out.println(jefe.nombre + ": $" + jefe.calcularPago());
        System.out.println(fijo.nombre + ": $" + fijo.calcularPago());
        System.out.println(com.nombre + ": $" + com.calcularPago());
        System.out.println(porHoras.nombre + ": $" + porHoras.calcularPago());
    }
}
