import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Equivalent {
    public static void main(String[] args) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String a = "";
        String b = "";
        try {
            a = buffer.readLine();
            b = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(solve(a, b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    private static boolean solve(String a, String b) {
        if(a.equals(b)) return true;
        if(a.length() % 2 != 0 || b.length() % 2 != 0) return false;

        String a1 = a.substring(0, a.length() / 2);
        String a2 = a.substring(a.length() / 2);
        String b1 = b.substring(0, b.length() / 2);
        String b2 = b.substring(b.length() / 2);

        boolean case1 = solve(a1, b1) && solve(a2, b2);
        boolean case2 = solve(a1, b2) && solve(a2, b1);

        return case1 || case2;

    }

}
