package EJERCICIO_videojuegos;

public abstract class videoJuego {

    private double precio;
    private final String genero;
    private final String nombre;

    public videoJuego(double precio, String genero, String nombre){
        if(precio < 0.0){  throw new IllegalArgumentException("El precio debe ser >= 0.0$");  }
        this.precio = precio;
        this.genero = genero;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }


    public abstract String sinopsis();

}//FIN DE LA CLASE VIDEOJUEGO
