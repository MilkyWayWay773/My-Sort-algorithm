import java.util.*;

public class InsertionSort {
    public static void insertionSort(int[] array){

        int n = array.length;

        for(int i = 1;i < n;i++){
            
            int key = array[i]; //フォーカスする値を決める
            int pre = i - 1;

            while(pre >= 0 && array[pre] > key){
                array[pre + 1] = array[pre]; //コピーする
                pre--;
            }

            array[pre + 1] = key;
        }
    }

    

    public static void main(String[] args){
        int[] array = {5, 3, 8, 4, 2, 10, 2, 5, 3, 2, 5, 100};
        System.out.println("ソート前: " + Arrays.toString(array));
        
        long startTime = System.nanoTime(); // 実行時間計測開始
        insertionSort(array);
        long endTime = System.nanoTime(); // 実行時間計測終了
        
        System.out.println("ソート後: " + Arrays.toString(array));
        System.out.println("実行時間: " + (endTime - startTime) + " ナノ秒");
    }
}
