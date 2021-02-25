import java.util.Arrays;
import java.util.Scanner;

public class ThreeSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int num : arr){
            if(threeSquare(num) == -1){
                System.out.println("-1");
            }
        }
    }

    private static int threeSquare(int n) {
        int a, b, c, sum;
        double temp;
        int limit_a = (int) Math.round(Math.sqrt(n));

        for(a = 0; a < limit_a; a++){
            double limit_b = Math.sqrt(n - (a * a));
            for(b = a; b < limit_b; b++){
                temp = Math.sqrt(n - (a * a) - (b * b));
                if((temp % 1) == 0){
                    c = (int) temp;
                    System.out.println(a + " " + b + " " + c);
                    return 0;
                }
            }
        }
        return -1;
    }
}
