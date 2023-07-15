package desafio01;

import java.util.Scanner;

public class TesteDesafio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a quantidade de números que será digitado:");
		int quantNumeros = scanner.nextInt();

		int[] array = new int[quantNumeros];
		for (int i = 0; i < quantNumeros; i++) {
			System.out.println("Digite o número:");
			array[i] = scanner.nextInt();
		}

		new Desafio01().ordenarNumeros(array);
		scanner.close();

	}
}
