package admin;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Oferta {
    private String idOferta;
    private double descuento; // 0..1
    private String fechaInicio;
    private String fechaFin;

    public Oferta(String idOferta, double descuento, String fechaInicio, String fechaFin) {
        this.idOferta = idOferta;
        if (descuento < 0 || descuento > 1) {
            throw new IllegalArgumentException("El descuento debe estar entre 0 y 1");
        }
        this.descuento = descuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    

    public boolean vigente(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaConsulta = LocalDate.parse(fecha, formatter);
        LocalDate inicio = LocalDate.parse(fechaInicio, formatter);
        LocalDate fin = LocalDate.parse(fechaFin, formatter);
        
        return !fechaConsulta.isBefore(inicio) && !fechaConsulta.isAfter(fin);
    }
    
    
    public double aplicar(double precioBase) {
        return precioBase * (1 - descuento);
    }
}
