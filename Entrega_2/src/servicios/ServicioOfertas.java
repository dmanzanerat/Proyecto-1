package servicios;

import admin.Oferta;
import eventos.Localidad;

public interface ServicioOfertas {
    void crearOferta(Localidad loc, Oferta of);
    double precioConOferta(Localidad loc, String fecha, double base);
}
