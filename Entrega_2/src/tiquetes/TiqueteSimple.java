package tiquetes;

import eventos.Evento;
import eventos.Localidad;

public class TiqueteSimple extends Tiquete {
    public TiqueteSimple(Evento e, Localidad l) { super(e, l); }
    @Override public double calcularPrecioTotal(PoliticaCargos cargos) { /* TODO */ return 0.0; }
}
