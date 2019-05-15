public class SelectionSort {
	public void ordenaAlgoritmo(int[] vetor) {
		int i, j;
		for (i = 0; i < vetor.length - 1; i++) {
			int indice = i;
			for (j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[indice]) {
					indice = j;
				}
			}
			int menor = vetor[indice];
			vetor[indice] = vetor[i];
			vetor[i] = menor;
		}
	}
}
