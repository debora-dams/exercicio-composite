package televisao;

public class ControleRemoto {

	private Televisao tv;

	public ControleRemoto() {
		this.tv = new Televisao();
	}

	public int getCanal() {
		return this.tv.getCanal();
	}

	public int getVolume() {
		return this.tv.getVolume();
	}

	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}

}
