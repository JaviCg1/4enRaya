
/**
 * Clase Maain
 *
 * Juego 4 en raya por consola
 *
 * @author JaviCg
 * @version 1.0
 */

public class Maaain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partida uno = new Partida();
		uno.empiezaPartida();
		
		while (!uno.repetirTurno()&&!uno.gaan) {
			uno.turnos();
			
		}
		uno.terminarPartida();
		
	}

}
