package Tarea_Inyeccion_Dependencias;
import java.util.Random;

public class Medio implements Dificultad {
	
	public int generarNumeroAleatorio() {
        return new Random().nextInt(50) + 1; // Números entre 1 y 50
    }

    public int getIntentosPermitidos() {
        return 4; // 4 intentos
    }
}
