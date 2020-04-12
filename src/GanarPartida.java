
public class GanarPartida {

	public GanarPartida() {
		// TODO Auto-generated constructor stub
	}
	static boolean ganar(char ch) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (Partida.tabla[i][j]==ch) {
					if (i+3<=5) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (Partida.tabla[i+j2][j]==ch) {
								
							}else {
								break;
							}if (j2==3) {
								Partida.gaan=true;
								Partida.ganador=ch;
							}
							
						}
					}
					if (i-3>=0) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (Partida.tabla[i-j2][j]==ch) {
								
							}else {
								break;
							}
							if (j2==3) {
								Partida.gaan=true;
								Partida.ganador=ch;
							}
						}
					}
					if (j+3<=6) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (Partida.tabla[i][j+j2]==ch) {
								
							}else {
								break;
							}
							if (j2==3) {
								Partida.gaan=true;
								Partida.ganador=ch;
							}
						}
					}
					if (j-3>=0) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (Partida.tabla[i][j-j2]==ch) {
								
							}else {
								break;
							}
							if (j2==3) {
								Partida.gaan=true;
								Partida.ganador=ch;
							}
						}
					}
					
					
					if (i+3<=5&&j+3<=6) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (Partida.tabla[i+j2][j+j2]==ch) {
								
							}else {
								break;
							}if (j2==3) {
								Partida.gaan=true;
								Partida.ganador=ch;
							}
							
						}
					}
					if (i+3<=5&&j-3>=0) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (Partida.tabla[i+j2][j-j2]==ch) {
								
							}else {
								break;
							}if (j2==3) {
								Partida.gaan=true;
								Partida.ganador=ch;
							}
							
						}
					}
					if (i-3>=0&&j-3>=0) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (Partida.tabla[i-j2][j-j2]==ch) {
								
							}else {
								break;
							}if (j2==3) {
								Partida.gaan=true;
								Partida.ganador=ch;
							}
							
						}
					}
					if (i-3>=0&&j+3<=6) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (Partida.tabla[i-j2][j+j2]==ch) {
								
							}else {
								break;
							}if (j2==3) {
								Partida.gaan=true;
								Partida.ganador=ch;
							}
							
						}
					}
				}
			}
		}
		return true;
		
	}

}
