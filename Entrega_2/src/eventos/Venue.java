package eventos;

public class Venue {
    private String idVenue;
    private String nombre;
    private String ubicacion;
    private int capacidadMaxima;

    public Venue(String idVenue, String nombre, String ubicacion, int capacidadMaxima) {
        this.idVenue = idVenue;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidadMaxima = capacidadMaxima;
    }

    public boolean validarDisponibilidad(String fecha) { /* TODO */ return false; }
}
