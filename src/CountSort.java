/**
 * @author Victor Camargo
 * Classe responsavel por ordenar a lista utilizando o algoritimo CountSort
 *
 */
public class CountSort {

    public void ordenaAlgoritimo(int a[]){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        int [] temp = new int [max+1];
        for(int i=0; i < a.length; i++){
            temp[a[i]]=temp[a[i]]+1;
        }
        int indice = 0;
        for(int i=0; i < temp.length; i++){
            while(temp[i] > 0){
                a[indice] = i;
                indice++;
                temp[i]--;
            }
        }
    }
}
