package EJERCICIO_comida;

public abstract class comidaTradicional extends Comida{

    private String ingredientes;
    private int tiempoPreparacion;

    public comidaTradicional(String origen, String ingredientes, int tiempoPreparacion){
        super(origen);

        if(tiempoPreparacion < 0){
            throw new IllegalArgumentException("El tiempo de preparación debe ser >= 0s");
        }

        this.ingredientes = ingredientes;
        this.tiempoPreparacion = tiempoPreparacion;
    }



    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

}
