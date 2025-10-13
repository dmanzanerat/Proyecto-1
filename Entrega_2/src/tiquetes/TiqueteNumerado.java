package tiquetes;

import eventos.Evento;
import eventos.Localidad;

public class TiqueteNumerado extends Tiquete {
    private String numAsiento;
    public TiqueteNumerado(Evento e, Localidad l, String numAsiento) {
        super(e, l);
        this.numAsiento = numAsiento;
    }
    @Override public double calcularPrecioTotal(PoliticaCargos cargos) { /* TODO */ return 0.0; }
}
