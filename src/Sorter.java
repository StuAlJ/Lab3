import java.util.Arrays;
import java.util.Random;
public class Sorter {
    public static void main(String[] args) {
        System.out.println("Test");
        Random random= new Random();
        int size = random.nextInt(2,20);
        int[] array= new int[size];
        for(int x=0; x<size;x++){
            array[x]= random.nextInt(100);
        }
        System.out.println("Original Array: "+Arrays.toString(array));
        selectionSort(array);
        System.out.println("After sort: "+Arrays.toString(array));
    }
    public static void selectionSort(int[] array){
        for(int y=0; y< array.length-1;y++){
            int currentMin= array[y];
            int currentMinIndex= y;
            for(int z=y+1; z<array.length;z++){
                if(currentMin>array[z]){
                    currentMin= array[z];
                    currentMinIndex= z;
                }
            }
            if(currentMinIndex!=y){
                array[currentMinIndex]= array[y];
                array[y]= currentMin;
            }
        }
    }

    public void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}

