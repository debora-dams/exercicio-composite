package televisao;

public class Televisao {

	private int canal;
	private int volume;

	public Televisao() {

	}

	public Televisao(int canal, int volume) {
		this.canal = canal;
		this.volume = volume;
	}

	public void addCanal() {
		setCanal(getCanal() + 1);
	}

	public void addVolume() {
		setVolume(getVolume() + 1);
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if ((canal < 1) || (canal > 500)) {
			canal = 1;
		}

		for (int i = canal; i <= 500; i++) {
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
