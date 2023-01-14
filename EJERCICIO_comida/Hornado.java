package EJERCICIO_comida;

public class Hornado extends comidaTradicional{

    private String puntoVenta;
    private String nombrePlato;
    private double precio;

    public Hornado(String origen, String ingredientes, int tiempoPreparacion, String puntoVenta,
                  String nombrePlato, double precio){
        super(origen, ingredientes, tiempoPreparacion);

        if(precio < 0.0){
            throw new IllegalArgumentException("El precio debe ser >= 0.0");
        }
        this.puntoVenta = puntoVenta;
        this.nombrePlato = nombrePlato;
        this.precio = precio;
    }

    public String getPuntoVenta() {  return puntoVenta;  }

    public void setPuntoVenta(String puntoVenta) {  this.puntoVenta = puntoVenta;  }

    public String getNombrePlato() {  return nombrePlato;  }

    public void setNombrePlato(String nombrePlato) {  this.nombrePlato = nombrePlato;  }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String preparacion(){
        return getNombrePlato() + " de origen " + getOrigen() + " tiene como ingredientes:\n"
                + getIngredientes() + ".\n"+
                "Su tiempo de preparación es de " + getTiempoPreparacion() + "s y este plato se vende en: " + getPuntoVenta()
                +"\n a un precio de " + getPrecio() + "$.";
    }


}
