import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandyPart3 {
    public static int count = 0;

    public static void main(String[] args) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        String candy = "";
        try{
            n = Integer.parseInt(buffer.readLine());
            candy = buffer.readLine();
        }catch (IOException e){
            System.err.println(e.getMessage());
        }

        String result = solve(n, candy);
        System.out.println(count);
        System.out.println(result);
    }

    private static String solve(int n, String candy) {
        String[] c_arr = candy.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0, j = 1; j < n; i++, j++){
            if(c_arr[i].equals(c_arr[j])){
                if(j + 1 < candy.length()) {
                    c_arr[j] = replace(c_arr[j], c_arr[j + 1]);
                }else{
                    c_arr[j] = replace(c_arr[j], "");
                }
                count++;
            }
            stringBuilder.append(c_arr[j]);
        }
        return candy.charAt(0) + stringBuilder.toString();
    }

    private static String replace(String s1, String s2) {
        if(s1.equals("R")) {
            if(s2.equals("R") || s2.equals("")){
                return "G";
            }else if(s2.equals("G")){
                return "B";
            }else{
                return "G";
            }
        }else if(s1.equals("B")){
            if(s2.equals("B") || s2.equals("")){
                return "R";
            }else if(s2.equals("G")){
                return "R";
            }else{
                return "G";
            }
        }else{
            if(s2.equals("G") || s2.equals("")){
                return "B";
            }else if(s2.equals("R")){
                return "B";
            }else{
                return "R";
            }
        }
    }
}