public class P03SistemaEnvioMensajesMovilesEjecutor {
    public static void main(String[] args) {
        Movil movil1 = new Movil("3001234567", "Ana");
        Movil movil2 = new Movil("3109876543", "Luis");

        Mensaje sms = new SMS(movil1, movil2, "¡Hola, cómo estás?");
        Mensaje mms = new MMS(movil2, movil1, "foto_vacaciones.jpg");

        sms.enviarMensaje();
        System.out.println(sms.visualizarMensaje());

        mms.enviarMensaje();
        System.out.println(mms.visualizarMensaje());
    }
}