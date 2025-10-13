package admin;

public class Oferta {
    private String idOferta;
    private double descuento; // 0..1
    private String fechaInicio;
    private String fechaFin;

    public boolean vigente(String fecha) { /* TODO */ return false; }
    public double aplicar(double precioBase) { /* TODO */ return 0.0; }
}
