package EJERCICIO_videojuegos;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class GrandTheftAuto extends videoJuego{

    private Date fechaLanzamiento;
    private String empresa;
    private String clasificacion;

    public GrandTheftAuto(double precio, String genero, String nombre, int anio, int mes, int dia,
            String empresa, String clasificacion ){

        super(precio, genero, nombre);
        if(anio < 0 || mes < 0 || dia < 0){
            throw new IllegalArgumentException("La fecha ingresada no es correcta");
        }
        GregorianCalendar fech = new GregorianCalendar(anio,mes-1,dia);
        fechaLanzamiento = fech.getTime();
    }

    public Date getFechaLanzamiento() { return fechaLanzamiento; }

    public void setFechaLanzamiento(int anio, int mes, int dia) {
        if(anio < 0 || mes < 0 || dia < 0){
            throw new IllegalArgumentException("La fecha ingresada no es correcta");
        }
        GregorianCalendar fecha = new GregorianCalendar(anio,mes-1,dia);
        this.fechaLanzamiento = fecha.getTime();
    }


    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    /*
    *   TODAVÍA NO SE IMPLEMENTA EL MÉTODO SINOPSIS DEL VIDEOJUEGO
    *   POR ESO LA CLASE ES ABSTRACT PARA EVITAR EL ERROR
    */

}//FIN DE LA CLASE GRANDTHEFTAUTO
