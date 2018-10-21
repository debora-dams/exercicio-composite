package principal;

import televisao.ControleRemoto;

public class CompositeDemo {
	
	public static void main(String[] args) {
		ControleRemoto cr = new ControleRemoto();
		
		cr.adicionarCanal(); // Canal: 5
		cr.adicionarCanal(); // Canal: 6
		cr.adicionarCanal(); // Canal: 9
	    
		cr.adicionarVolume(); // Volume: 1
	    
		cr.setCanal(200); // Canal: 500
		cr.adicionarCanal(); // Canal: 3
		cr.adicionarCanal(); // Canal: 5
	    
		cr.adicionarVolume(); // Volume: 2
	}

}
