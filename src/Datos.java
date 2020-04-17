
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public  class Datos {
	int proximaTirada=-1;
	Scanner in;
	
	 int contTiradas;
	  boolean confirGanador;
	  char CharGanador;
	 char tabla[][] = { {'-','-','-','-','-','-','-'},
						{'-','-','-','-','-','-','-'},
						{'-','-','-','-','-','-','-'},
						{'-','-','-','-','-','-','-'},
						{'-','-','-','-','-','-','-'},
						{'-','-','-','-','-','-','-'}

};
	 
	 public Datos() {
		 in = new Scanner(System.in);
		 
	 }
	  
	  
	  public char[][] getTabla() {
		return tabla;
	}


	public void setTabla(char[][] tabla) {
		this.tabla = tabla;
	}


	public int getContTiradas() {
		return contTiradas;
	}


	public void setContTiradas(int contTiradas) {
		this.contTiradas = contTiradas;
	}


	public boolean isConfirGanador() {
		return confirGanador;
	}


	public void setConfirGanador(boolean confirGanador) {
		this.confirGanador = confirGanador;
	}


	public char getCharGanador() {
		return CharGanador;
	}


	public void setCharGanador(char charGanador) {
		CharGanador = charGanador;
	}


	public int getProximaTirada() {
		return proximaTirada;
	}


	public void setProximaTirada(int proximaTirada) {
		this.proximaTirada = proximaTirada;
	}
	public char getChar(int num1, int num2) {
		
		return tabla[num1][num2];
		
	}
	public void setChar(int num1, int num2, char a) {
		tabla[num1][num2]=a;		
		
	}

	
	
	
	
	
}
