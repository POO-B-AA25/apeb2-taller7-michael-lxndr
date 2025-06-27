class Movil {
    private final String numero;
    private final String nombre;

    public Movil(String numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + numero + ")";
    }
}

abstract class Mensaje {
    protected final Movil remitente;
    protected final Movil destinatario;

    public Mensaje(Movil remitente, Movil destinatario) {
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public abstract void enviarMensaje();

    public abstract String visualizarMensaje();
}

class SMS extends Mensaje {
    private final String contenido;

    public SMS(Movil remitente, Movil destinatario, String contenido) {
        super(remitente, destinatario);
        this.contenido = contenido;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando SMS de " + remitente + " a " + destinatario + ": " + contenido);
    }

    @Override
    public String visualizarMensaje() {
        return "SMS de " + remitente + " para " + destinatario + ": " + contenido;
    }
}

class MMS extends Mensaje {
    private final String archivoImagen;

    public MMS(Movil remitente, Movil destinatario, String archivoImagen) {
        super(remitente, destinatario);
        this.archivoImagen = archivoImagen;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando MMS de " + remitente + " a " + destinatario + ": [Imagen: " + archivoImagen + "]");
    }

    @Override
    public String visualizarMensaje() {
        return "MMS de " + remitente + " para " + destinatario + ": Imagen -> " + archivoImagen;
    }
}