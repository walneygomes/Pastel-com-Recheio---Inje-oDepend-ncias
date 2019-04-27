package pastelpastel;

import org.springframework.beans.factory.annotation.Autowired;

public class Pastel {
	@Autowired
	private Recheio recheio;

	public Pastel(Recheio r) {
		this.recheio = r;
	}

	public void printPastel() {
		System.out.println("Pastel de" + recheio.tipoRecheio());

	}

}
