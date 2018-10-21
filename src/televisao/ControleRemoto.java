package televisao;

public class ControleRemoto extends Component {

	private Televisao tv;

	public Televisao getTv() {
		return tv;
	}

	public void setTv(Televisao tv) {
		this.tv = tv;
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
