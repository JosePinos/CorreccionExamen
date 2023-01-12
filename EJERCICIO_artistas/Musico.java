package EJERCICIO_artistas;
import java.util.Date;
import java.util.GregorianCalendar;

public class Musico extends Artista implements Presentaciones{

    private String nombre;
    private String genero;


    public Musico(int inicioActividad, int finActividad, String origen, String nombre, String genero) {
        super(inicioActividad, finActividad, origen);

        this.genero = genero;
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String proximaPresentacion(int anio, int mes, int dia) {
        GregorianCalendar presentacion = new GregorianCalendar(anio,mes-1,dia);
        Date fecha = presentacion.getTime();
        return "En vivo el: " + fecha;
    }
}
