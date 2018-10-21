package principal;

import televisao.ControleRemoto;

public class App {
	
	public static void main(String[] args) {
		ControleRemoto controle = new ControleRemoto();
		
		controle.adicionarCanal(); // Canal: 5
	    controle.adicionarCanal(); // Canal: 6
	    controle.adicionarCanal(); // Canal: 9
	    
	    controle.adicionarVolume(); // Volume: 1
	    
	    controle.setCanal(200); // Canal: 500
	    controle.adicionarCanal(); // Canal: 3
	    controle.adicionarCanal(); // Canal: 5
	    
	    controle.adicionarVolume(); // Volume: 2
	}

}
