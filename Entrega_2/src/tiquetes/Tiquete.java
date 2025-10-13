package tiquetes;

import eventos.Evento;
import eventos.Localidad;

public abstract class Tiquete {
    protected String idTiquete;
    protected boolean transferible = true;
    protected boolean transferido = false;
    protected Evento evento;
    protected Localidad localidad;

    protected Tiquete(Evento evento, Localidad localidad) {
        this.evento = evento;
        this.localidad = localidad;
    }

    public abstract double calcularPrecioTotal(PoliticaCargos cargos);

    public Evento getEvento() { return evento; }
    public Localidad getLocalidad() { return localidad; }
    public boolean isTransferido() { return transferido; }
}

