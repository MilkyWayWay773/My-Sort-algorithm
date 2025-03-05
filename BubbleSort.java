import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] array){

        int n=array.length;

        boolean result;

        for(int i = 0;i < n - 1;i++){

            result = false;

            for(int j = 0;j < n - 1 - i;j++){
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

        bubbleSort(array);

        System.out.println("ソート後: " + Arrays.toString(array));
    }
}
