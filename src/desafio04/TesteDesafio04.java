package desafio04;

import java.util.Scanner;

public class TesteDesafio04 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantas frases deseja decifrar?");
		int quantidade = Integer.parseInt(scanner.nextLine());
		System.out.println("Digite as frases:");
		
		String [] frases = new String[quantidade];
		for (int i = 0; i < quantidade; i++) {
			frases[i] = scanner.nextLine();
		}
		
		new Desafio04().decifrar(frases);
		scanner.close();
	}
}
