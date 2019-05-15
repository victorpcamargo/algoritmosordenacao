import java.util.Arrays;
import java.util.Random;

/**
 * @author Victor Camargo
 * Classe com o main, responsavel por executar o programa
 *
 */

public class Executar {

    public static void main(String[] args) {

        /** Cria vetores de 100 ate 1000000 numeros **/
        int [] vetor100 = new int [50];
        int [] vetor1000 = new int [50];
        int [] vetor10000 = new int [50];
        int [] vetor100000 = new int [50];
        int [] vetor1000000 = new int [50];

        /** Instancia um objeto da classe Random **/
        Random geranums = new Random();

        /** Gera a sequencia de numeros definidos para o vetor **/
        for (int i = 0; i < vetor100.length; i++){
            vetor100[i]=geranums.nextInt(100);
        }
        for (int i = 0; i < vetor1000.length; i++){
            vetor1000[i]=geranums.nextInt(1000);
        }
        for (int i = 0; i < vetor10000.length; i++){
            vetor10000[i]=geranums.nextInt(10000);
        }
        for (int i = 0; i < vetor100000.length; i++){
            vetor100000[i]=geranums.nextInt(100000);
        }
        for (int i = 0; i < vetor1000000.length; i++){
            vetor1000000[i]=geranums.nextInt(1000000);
        }

        /** Imprime os vetores com os numeros randomicos **/
        System.out.println("===============================================================================================================================================================================================================================================");
        System.out.println("Array desordenado com valores até 100");
        System.out.println(Arrays.toString(vetor100));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Array desordenado com valores até 1000");
        System.out.println(Arrays.toString(vetor1000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Array desordenado com valores até 10000");
        System.out.println(Arrays.toString(vetor10000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Array desordenado com valores até 100000");
        System.out.println(Arrays.toString(vetor100000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Array desordenado com valores até 1000000");
        System.out.println(Arrays.toString(vetor1000000));
        System.out.println("===============================================================================================================================================================================================================================================");

        /** Define os valores de tempo inicial e tempo final **/
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal = System.currentTimeMillis();

        System.out.println("===============================================================================================================================================================================================================================================");
        /** Instancia a classe QuickSort e chama seu metodo de ordenacao **/
        QuickSort quickSort = new QuickSort();

        System.out.println("QuickSort 100");
        tempoInicial = System.currentTimeMillis();
        quickSort.ordenaAlgoritimo(vetor100,0,vetor100.length-1);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor100));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("QuickSort 1000");
        tempoInicial = System.currentTimeMillis();
        quickSort.ordenaAlgoritimo(vetor1000,0,vetor1000.length-1);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor1000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("QuickSort 10000");
        tempoInicial = System.currentTimeMillis();
        quickSort.ordenaAlgoritimo(vetor10000,0,vetor10000.length-1);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor10000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("QuickSort 100000");
        tempoInicial = System.currentTimeMillis();
        quickSort.ordenaAlgoritimo(vetor100000,0,vetor100000.length-1);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor100000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("QuickSort 1000000");
        tempoInicial = System.currentTimeMillis();
        quickSort.ordenaAlgoritimo(vetor1000000,0,vetor1000000.length-1);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor1000000));
        System.out.println("===============================================================================================================================================================================================================================================");

        System.out.println("===============================================================================================================================================================================================================================================");
        /** Instancia a classe CountSort e chama seu metodo de ordenacao **/
        CountSort countSort = new CountSort();

        System.out.println("CountSort 100");
        tempoInicial = System.currentTimeMillis();
        int [] copia100 = vetor100.clone();
        vetor100 = copia100.clone();
        countSort.ordenaAlgoritimo(vetor100);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor100));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("CountSort 1000");
        tempoInicial = System.currentTimeMillis();
        int [] copia1000 = vetor1000.clone();
        vetor1000 = copia1000.clone();
        countSort.ordenaAlgoritimo(vetor1000);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor1000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("CountSort 10000");
        tempoInicial = System.currentTimeMillis();
        int [] copia10000 = vetor10000.clone();
        vetor10000 = copia10000.clone();
        countSort.ordenaAlgoritimo(vetor10000);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor10000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("CountSort 100000");
        tempoInicial = System.currentTimeMillis();
        int [] copia100000 = vetor100000.clone();
        vetor100000 = copia100000.clone();
        countSort.ordenaAlgoritimo(vetor100000);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor100000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("CountSort 1000000");
        tempoInicial = System.currentTimeMillis();
        int [] copia1000000 = vetor1000000.clone();
        vetor1000000 = copia1000000.clone();
        countSort.ordenaAlgoritimo(vetor1000000);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor1000000));
        System.out.println("===============================================================================================================================================================================================================================================");

        System.out.println("===============================================================================================================================================================================================================================================");
        /** Instancia a classe BucketSort e chama seu metodo de ordenacao **/
        BucketSort bucketSort = new BucketSort();

        System.out.println("BucketSort 100");
        tempoInicial = System.currentTimeMillis();
        bucketSort.ordenaAlgoritimo(vetor100, 100);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor100));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("BucketSort 1000");
        tempoInicial = System.currentTimeMillis();
        bucketSort.ordenaAlgoritimo(vetor1000, 1000);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor1000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("BucketSort 10000");
        tempoInicial = System.currentTimeMillis();
        bucketSort.ordenaAlgoritimo(vetor10000, 10000);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor10000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("BucketSort 100000");
        tempoInicial = System.currentTimeMillis();
        bucketSort.ordenaAlgoritimo(vetor100000, 100000);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor100000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("BucketSort 1000000");
        tempoInicial = System.currentTimeMillis();
        bucketSort.ordenaAlgoritimo(vetor1000000, 1000000);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor1000000));
        System.out.println("===============================================================================================================================================================================================================================================");

        System.out.println("===============================================================================================================================================================================================================================================");
        /** Instancia a classe RadixSort e chama seu metodo de ordenacao **/
        RadixSort radixSort = new RadixSort();

        System.out.println("RadixSort 100");
        tempoInicial = System.currentTimeMillis();
        radixSort.sort(vetor100);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor100));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("RadixSort 1000");
        tempoInicial = System.currentTimeMillis();
        radixSort.sort(vetor1000);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor1000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("RadixSort 10000");
        tempoInicial = System.currentTimeMillis();
        radixSort.sort(vetor10000);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor10000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("RadixSort 100000");
        tempoInicial = System.currentTimeMillis();
        radixSort.sort(vetor100000);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor100000));
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("RadixSort 1000000");
        tempoInicial = System.currentTimeMillis();
        radixSort.sort(vetor1000000);
        tempoFinal = System.currentTimeMillis();
        System.out.println(tempoFinal - tempoInicial + " ms");
        System.out.println(Arrays.toString(vetor1000000));
        System.out.println("===============================================================================================================================================================================================================================================");
    }
}