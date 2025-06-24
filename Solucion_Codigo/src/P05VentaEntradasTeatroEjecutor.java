public class P05VentaEntradasTeatroEjecutor {
    public static void main(String[] args) {
        Zona palco = new Zona("PalcoB", 40, 70, 40);
        Zona central = new Zona("Central", 400, 20, 14);

        Entrada e1 = new EntradaNormal(1, palco, "Marta");
        Entrada e2 = new EntradaReducida(2, central, "Luis");
        Entrada e3 = new EntradaAbonado(3, palco, "Andrea");

        System.out.println("Entrada 1: $" + e1.calcularPrecio());
        System.out.println("Entrada 2: $" + e2.calcularPrecio());
        System.out.println("Entrada 3: $" + e3.calcularPrecio());
    }
}
