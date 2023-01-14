package EJERCICIO_comida;

public abstract class comidaTradicional extends Comida{

    private String ingredientes;
    private int tiempoPreparacion;
    private String chef;

    public comidaTradicional(String origen, String ingredientes, int tiempoPreparacion, String chef){
        super(origen);

        if(tiempoPreparacion < 0){
            throw new IllegalArgumentException("El tiempo de preparación debe ser >= 0s");
        }

        this.ingredientes = ingredientes;
        this.tiempoPreparacion = tiempoPreparacion;
        this.chef = chef;
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

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }
}
