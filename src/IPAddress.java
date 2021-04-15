import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IPAddress {
    public static void main(String[] args) {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < n; i++){
            String ip = null;
            try {
                ip = buffer.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            assert ip != null;
            System.out.println(divideSection(ip));
        }
    }

    private static int divideSection(String ip) {
        int count = 0;
        if (ip.length() < 4 || ip.length() > 12) return count;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < ip.length() - 2; j++) {
                for (int k = j + 1; k < ip.length() - 1; k++) {
                    if (isValid(ip.substring(0, i + 1)) && isValid(ip.substring(i + 1, j + 1))
                            && isValid(ip.substring(j + 1, k + 1)) && isValid(ip.substring(k + 1))) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }

    private static boolean isValid(String str) {
        if(str.length() > 3 || (str.charAt(0) == '0' && str.length() > 1)){
                return false;
        }
        int value = Integer.parseInt(str);
        return value <= 255;
    }
}