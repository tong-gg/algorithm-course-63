//6210400710 Substrings Problem
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            String str = sc.next();
            arr[i] = str;
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        if(subStringSearch(arr, arr.length)){
            System.out.println("YES");
            for(String str : arr){
                System.out.println(str);
            }
        }else{
            System.out.println("NO");
        }

    }

    private static boolean subStringSearch(String arr[], int size) {
        for(int i = 0; i < size - 1; i++){
            if(!arr[i + 1].contains(arr[i])){
                return false;
            }
        }
        return true;
    }
}
