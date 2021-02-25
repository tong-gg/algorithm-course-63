import java.util.ArrayList;
import java.util.Random;

public class RandomAlgo {
    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            return min;
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        int max = 2;
        ArrayList<String> name = new ArrayList<>();
        name.add("Tong");
        name.add("Preaw");
        name.add("Fah");

        ArrayList<String> topic = new ArrayList<>();
        topic.add("แผ่นดินขวา");
        topic.add("เมืองหลวง");
        topic.add("ภาคเหนือ");

        while (!name.isEmpty()){
            int number = getRandomNumberInRange(0, max);
            System.out.println(name.get(number));
            name.remove(number);

            int topicnum = getRandomNumberInRange(0, max);
            System.out.println(topic.get(topicnum));
            topic.remove(topicnum);
            max -= 1;

        }
    }
}
