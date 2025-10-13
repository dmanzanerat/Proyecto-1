package usuarios;

public class Organizador extends Usuario {
    public Organizador(String login, String password) { super(login, password); }
    @Override public void abonar(double monto) { /* TODO */ }
    @Override public boolean debitar(double monto) { /* TODO */ return false; }

    // TODO: estadoFinanciero()
}
