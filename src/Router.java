public class Router {

    private String nombre;
    private String direccionIP;
    private int cantidadPuertos;
    private boolean activo;

    // Constructor: usa los setters para aplicar las validaciones
    public Router(String nombre, String direccionIP, int cantidadPuertos) {
        setNombre(nombre);
        setDireccionIP(direccionIP);
        setCantidadPuertos(cantidadPuertos);
        this.activo = false;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public int getCantidadPuertos() {
        return cantidadPuertos;
    }

    public boolean isActivo() {
        return activo;
    }

    // Setters con validaciones
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre.trim();
    }

    public void setDireccionIP(String direccionIP) {
        if (direccionIP == null || direccionIP.trim().isEmpty()) {
            throw new IllegalArgumentException("La dirección IP no puede estar vacía.");
        }
        this.direccionIP = direccionIP.trim();
    }

    public void setCantidadPuertos(int cantidadPuertos) {
        if (cantidadPuertos <= 0) {
            throw new IllegalArgumentException("La cantidad de puertos debe ser mayor que 0.");
        }
        this.cantidadPuertos = cantidadPuertos;
    }

    // Métodos públicos
    public void encender() {
        if (activo) {
            System.out.println("El router " + nombre + " ya está encendido.");
        } else {
            activo = true;
            System.out.println("El router " + nombre + " (" + direccionIP + ") ha sido encendido.");
        }
    }

    public void apagar() {
        if (!activo) {
            System.out.println("El router " + nombre + " ya está apagado.");
        } else {
            activo = false;
            System.out.println("El router " + nombre + " (" + direccionIP + ") ha sido apagado.");
        }
    }
}
