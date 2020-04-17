import java.util.ArrayList;
import java.util.Scanner;

public class Partida {
	Scanner in;
	int contTabla[];
	Datos info;
	GanarPartida win;
	String Primero;
	String Segundo;

	public Partida() {
		// TODO Auto-generated constructor stub
		int contTabla1[] = { 0, 0, 0, 0, 0, 0, 0 };
		contTabla = contTabla1;
		in = new Scanner(System.in);
		info = new Datos();
		win = new GanarPartida();
	}

	void empiezaPartida() {

		System.out.println("Juego de 4 en Raya");
		System.out.println();
		imprimirTabla();
		System.out.println("1 2 3 4 5 6 7");
		if (Math.random() * 9 + 1 > 5) {
			Primero = "Maquina";
		} else {
			Primero = "Persona";
		}
		info.setContTiradas(0);
	}

	boolean repetirTurno() {
		int cont = 0;
		for (int i : contTabla) {
			if (i != 6) {
				break;
			} else {
				cont++;
			}
		}
		if (cont == 7) {
			return true;
		}
		return false;

	}

	void turnos() {

		if (Primero.equals("Maquina")) {
			while (!tiradaMaquina())
				;
			if (!info.isConfirGanador()) {
				while (!tiradaReal())
					;
			}

		} else {
			while (!tiradaReal())
				;
			if (!info.isConfirGanador()) {
				while (!tiradaMaquina())
					;
			}

		}

	}

	boolean tiradaMaquina() {
		int valor;
		win.ganar('O');
		if (info.getProximaTirada() == -1) {
			valor = (int) (Math.random() * 6) + 1;
		} else {
			valor = info.getProximaTirada() + 1;
			info.setProximaTirada(-1);

		}

		return trycatch(valor, 'O');
	}

	boolean tiradaReal() {
		System.out.println("Seleccione el numero al cual desea meter la ficha");
		int valor = in.nextInt();
		return trycatch(valor, 'X');

	}

	boolean trycatch(int vaalor, char ch) {
		try {
			meterFicha(vaalor, ch);
		} catch (IndexOutOfBoundsException e) {
			return false;
		}
		return true;
	}

	void meterFicha(int posicion, char ficha) {
		if (!info.isConfirGanador()) {

			System.out.println("Metiendo fichaa");
			info.setChar(contTabla[posicion - 1], posicion - 1, ficha);
			contTabla[posicion - 1]++;
			System.out.println();
			imprimirTabla();
			win.ganar(ficha);

		}

	}

	void imprimirTabla() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("[" + info.getChar(5 - i, j) + "]");
			}
			System.out.println();
		}
	}

	void terminarPartida() {
		if (info.getCharGanador() == 'X') {
			System.out.println();
			System.out.println();
			System.out.println("*********************************************************************************");
			System.out.println("*********************************************************************************");
			System.out.println("*********************   Enhorabuena Has ganado la Partida   *********************");
			System.out.println("*********************************************************************************");
			System.out.println("*********************************************************************************");
		} else {
			System.out.println(
					"************************Vaya Has perido la Partida contra un bot************************");
		}
	}

}
