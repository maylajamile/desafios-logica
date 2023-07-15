package desafio02;

import java.util.Locale;
import java.util.Scanner;

public class TesteDesafio02 {

	public static void main(String[] args) {
		// useLocale - para receber o valor com . em vez de ,
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite um valor em dinheiro:");
		double valor = scanner.nextDouble();

		if (!(valor < 0 || valor > 1000000.00)) {
			new Desafio02().decompor(valor);
		} else {
			System.out.println("Valor digitado inválido!");
		}

		scanner.close();

	}
}
