package tiquetes;

import eventos.Evento;
import eventos.Localidad;

public class TiqueteNumerado extends Tiquete {
    private String numAsiento;

    public TiqueteNumerado(Evento evento, Localidad localidad, String numAsiento) {
        super(evento, localidad, evento.getIdEvento() + "-" + localidad.getIdLocalidad() + "-" + numAsiento);
        this.numAsiento = numAsiento;
    }

    @Override
    public double calcularPrecioTotal(PoliticaCargos cargos) {
        double precioBase = localidad.getPrecio();
        double porcentajeServicio = cargos.cargoPara(evento.getTipo());
        double total = precioBase + (precioBase * porcentajeServicio) + cargos.getCuotaEmisionFija();
        return total;
    }

    public String getNumAsiento() {
        return numAsiento;
    }

    @Override
    public String toString() {
        return "TiqueteNumerado{id='" + idTiquete + "', asiento=" + numAsiento +
               ", evento='" + evento.getNombre() + "', localidad='" + localidad.getNombre() + "'}";
    }
}
