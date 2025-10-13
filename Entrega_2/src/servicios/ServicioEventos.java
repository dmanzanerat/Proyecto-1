package servicios;

import eventos.*;

public interface ServicioEventos {
    Evento crearEvento(String nombre, String fecha, String hora, Venue venue, String tipo);
    void asignarLocalidad(Evento evt, Localidad loc);
    void cancelarEvento(Evento evt, String motivo);
}
