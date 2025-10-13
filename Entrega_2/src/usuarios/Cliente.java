package usuarios;

public class Cliente extends Usuario {
    public Cliente(String login, String password) { super(login, password); }
    @Override public void abonar(double monto) { /* TODO */ }
    @Override public boolean debitar(double monto) { /* TODO */ return false; }
}
