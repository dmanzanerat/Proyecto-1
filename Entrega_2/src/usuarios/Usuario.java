package usuarios;

public abstract class Usuario {
    protected String login;
    protected String password;
    protected double saldoPlataforma;
    
    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
        this.saldoPlataforma = 0.0;
    }
    
    
    public abstract void abonar(double monto);
    public abstract boolean debitar(double monto);
    
    public String getLogin() { return login; }
    public double getSaldoPlataforma() { return saldoPlataforma; }
    
}
