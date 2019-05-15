public class RadixSort {

	public void sort(int[] a) {

		/*
		 * @param i   = contador
		 * @param m   = maior numero do array
		 * @param exp = numero de digitos do maior numero do array
		 * @param n   = numero de repeticoes no array.
		 * @param b   = index do array.
		 */

		int i, m = a[0], exp = 1, n = a.length;
		int[] b = new int[a.length];

		/** identifica o maior numero do array **/
		for (i = 1; i < n; i++) {
			if (a[i] > m) {
				m = a[i];
			}
		}

		while ((m / exp) > 0) {
			/** @param bucket = buckets utilizado para ordenar as repeticoes **/
			int[] bucket = new int[10];

			/** Identifica a quantidade de numeros em cada bucket **/
			for (i = 0; i < n; i++) {
				bucket[a[i] / exp % 10]++;
			}

			/** Cria o index para o calculo **/
			for (i = 1; i < 10; i++) {
				bucket[i] += bucket[i - 1];
			}

			/** Inserir valores do array no respectivo bucket **/
			for (i = n - 1; i >= 0; i--) {
				b[--bucket[a[i] / exp % 10]] = a[i];
			}

			/** Orgnazina o array de acordo com a ordem dos buckets **/
			for (i = 0; i < n; i++) {
				a[i] = b[i];
			}

			/** Se move para o proximo digito **/
			exp *= 10;
		}
	}
}