package EJERCICIO_artistas;

public class Uso_artistas {
    public static void main(String[] args) {

        Banda b1 = new Banda(1910,2030,"Gerberchiklestan", "Homero",
                "Viejitos", 3, 450);

        int tama = b1.getNombre().length();
        String format = "Nombre: %"+(tama+4)+"s%n";
        String format1 = "Origen: %"+(b1.getOrigen().length()+4)+"s%n";
        //System.out.println("tama: " + tama);
        //System.out.println("format: " + format);

        //System.out.printf("\n\nNombre: %10s%n",b1.getNombre());
        //System.out.printf("Origen: %10s%n",b1.getOrigen());
        System.out.printf(format,b1.getNombre());
        System.out.printf(format1,b1.getOrigen());
        System.out.printf("Género: %10s%n",b1.getGenero());

        b1.aniadirIntegrantes("Lucas");  b1.aniadirIntegrantes("George");  b1.aniadirIntegrantes("Phill");
        b1.getIntegrantes();

        System.out.println("Álbumes: "+b1.getAlbumes());
        System.out.println("Discos vendidos: " + b1.getDiscosVendidos());
        System.out.println("Presentes desde: " + b1.getInicioActividad()+ " - " + b1.getFinActividad());

        System.out.println(b1.proximaPresentacion(2023,1,13));


    }
}
