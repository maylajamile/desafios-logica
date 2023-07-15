package desafio02;

public class Desafio02 {

	public void decompor(double valor) {
		int [] notas = {100, 50, 20, 10, 5, 2};
		double [] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
		
		int [] quantNotas = new int[notas.length];
		int [] quantMoedas = new int[moedas.length];
		
		for (int i = 0; i < notas.length; i++) {
			int quantidade = (int)(valor / notas[i]);
			quantNotas[i] = quantidade;
			valor -= quantidade * notas[i];
		}
		
		System.out.println("NOTAS:");
		for (int i = 0; i < quantNotas.length; i++) {
	    	System.out.println(quantNotas[i] + " nota(s) de R$ " + notas[i]);
	    }
		
		for (int i = 0; i < moedas.length; i++) {
			int quantidade = (int)(valor / moedas[i]);
			quantMoedas[i] = quantidade;
			valor -= quantidade * moedas[i];
		}
		
		System.out.println("MOEDAS:");
		for (int i = 0; i < quantMoedas.length; i++) {
	    	System.out.println(quantMoedas[i] + " moedas(s) de R$ " + moedas[i]);
	    }
		
	}


}
