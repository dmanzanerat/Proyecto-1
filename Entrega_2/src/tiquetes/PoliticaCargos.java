package tiquetes;

import java.util.Map;

public class PoliticaCargos {
    private double cuotaEmisionFija;
    private int maxTiquetesPorTransaccion;
    private Map<String, Double> cargoServicioPorTipo; // "musical"->0.12

    public PoliticaCargos(Map<String, Double> cargoServicioPorTipo) {
        this.cargoServicioPorTipo = cargoServicioPorTipo;
    }

    public double cargoPara(String tipoEvento) { /* TODO */ return 0.0; }

    // Getters/Setters basicos
    public double getCuotaEmisionFija() { return cuotaEmisionFija; }
    public void setCuotaEmisionFija(double v) { this.cuotaEmisionFija = v; }
    public int getMaxTiquetesPorTransaccion() { return maxTiquetesPorTransaccion; }
    public void setMaxTiquetesPorTransaccion(int v) { this.maxTiquetesPorTransaccion = v; }
}
