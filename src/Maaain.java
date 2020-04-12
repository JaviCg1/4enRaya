
public class Maaain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Partida uno = new Partida();
		uno.empiezaPartida();
		
		while (uno.repetirTurno()==false&&uno.gaan==false) {
			uno.turnos();
			
		}
		uno.terminarPartida();
		
	}

}
