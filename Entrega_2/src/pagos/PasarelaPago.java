package pagos;

public interface PasarelaPago {
    boolean procesarPago(double monto);
    boolean reembolsar(double monto);
}
