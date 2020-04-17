/**
 * Clase ganar partida
 *
 * Comprobacion si hay linea de 4 
 */
public class GanarPartida {
	Datos info;
	public GanarPartida() {
		// TODO Auto-generated constructor stub
		
	}
	 
	public boolean ganar(char ch) {	
		info = new Datos();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (info.getChar(i, j )==ch) {
					if (i+3<=5) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (info.getChar(i+j2, j )==ch) {
								
							}else {
								if (j2==3&&info.getChar(i+j2, j )=='-') {	
									info.proximaTirada=j;
								}
								break;
								
							}if (j2==3) {
								info.setConfirGanador(true);
								info.setCharGanador(ch);
							}
							
						}
					}
					
					if (j+3<=6) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (info.getChar(i, j+j2 )==ch) {
								
							}else {
								if (j2==3&&info.getChar(i, j+j2 )=='-') {	
									if (i==0) {
										info.setProximaTirada(j+j2);
									}else if(info.getChar(i-1, j+j2 )!='-') {
										info.setProximaTirada(j+j2);
									}
								}
								break;
							}
							if (j2==3) {
								info.setConfirGanador(true);
								info.setCharGanador(ch);
							}
						}
					}
					
					if (j-3>=0) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (info.getChar(i, j-j2 )==ch) {
								
							}else {
								if (j2==3&&info.getChar(i, j-j2 )=='-') {	
									if (i==0) {
										info.setProximaTirada(j-j2);
									}else if(info.getChar(i-1, j-j2 )!='-') {
										info.setProximaTirada(j-j2);
									}
									
								}
								break;
							}
							if (j2==3) {
								info.setConfirGanador(true);
								info.setCharGanador(ch);
							}
						}
					}
					
					
					
					if (i+3<=5&&j+3<=6) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (info.getChar(i+j2, j+j2 )==ch) {
								
							}else {
								if (j2==3&&info.getChar(i+j2, j+j2 )=='-'&&info.getChar(i+j2-1, j+j2 )!='-') {	
									info.setProximaTirada(j+j2);
								}
								break;
							}if (j2==3) {
								info.setConfirGanador(true);
								info.setCharGanador(ch);
							}
							
						}
					}
					
					
					if (i-3>=0&&j+3<=6) {
						for (int j2 = 1; j2 <= 3; j2++) {
							if (info.getChar(i-j2, j+j2 )==ch) {
								
							}else {
								if (j2==3&&info.getChar(i-j2, j+j2 )=='-'&&info.getChar(i-j2, j+j2 )!='-') {	
									info.setProximaTirada(j+j2);
								}
								break;
							}if (j2==3) {
								info.setConfirGanador(true);
								info.setCharGanador(ch);
							}
							
						}
					}
				}
			}
		}
		return true;
		
	}

}
