package servicios;

import java.util.List;
import eventos.Evento;
import tiquetes.Tiquete;
import tiquetes.Transaccion;
import usuarios.Cliente;

public interface ServicioVentas {
    Transaccion comprar(Cliente cliente, Evento evt, List<Tiquete> items, String metodoPago);
    boolean transferir(Cliente origen, Tiquete t, Cliente destino);
    boolean reembolsar(Tiquete t);
}
