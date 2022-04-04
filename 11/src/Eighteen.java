import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Eighteen {
    public static void main(String[] args) {
        Random rand = new Random();
        Map<Integer, Integer> test = new HashMap<Integer, Integer>();

        for (int i = 0; i < 10; i++)
            test.put(i, rand.nextInt(11));
        System.out.println(test.values() + " " + test.keySet());
        LinkedHashMap<Integer,Integer> box = new LinkedHashMap<Integer,Integer>();
        for (int i = 0; i < 10; i++)
            box.put(i, test.get(i));
        System.out.println(box);
    }
}
