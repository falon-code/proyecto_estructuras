package model;

public class Estacion {
    private String nombreEstacion;
    
    public Estacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public boolean comprarBoleto() {
       //Implementar lógica de compra de boleto
        return true;
    }

    public boolean validarBoleto() {
       //Implementar lógica de validación de boleto
        return true;
    }

    public void publicarRutas() {
       //Implementar lógica de publicación de rutas
    }
}
