//Longest Increasing Subsequence Problem
import java.util.ArrayList;
import java.util.Arrays;

public class LIS {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 0, 7, 3, 4, 6, 99, 10, 8};
        //ans 2 3 4 6 99
        int[] result = new int[arr.length];
        Arrays.fill(result, 1);
        findLIS(arr, arr.length, result);
        System.out.println(Arrays.toString(result));
        int max = Integer.MIN_VALUE;
        for(int i  = 0; i < result.length; i++){
            if(arr[i] > max){
                max = i;
                break;
            }
        }
        printSubsequence(max, arr);
    }

    private static void printSubsequence(int n, int[] arr) {
        int pointer = 0;
        int start = arr[n];
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        for(int i = n + 1; i < arr.length; i++){
            if(start < arr[i]){
                if(arr[i] < pointer){
                    if(number2.size() < number1.size()){
                        number2.clear();
                        number2.addAll(number1);
                    }
                    number1.clear();
                    number1.add(arr[n]);
                }
                number1.add(arr[i]);
                pointer = arr[i];
            }
        }
        if(number1.size() > number2.size()){
            System.out.println(number1);
        }else{
            System.out.println(number2);
        }
    }

    private static void findLIS(int[] arr, int length, int[] result) {
        int count;
        int pointer = 0;
        for(int i  = 0; i < length ; i++){
            int start = arr[i];
            count = 1;
            for(int j = i + 1; j < length; j++){
                if(start < arr[j]){
                    if(arr[j] < pointer){
                        if(result[i] < count){
                            result[i] = count;
                            count = 1;
                        }
                    }
                    count++;
                    pointer = arr[j];
                }
            }
        }
    }

}
