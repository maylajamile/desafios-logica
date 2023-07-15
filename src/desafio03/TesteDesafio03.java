package desafio03;

import java.util.Scanner;

public class TesteDesafio03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o tamanho do array:");
		int tamanho = scanner.nextInt();

		int[] array = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite o numero que será inserido na posição " + i + " do array:");
			array[i] = scanner.nextInt();
		}

		System.out.println("Agora, digite o valor alvo:");
		int valorAlvo = scanner.nextInt();

		new Desafio03().definirPares(array, valorAlvo);
		scanner.close();
	}

}
