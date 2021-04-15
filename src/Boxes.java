import java.util.Arrays;
import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] boxes = new int[n];
        for(int i = 0; i < n; i++){
            boxes[i] = sc.nextInt();
        }
        Arrays.sort(boxes);
        solve(boxes, n);
    }

    private static void solve(int[] boxes, int counter) {
        int b1 = 0;
        int b2 = 1;
        int answer = counter;
        while(b2 != counter){
            if(boxes[b1] < boxes[b2]){
                answer--;
                b1++;
            }
            b2++;
        }
        System.out.println(answer);
    }
}
