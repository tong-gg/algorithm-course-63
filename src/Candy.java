import java.util.Arrays;
import java.util.Scanner;

public class Candy {
    public static int calculateDay(int r, int g, int b) {
        int[] arr = {r, g, b};
        Arrays.sort(arr);
        int answer = 0, min = arr[0], medium = arr[1], max = arr[2];
        if (medium != max && max != min) {
            while (true) {
                if (min != 0 && medium < max) {
                    min -= 1;
                    medium += 1;
                }
                else {
                    break;
                }
            }
        }
        if (min == medium && min == 1) {
            answer = 1;
        }
        else if (medium == max) {
            if (medium == 1) {
                answer = medium;
            }
            else {
                answer = medium + (min/2);
            }
        }
        else {
            if (min == 0) {
                answer = medium;
            }
            else {
                answer = medium + (min/2);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r, g, b, answer;
        for (int i = 0;i < n;i++) {
            r = scanner.nextInt();
            g = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(calculateDay(r, g, b));
        }
    }
}
