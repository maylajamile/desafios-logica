package desafio04;

public class Desafio04 {

	public void decifrar(String[] frases) {

		System.out.println("Frases decifradas:");

		for (int i = 0; i < frases.length; i++) {
			int meio = (frases[i].length() / 2);

			String primeiraParte = new StringBuilder(frases[i].substring(0, meio)).reverse().toString();
			String segundaParte = new StringBuilder(frases[i].substring(meio, frases[i].length())).reverse().toString();

			System.out.println(primeiraParte + segundaParte);
		}

	}

}
