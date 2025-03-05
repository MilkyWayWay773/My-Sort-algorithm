import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] array){
        int n = array.length;
        boolean result;

        for(int i = 0; i < n - 1; i++){
            result = false; //入れ替えが発生しない場合は終了する

            for(int j = 0; j < n - 1 - i; j++){ //終わった部分を省くため-iとする
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    result = true;
                }
            }

            if(!result){
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {5, 3, 8, 4, 2, 10, 2, 5, 3, 2, 5, 100};
        System.out.println("ソート前: " + Arrays.toString(array));
        
        long startTime = System.nanoTime(); // 実行時間計測開始
        bubbleSort(array);
        long endTime = System.nanoTime(); // 実行時間計測終了
        
        System.out.println("ソート後: " + Arrays.toString(array));
        System.out.println("実行時間: " + (endTime - startTime) + " ナノ秒");
    }
}
