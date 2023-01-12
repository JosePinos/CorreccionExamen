package EJERCICIO_videojuegos;

public class Uso_videojuego {
    public static void main(String[] args) {

        MC_JAVA minecraft1 = new MC_JAVA(17.45, "Aventura", "Minecraft Java Edition",2010,11,30,
                "MOJANG", "A", "X-BOX, WINDOWS, MAC, PS4,5", 105464);

        GTA_5 gta_5 = new GTA_5(27.45, "Acción", "Grand Theft Auto 5",2013,9,17,
                "ROCKSTAR GAMES", "C", "X-BOX, WINDOWS, MAC, PS4,5", 105461);


        System.out.println(minecraft1.sinopsis());
        minecraft1.getmodosJuego();

        System.out.println("\n---------------------------------\n");

        System.out.println(gta_5.sinopsis());
        gta_5.getmodosJuego();

    }
}
