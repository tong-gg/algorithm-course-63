import java.util.Scanner;

public class SquareRoot {
    public static int squareRoot(int number){
        int i = 1;
        while(true){
            if(i * i <= number){
                i++;
            }
            else{
                break;
            }
        }
        return i - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(squareRoot((input)));
    }
}
