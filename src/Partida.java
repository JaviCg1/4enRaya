/**
 * Clase Partida
 *
 * Estructura
 *
 * @author JaviCg
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Partida {
	static char tabla[][] = {  {'-','-','-','-','-','-','-'},
						{'-','-','-','-','-','-','-'},
						{'-','-','-','-','-','-','-'},
						{'-','-','-','-','-','-','-'},
						{'-','-','-','-','-','-','-'},
						{'-','-','-','-','-','-','-'}

};
	 int contTabla[]= {0,0,0,0,0,0,0};
	 String Primero;
	 String Segundo;
	 int contTiradas;
	 static boolean gaan;
	 static char ganador;
	
	Scanner in;
	public Partida() {
		 
	 in = new Scanner(System.in);
	}
	
	
	void empiezaPartida(){
		System.out.println("Juego de 4 en Raya");
		System.out.println();
		imprimirTabla();
		System.out.println("1 2 3 4 5 6 7");
		if (Math.random()*9+1>5) {
			Primero="Maquina";
		}else {
			Primero="Persona";
		}
		contTiradas=0;	
	}
	boolean repetirTurno(){
		
		return false;
		
	}
	void turnos() {
		
			if (Primero.equals("Maquina")){
				while(!tiradaMaquina());
				if (gaan==false) {
					while(!tiradaReal());
				}
				
			}else {
				while(!tiradaReal());
				if (gaan==false) {
					while(!tiradaMaquina());
				}
				
			}
			
	}
	
	
	
	boolean tiradaMaquina() {
			int valor=(int) (Math.random()* 6)+1;
			return trycatch(valor, 'O');	
	}			
	
	boolean tiradaReal() {
		System.out.println("Seleccione el numero al cual desea meter la ficha");
		int valor=in.nextInt();
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
		if (gaan) {
		
		
			
		}else {
			System.out.println("Metiendo fichaa");
			tabla[contTabla[posicion-1]][posicion-1]=ficha;	
			contTabla[posicion-1]++;
			imprimirTabla();
			GanarPartida.ganar(ficha);
		}
		
	}
	
	void imprimirTabla() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print("["+tabla[5-i][j]+"]");
			}
			System.out.println();
		}
	}
	
	void terminarPartida() {
		if (ganador=='X') {
			System.out.println();
			System.out.println();
			System.out.println("*********************************************************************************");
			System.out.println("*********************************************************************************");
			System.out.println("*********************   Enhorabuena Has ganado la Partida   *********************");
			System.out.println("*********************************************************************************");
			System.out.println("*********************************************************************************");
		}else {
			System.out.println("************************Vaya Has perido la Partida contra un bot************************");
		}
	}
}
