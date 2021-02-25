import java.util.ArrayList;

public class CommonNumber {
    public static void main(String[] args) {
        int []mArr = {4, 7, 7, 8, 5, 2};
        int []nArr = {2, 2, 7, 5, 4, 7};
        ArrayList<Integer> result = new ArrayList<>();

        for (int k : mArr) {
            for (int j = 0; j < nArr.length; j++) {
                if (k == nArr[j]) {
                    result.add(nArr[j]);
                    nArr[j] = -1;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
