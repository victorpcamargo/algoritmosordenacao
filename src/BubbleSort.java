public class BubbleSort {
	public void ordenaAlgoritmo(int[] vetor) {

		int i, j, ax = 0, x = vetor.length;
		for (i = 0; i < x; i++) {
			for (j = 1; j < (x - i); j++) {
				if (vetor[j - 1] > vetor[j]) {

					ax = vetor[j - 1];
					vetor[j - 1] = vetor[j];
					vetor[j] = ax;
				}

			}
		}

	}
}
