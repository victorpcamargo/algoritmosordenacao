public class InsertionSort {
	public void ordenaAlgoritmo(int[] vetor) {
		int j, x = vetor.length;
		for (j = 1; j < x; j++) {
			int chave = vetor[j], i = j - 1;
			while ((i > -1) && (vetor[i] > chave)) {
				vetor[i + 1] = vetor[i];
				i--;
			}
			vetor[i + 1] = chave;
		}
	}
}