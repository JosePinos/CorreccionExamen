package EJERCICIO_comida;

public abstract class Comida {

    private final String origen;


    public Comida(String origen) {
        this.origen = origen;

    }

    public String getOrigen() {  return origen;  }


    public abstract String preparacion();

}
