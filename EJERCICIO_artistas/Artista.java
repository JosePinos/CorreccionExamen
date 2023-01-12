package EJERCICIO_artistas;



public abstract class Artista {
    private final int inicioActividad;
    private int finActividad;
    private final String origen;//país o nacionalidad

    public Artista(int inicioActividad, int finActividad, String origen) {

        if(inicioActividad < 0 || finActividad < 0 || finActividad < inicioActividad){
            throw new IllegalArgumentException("Los años de actividad son incorrectos");
        }

        this.inicioActividad = inicioActividad;
        this.finActividad = finActividad;
        this.origen = origen;
    }


    public int getInicioActividad() {
        return inicioActividad;
    }

    public int getFinActividad() {
        return finActividad;
    }

    public void setFinActividad(int finActividad) {
        if(inicioActividad < 0 || finActividad < 0 || finActividad < inicioActividad){
            throw new IllegalArgumentException("Los años de actividad son incorrectos");
        }
        this.finActividad = finActividad;
    }

    public String getOrigen() {
        return origen;
    }


}
