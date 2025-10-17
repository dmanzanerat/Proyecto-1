package eventos;

import java.util.*;
import tiquetes.Tiquete;


public class Localidad {
    private String idLocalidad;
    private String nombre;
    private double precio;
    private boolean numerada;
    private int capacidad;
    private List<Tiquete> tiquetes;

    public Localidad(String idLocalidad, String nombre, double precio, boolean numerada, int capacidad) {
        this.idLocalidad = idLocalidad;
        this.nombre = nombre;
        this.precio = precio;
        this.numerada = numerada;
        this.capacidad = capacidad;
        this.tiquetes = new ArrayList<>();
    }

    public List<Tiquete> generarTiquetes(Evento evento) {
        tiquetes.clear();
        for (int i = 1; i <= capacidad; i++) {
            String idTiquete = evento.getIdEvento() + "-" + idLocalidad + "-" + i;
            String asiento = numerada ? String.valueOf(i) : null;
            Tiquete tiquete = new Tiquete(evento.getIdEvento(), idLocalidad, idTiquete);
            tiquetes.add(tiquete);
        }
        return tiquetes;
    }

    public String getIdLocalidad() { return idLocalidad; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public boolean isNumerada() { return numerada; }
    public int getCapacidad() { return capacidad; }
    public List<Tiquete> getTiquetes() { return tiquetes; }
}
