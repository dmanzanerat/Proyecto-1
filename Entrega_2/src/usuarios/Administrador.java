package usuarios;

public class Administrador extends Usuario {
    public Administrador(String login, String password) { super(login, password); }
    @Override public void abonar(double monto) { /* TODO */ }
    @Override public boolean debitar(double monto) { /* TODO */ return false; }

    // TODO: metodos admin (aprobarVenue, cancelarEvento, etc.)
}