package desafio01;

public class Desafio01 {

	public void ordenarNumeros(int[] array) {
		int[] pares = new int[array.length];
        int[] impares = new int[array.length];
        int numPares = 0;
        int numImpares = 0;
        
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
                pares[numPares] = array[i];
                numPares++;
            } else {
                impares[numImpares] = array[i];
                numImpares++;
            }
		}
		
		System.out.println("Números ordenados:");
		bubbleSort(pares, numPares, true);
		imprimir(pares);
		bubbleSort(impares, numImpares, false);
		imprimir(impares);
	}
	
	private static void bubbleSort(int[] array, int tamanho, boolean ordemCrescente) {
	    for (int i = 0; i < tamanho - 1; i++) {
	        for (int j = 0; j < tamanho - i - 1; j++) {
	            if (ordemCrescente) {
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            } else {
	                if (array[j] < array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }
	}
	
	private void imprimir(int[] array) {
	    for (int i = 0; i < array.length; i++) {
	        if (array[i] != 0) {
	            System.out.println(array[i]);
	        }
	    }
	}

}
