import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandyPart2 {
    public static void main(String[] args) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        String candy = null;
        try {
            n = Integer.parseInt(buffer.readLine());
            candy = buffer.readLine();
        } catch (IOException e) {
            System.err.println("Cannot read input from user");
        }
        System.out.println(solve(n, candy));
    }
    private static int solve(int n, String candy){
        int odd_r = 0, odd_b = 0, even_r = 0, even_b = 0;
        int result = 0;
        String[] eachCandy = candy.split("");
        for(int i = 0 ; i < n; i++){
            if(i % 2 == 0){
                if(eachCandy[i].equals("r")){
                    even_r++;
                }else{
                    even_b++;
                }
            }else{
                if(eachCandy[i].equals("r")){
                    odd_r++;
                }else{
                    odd_b++;
                }
            }
        }

        int redCandy = odd_r + even_r;
        int blueCandy = odd_b + even_b;
        result += eachCandy[0].equals("b") ? Math.min(odd_r, even_r) : Math.min(odd_b, even_b);

        if(Math.abs(redCandy - blueCandy) > 1){
            result += Math.ceil(Math.abs(redCandy - blueCandy)/2.0);
        }
        return result;
    }

}
