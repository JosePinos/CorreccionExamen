package EJERCICIO_videojuegos;
import java.util.List;
import java.util.ArrayList;

public class MC_JAVA extends Minecraft{


    private List<String> modosJuego = new ArrayList<String>(2);
    private int ventas;
    private String plataformas;

    public MC_JAVA(double precio, String genero, String nombre, int anio, int mes, int dia,
                 String empresa, String clasificacion, String plataformas, int ventas){

        super(precio, genero, nombre, anio, mes, dia, empresa, clasificacion);

        modosJuego.add("UN JUGADOR");
        modosJuego.add("MULTIJUGADOR");
        modosJuego.add("EXTREMO");
        modosJuego.add("SUPERVIVENCIA");

        if(ventas < 0){ throw new IllegalArgumentException("El número de ventas debe ser > 0"); }
        this.ventas = ventas;
        this.plataformas = plataformas;
    }

    public void aniadirModoJuego(String modo){
        modosJuego.add(modo);
    }

    public void eliminarModoJuego(int indice){
        modosJuego.remove(indice);
    }

    public void getmodosJuego(){
        System.out.println("MODOS DE JUEGO\n");
        for (String modo : modosJuego){
            System.out.println(modo);
        }
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    @Override
    public String sinopsis(){
        return getNombre() + " es un juego de " + getGenero()+ " desarrollado por " + getEmpresa() +
                " en el año " + getFechaLanzamiento() + ", básicamente consiste en explorar la ciudad en modo libre.\n" +
                "El juego ya cuenta con " + getVentas() + " ventas a nivel mundial " +
                "y tiene una clasificación " + getClasificacion() + "\n";
    }




}//FIN DE LA CLASE MC_JAVA
