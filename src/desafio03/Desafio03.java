package desafio03;

public class Desafio03 {

	public void definirPares(int[] array, int valorAlvo) {
		
		int quantPares = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if ((array[i] - array[j]) == valorAlvo) {
					quantPares++;
				}
			}
		}
		
		System.out.println("O número de pares que satisfazem o critério é: " + quantPares);
	}

}
