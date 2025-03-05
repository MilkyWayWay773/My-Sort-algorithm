import java.util.*;

public class SelectionSort {
    public static void selectionSort(int[] array){

        int n=array.length;

        for(int i = 0;i < n - 1;i++){
            int min = i; //とりあえず最小値
            for(int j = i + 1;j < n;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }

            //最終的な最小値をスワップする
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void main(String[] args){
        int[] array = {5, 3, 8, 4, 2, 10, 2, 5, 3, 2, 5, 100};
        System.out.println("ソート前: " + Arrays.toString(array));
        
        long startTime = System.nanoTime(); // 実行時間計測開始
        selectionSort(array);
        long endTime = System.nanoTime(); // 実行時間計測終了
        
        System.out.println("ソート後: " + Arrays.toString(array));
        System.out.println("実行時間: " + (endTime - startTime) + " ナノ秒");
    }
}
