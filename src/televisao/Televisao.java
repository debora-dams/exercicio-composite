package televisao;

public class Televisao extends Component {

	private int canal;
	private int volume;

	public Televisao(int canal, int volume) {
		this.canal = canal;
		this.volume = volume;
	}
	
	public void adicionarVolume() {
		setVolume(getVolume() + 1);
	}

	public void adicionarCanal() {
		setCanal(getCanal() + 1);
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if ((canal < 1) || (canal > 20)) {
			canal = 1;
		}

		for (int i = canal; i <= 20; i++) {
			if (((i % 3) == 0) || ((i % 5) == 0)) {
				this.canal = i;

				break;
			}
		}

		System.out.println("Canal: " + getCanal());
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if ((volume >= 0) && (volume <= 50)) {
			this.volume = volume;
		}

		System.out.println("Volume: " + getVolume());
	}

}
