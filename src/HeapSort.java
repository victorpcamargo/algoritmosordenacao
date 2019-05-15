public class HeapSort {
	public void ordenaAlgoritmo(int[] vetor) {
		int x = vetor.length, i, ax;

		for (i = x / 2 - 1; i >= 0; i--)
			heapSort(vetor, x, i);
		for (i = x - 1; i >= 0; i--) {
			ax = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = ax;
			heapSort(vetor, i, 0);
		}
	}

	public void heapSort(int[] vetor, int n, int i) {
		int maior = i, esq = 2 * i + 1, dir = 2 * i + 2;
		if (esq < n && vetor[esq] > vetor[maior])
			maior = esq;
		if (dir < n && vetor[dir] > vetor[maior])
			maior = dir;
		if (maior != i) {
			int troca = vetor[i];
			vetor[i] = vetor[maior];
			vetor[maior] = troca;
			heapSort(vetor, n, maior);
		}
	}
}