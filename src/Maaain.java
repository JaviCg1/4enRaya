
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
		Partida start = new Partida();
		Datos info = new Datos();
		start.empiezaPartida();
		
		while (!start.repetirTurno()&&!info.isConfirGanador()) {
			start.turnos();
			
		}
		start.terminarPartida();
		
	}

}
