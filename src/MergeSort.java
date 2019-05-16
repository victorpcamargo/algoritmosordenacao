public class MergeSort {

	public static void mergeSort(int[] vetor, int inicio, int meio, int fim) {

		int[] ax = new int[vetor.length];
		for (int i = inicio; i <= fim; i++) {
			ax[i] = vetor[i];
		}
		int i = inicio, j = meio + 1, x = inicio;
		while (i <= meio && j <= fim) {
			if (ax[i] < ax[j]) {
				vetor[x] = ax[i];
				i++;
			} else {
				vetor[x] = ax[j];
				j++;
			}
			x++;
		}
		while (i <= meio) {
			vetor[x] = ax[i];
			x += 1;
			i += 1;
		}
		while (j <= fim) {
			vetor[x] = ax[j];
			x += 1;
			j += 1;
		}

	}

	public void ordenaAlgoritmo(int[] vetor, int inicio, int fim) {

		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			ordenaAlgoritmo(vetor, inicio, meio);
			ordenaAlgoritmo(vetor, meio + 1, fim);
			mergeSort(vetor, inicio, meio, fim);

		}

	}

}