package EJERCICIO_artistas;
import java.util.List;
import java.util.ArrayList;

public class Banda extends Musico{
    private int albumes;
    private int discosVendidos;
    private List<String> integrantes = new ArrayList<String>(2);

    public Banda(int inicioActividad, int finActividad, String origen, String nombre,
                 String genero, int albumes, int discosVendidos){
        super(inicioActividad, finActividad, origen, nombre, genero);

        if(albumes < 0){ throw new IllegalArgumentException("El número de álbumes de la banda debe ser >= 0"); }

        if(discosVendidos < 0){ throw new IllegalArgumentException("El número de discos vendidos de la banda debe ser >= 0"); }

        this.albumes = albumes;
        this.discosVendidos = discosVendidos;
    }

    public int getAlbumes() {
        return albumes;
    }

    public void setAlbumes(int albumes) {
        if(albumes < 0){ throw new IllegalArgumentException("El número de álbumes de la banda debe ser >= 0"); }
        this.albumes = albumes;
    }

    public int getDiscosVendidos() {
        return discosVendidos;
    }

    public void setDiscosVendidos(int discosVendidos) {
        if(discosVendidos < 0){ throw new IllegalArgumentException("El número de discos vendidos de la banda debe ser >= 0"); }
        this.discosVendidos = discosVendidos;
    }

    public void aniadirIntegrantes(String integrante){
        integrantes.add(integrante);
    }

    public void getIntegrantes(){
        System.out.println("INTEGRANTES\n");
        for (String musicos : integrantes){
            System.out.println(musicos);
        }
    }


}
