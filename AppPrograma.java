package pastelpastel;

import java.util.Scanner;

public class AppPrograma {

	public static void main(String[] args) {

		FactoryRecheio r = new FactoryRecheio();
        System.err.println("BEM - VINDO A PAULISTA ");

        System.out.println("PASTEL DE : Carne ou Queijo");
		Scanner teclado = new Scanner(System.in);
		String dados = teclado.nextLine();

		Pastel pastel = new Pastel(r.obterRecheio(dados));
		pastel.printPastel();

		// TODO Auto-generated method stub

	}

}
