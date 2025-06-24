public class P03SistemaEnvioMensajesMovilesEjecutor {
    public static void main(String[] args) {
        Movil m1 = new Movil("0987654321", "Juan");
        Movil m2 = new Movil("0998765432", "Ana");

        SMS sms = new SMS(m1, m2, "Hola Ana, ¿cómo estás?");
        MMS mms = new MMS(m1, m2, "imagen1.jpg");

        sms.enviarMensaje();
        mms.enviarMensaje();

        System.out.println("SMS: " + sms.visualizarMensaje());
        System.out.println("MMS: " + mms.visualizarMensaje());
    }
}
