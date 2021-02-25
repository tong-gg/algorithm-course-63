import java.util.Arrays;

public class PigeonholeSort {
    private static void pigeonhole_sort(int arr[], int n){
        int min = arr[0];
        int max = arr[0];
        int range, i, j, index;

        for(int a = 0; a < n; a++){
            if(arr[a] > max){
                max = arr[a];
            }
            if(arr[a] < min){
                min = arr[a];
            }
        }

        range = max - min + 1;
        int[] p_hole = new int[range];
        Arrays.fill(p_hole, 0);

        for(i = 0; i < n; i++){
            p_hole[arr[i] - min]++;
        }

        index = 0;
        for(j = 0; j < range; j++){
            while(p_hole[j]-- > 0){
                arr[index++] = j + min;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9, 7, 2, 1, 3, 8, 5, 9};
        System.out.print("The original array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println("\n--- Pigeonhole Sort is processing ---");
        pigeonhole_sort(arr, arr.length);
        System.out.println("--- Sorting successfully ---");
        System.out.print("Sorted array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
