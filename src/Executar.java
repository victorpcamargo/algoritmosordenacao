import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Victor Camargo Classe com o main, responsavel por executar o programa
 *
 */

public class Executar {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		/** Cria vetores de 100 ate 1000000 numeros **/
		int[] vetor100 = new int[50];
		int[] vetor1000 = new int[50];
		int[] vetor10000 = new int[50];
		int[] vetor100000 = new int[50];
		int[] vetor1000000 = new int[50];

		/** Instancia um objeto da classe Random **/
		Random geranums = new Random();

		/** Gera a sequencia de numeros definidos para o vetor **/
		for (int i = 0; i < vetor100.length; i++) {
			vetor100[i] = geranums.nextInt(100);
		}
		for (int i = 0; i < vetor1000.length; i++) {
			vetor1000[i] = geranums.nextInt(1000);
		}
		for (int i = 0; i < vetor10000.length; i++) {
			vetor10000[i] = geranums.nextInt(10000);
		}
		for (int i = 0; i < vetor100000.length; i++) {
			vetor100000[i] = geranums.nextInt(100000);
		}
		for (int i = 0; i < vetor1000000.length; i++) {
			vetor1000000[i] = geranums.nextInt(1000000);
		}

		/** Imprime os vetores com os numeros randomicos **/
		System.out.println(
				"===============================================================================================================================================================================================================================================");
		System.out.println("Array desordenado com valores ate 100");
		System.out.println(Arrays.toString(vetor100));
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Array desordenado com valores ate 1000");
		System.out.println(Arrays.toString(vetor1000));
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Array desordenado com valores ate 10000");
		System.out.println(Arrays.toString(vetor10000));
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Array desordenado com valores ate 100000");
		System.out.println(Arrays.toString(vetor100000));
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Array desordenado com valores ate 1000000");
		System.out.println(Arrays.toString(vetor1000000));
		System.out.println(
				"===============================================================================================================================================================================================================================================");

		/** Define os valores de tempo inicial e tempo final **/
		long tempoInicialms = System.currentTimeMillis();
		long tempoFinalms = System.currentTimeMillis();
		long tempoInicialns = System.nanoTime();
		long tempoFinalns = System.nanoTime();
		int opcao = 0;
		do {
			System.out.println("\n\n  - Metodos de Ordenacao ");
			System.out.println("\n==================================");
			System.out.println("|     1 - BubbleSort             |");
			System.out.println("|     2 - BucketSort             |");
			System.out.println("|     3 - CountSort              |");
			System.out.println("|     4 - HeapSort               |");
			System.out.println("|     5 - InsertionSort          |");
			System.out.println("|     6 - MergeSort              |");
			System.out.println("|     7 - QuickSort              |");
			System.out.println("|     8 - RadixSort              |");
			System.out.println("|     9 - SelectionSort          |");
			System.out.println("|     0 - Sair                   |");
			System.out.println("==================================\n");
			System.out.println("Escolha um metodo de ordenacao:");
			opcao = x.nextInt();
			System.out.println(
					"===============================================================================================================================================================================================================================================");

			System.out.println(
					"===============================================================================================================================================================================================================================================");

			System.out.print("\n");
			switch (opcao) {
				case 1:
					BubbleSort bubbleSort = new BubbleSort();
					System.out.println("BubbleSort 100");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					bubbleSort.ordenaAlgoritmo(vetor100);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					System.out.println("BubbleSort 1000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					bubbleSort.ordenaAlgoritmo(vetor1000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("BubbleSort 10000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					bubbleSort.ordenaAlgoritmo(vetor10000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor10000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("BubbleSort 100000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					bubbleSort.ordenaAlgoritmo(vetor100000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("BubbleSort 1000000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					bubbleSort.ordenaAlgoritmo(vetor1000000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000000));
					System.out.println(
							"===============================================================================================================================================================================================================================================");

					System.out.println(
							"===============================================================================================================================================================================================================================================");
					break;
				case 2:
					BucketSort bucketSort = new BucketSort();

					System.out.println("BucketSort 100");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					bucketSort.ordenaAlgoritimo(vetor100, 100);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("BucketSort 1000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					bucketSort.ordenaAlgoritimo(vetor1000, 1000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("BucketSort 10000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					bucketSort.ordenaAlgoritimo(vetor10000, 10000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor10000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("BucketSort 100000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					bucketSort.ordenaAlgoritimo(vetor100000, 100000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("BucketSort 1000000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					bucketSort.ordenaAlgoritimo(vetor1000000, 1000000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000000));
					System.out.println(
							"===============================================================================================================================================================================================================================================");

					System.out.println(
							"===============================================================================================================================================================================================================================================");
					break;
				case 3:
					CountSort countSort = new CountSort();

					System.out.println("CountSort 100");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					int[] copia100 = vetor100.clone();
					vetor100 = copia100.clone();
					countSort.ordenaAlgoritimo(vetor100);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("CountSort 1000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					int[] copia1000 = vetor1000.clone();
					vetor1000 = copia1000.clone();
					countSort.ordenaAlgoritimo(vetor1000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("CountSort 10000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					int[] copia10000 = vetor10000.clone();
					vetor10000 = copia10000.clone();
					countSort.ordenaAlgoritimo(vetor10000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor10000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("CountSort 100000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					int[] copia100000 = vetor100000.clone();
					vetor100000 = copia100000.clone();
					countSort.ordenaAlgoritimo(vetor100000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("CountSort 1000000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					int[] copia1000000 = vetor1000000.clone();
					vetor1000000 = copia1000000.clone();
					countSort.ordenaAlgoritimo(vetor1000000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000000));
					System.out.println(
							"===============================================================================================================================================================================================================================================");

					System.out.println(
							"===============================================================================================================================================================================================================================================");
					break;
				case 4:
					HeapSort heapSort = new HeapSort();
					System.out.println("HeapSort 100");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					heapSort.ordenaAlgoritmo(vetor100);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println((tempoFinalms - tempoInicialms + " ms"));
					System.out.println(Arrays.toString(vetor100));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("HeapSort 1000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					heapSort.ordenaAlgoritmo(vetor1000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println((tempoFinalms - tempoInicialms + " ms"));
					System.out.println(Arrays.toString(vetor1000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("HeapSort 10000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					heapSort.ordenaAlgoritmo(vetor10000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println((tempoFinalms - tempoInicialms + " ms"));
					System.out.println(Arrays.toString(vetor10000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("HeapSort 100000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					heapSort.ordenaAlgoritmo(vetor100000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println((tempoFinalms - tempoInicialms + " ms"));
					System.out.println(Arrays.toString(vetor100000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("HeapSort 1000000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					heapSort.ordenaAlgoritmo(vetor1000000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println((tempoFinalms - tempoInicialms + " ms"));
					System.out.println(Arrays.toString(vetor1000000));
					System.out.println(
							"===============================================================================================================================================================================================================================================");

					System.out.println(
							"===============================================================================================================================================================================================================================================");
					break;
				case 5:
					InsertionSort insertionSort = new InsertionSort();
					System.out.println("InsertionSort 100");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					insertionSort.ordenaAlgoritmo(vetor100);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println((tempoFinalms - tempoInicialms + " ms"));
					System.out.println(Arrays.toString(vetor100));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("InsertionSort 1000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					insertionSort.ordenaAlgoritmo(vetor1000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println((tempoFinalms - tempoInicialms + " ms"));
					System.out.println(Arrays.toString(vetor1000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("InsertionSort 10000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					insertionSort.ordenaAlgoritmo(vetor10000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println((tempoFinalms - tempoInicialms + " ms"));
					System.out.println(Arrays.toString(vetor10000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("InsertionSort 100000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					insertionSort.ordenaAlgoritmo(vetor100000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println((tempoFinalms - tempoInicialms + " ms"));
					System.out.println(Arrays.toString(vetor100000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("InsertionSort 1000000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					insertionSort.ordenaAlgoritmo(vetor1000000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println((tempoFinalms - tempoInicialms + " ms"));
					System.out.println(Arrays.toString(vetor1000000));
					System.out.println(
							"===============================================================================================================================================================================================================================================");

					System.out.println(
							"===============================================================================================================================================================================================================================================");
					break;
				case 6:
					MergeSort mergeSort = new MergeSort();
					System.out.println("MergeSort 100");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					mergeSort.ordenaAlgoritmo(vetor100, 0, vetor100.length - 1);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("MergeSort 1000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					mergeSort.ordenaAlgoritmo(vetor1000, 0, vetor1000.length - 1);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("MergeSort 10000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					mergeSort.ordenaAlgoritmo(vetor10000, 0, vetor10000.length - 1);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor10000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("MergeSort 100000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					mergeSort.ordenaAlgoritmo(vetor100000, 0, vetor100000.length - 1);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("MergeSort 1000000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					mergeSort.ordenaAlgoritmo(vetor1000000, 0, vetor1000000.length - 1);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000000));
					System.out.println(
							"===============================================================================================================================================================================================================================================");

					System.out.println(
							"===============================================================================================================================================================================================================================================");
					break;
				case 7:
					QuickSort quickSort = new QuickSort();
					System.out.println("QuickSort 100");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					quickSort.ordenaAlgoritimo(vetor100, 0, vetor100.length - 1);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("QuickSort 1000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					quickSort.ordenaAlgoritimo(vetor1000, 0, vetor1000.length - 1);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("QuickSort 10000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					quickSort.ordenaAlgoritimo(vetor10000, 0, vetor10000.length - 1);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor10000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("QuickSort 100000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					quickSort.ordenaAlgoritimo(vetor100000, 0, vetor100000.length - 1);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("QuickSort 1000000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					quickSort.ordenaAlgoritimo(vetor1000000, 0, vetor1000000.length - 1);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000000));
					System.out.println(
							"===============================================================================================================================================================================================================================================");

					System.out.println(
							"===============================================================================================================================================================================================================================================");
					break;
				case 8:
					RadixSort radixSort = new RadixSort();

					System.out.println("RadixSort 100");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					radixSort.sort(vetor100);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("RadixSort 1000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					radixSort.sort(vetor1000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("RadixSort 10000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					radixSort.sort(vetor10000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor10000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("RadixSort 100000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					radixSort.sort(vetor100000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("RadixSort 1000000");
					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					radixSort.sort(vetor1000000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000000));
					System.out.println(
							"===============================================================================================================================================================================================================================================");
					break;
				case 9:
					SelectionSort selectionSort = new SelectionSort();
					System.out.println("SelectionSort 100");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					selectionSort.ordenaAlgoritmo(vetor100);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

					System.out.println("SelectionSort 1000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					selectionSort.ordenaAlgoritmo(vetor1000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("SelectionSort 10000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					selectionSort.ordenaAlgoritmo(vetor10000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor10000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("SelectionSort 100000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					selectionSort.ordenaAlgoritmo(vetor100000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor100000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println("SelectionSort 1000000");

					tempoInicialms = System.currentTimeMillis();
					tempoInicialns = System.nanoTime();
					selectionSort.ordenaAlgoritmo(vetor1000000);
					tempoFinalms = System.currentTimeMillis();
					tempoFinalns = System.nanoTime();
					System.out.println(tempoFinalns - tempoInicialns + " ns");
					System.out.println(tempoFinalms - tempoInicialms + " ms");
					System.out.println(Arrays.toString(vetor1000000));
					System.out.println(
							"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("Opcao Invalida!");
					break;
			}
		} while (opcao != 0);
	}
}
