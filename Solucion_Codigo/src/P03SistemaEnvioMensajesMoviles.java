class Movil {
    private String numero;
    private String nombre;

    public Movil(String numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public String toString() {
        return nombre + " (" + numero + ")";
    }
}

abstract class Mensaje {
    protected Movil remitente;
    protected Movil destinatario;

    public Mensaje(Movil remitente, Movil destinatario) {
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public abstract void enviarMensaje();

    public abstract String visualizarMensaje();
}

class SMS extends Mensaje {
    private String contenido;

    public SMS(Movil remitente, Movil destinatario, String contenido) {
        super(remitente, destinatario);
        this.contenido = contenido;
    }

    @Override
    public void enviarMensaje() {
        // lógica de envío (simulada)
    }

    @Override
    public String visualizarMensaje() {
        return contenido;
    }
}

class MMS extends Mensaje {
    private String archivoImagen;

    public MMS(Movil remitente, Movil destinatario, String archivoImagen) {
        super(remitente, destinatario);
        this.archivoImagen = archivoImagen;
    }

    @Override
    public void enviarMensaje() {
        // lógica de envío (simulada)
    }

    @Override
    public String visualizarMensaje() {
        return archivoImagen;
    }
}
