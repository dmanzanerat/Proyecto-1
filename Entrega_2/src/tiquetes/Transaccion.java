package tiquetes;

import java.util.List;

public class Transaccion {
    private String idTransaccion;
    private String fechaHora;
    private double total;
    private String estado;      // "PENDIENTE"|"PAGADA"|"FALLIDA"|"REEMBOLSADA"
    private String metodoPago;  // "SALDO"|"PASARELADEPAGO"|
    private List<Tiquete> tiquetes;

    public double calcularTotal(PoliticaCargos cargos) { /* TODO */ return 0.0; }
    public void marcarPagada() { /* TODO */ }
    public void marcarFallida() { /* TODO */ }
}
