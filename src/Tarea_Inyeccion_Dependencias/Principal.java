package Tarea_Inyeccion_Dependencias;

public class Principal {

	public static void main(String[] args) {
		Menu menu = new Menu();
        Dificultad dificultad = menu.seleccionarDificultad();

        // Inyección de dependencias
        Juego juego = new Juego(dificultad);
        juego.jugar();

	}

}
