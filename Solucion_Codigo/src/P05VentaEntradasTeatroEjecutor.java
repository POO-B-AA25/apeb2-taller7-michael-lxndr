public class P05VentaEntradasTeatroEjecutor {
    public static void main(String[] args) {
        Teatro teatro = new Teatro();

        // Crear zonas
        Zona principal = new Zona("Principal", 200, 25.0, 17.5);
        Zona palcoB = new Zona("PalcoB", 40, 70.0, 40.0);

        teatro.agregarZona(principal);
        teatro.agregarZona(palcoB);

        // Vender entradas
        Entrada e1 = teatro.venderEntrada("normal", principal, "Juan Perez");
        Entrada e2 = teatro.venderEntrada("abonado", palcoB, "Ana Ruiz");
        Entrada e3 = teatro.venderEntrada("reducida", principal, "Luis Gomez");

        // Mostrar entradas vendidas
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Consultar entrada por ID
        Entrada consultada = teatro.consultarEntrada(2);
        if (consultada != null) {
            System.out.println("------------------");
            System.out.println("Consulta por ID 2:\n" + consultada);
        }
    }
}