package eventos;

import java.util.List;
import tiquetes.Tiquete;

public class Localidad {
    private String idLocalidad;
    private String nombre;
    private double precio;
    private boolean numerada;
    private int capacidad;

    public Localidad(String idLocalidad, String nombre, double precio, boolean numerada, int capacidad) {
        this.idLocalidad = idLocalidad;
        this.nombre = nombre;
        this.precio = precio;
        this.numerada = numerada;
        this.capacidad = capacidad;
    }

    public List<Tiquete> generarTiquetes(Evento evt) { /* TODO */ return null; }

    public int getCapacidad() { return capacidad; }
    public double getPrecio() { return precio; }
}