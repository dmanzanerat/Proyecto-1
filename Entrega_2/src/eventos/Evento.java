package eventos;

import java.util.List;

public class Evento {
    private String idEvento;
    private String nombre;
    private String tipo;    // musical/cultural/deportivo/...
    private String fecha;   // simplificado
    private String hora;    // simplificado
    private String estado;  // "PROGRAMADO" | "CANCELADO"

    // TODO: lista de Localidad
    // private List<Localidad> localidades;

    public Evento(String idEvento, String nombre, String tipo, String fecha, String hora) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fecha = fecha;
        this.hora  = hora;
        this.estado = "PROGRAMADO";
    }

    // TODO
    public int tiquetesDisponibles() { /* TODO */ return 0; }
    public int capacidadTotal() { /* TODO */ return 0; }

    public String getTipo() { return tipo; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
