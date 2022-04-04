import java.util.*;
public class Twenty_tree {
    public static void main(String[] args) {
        Random rand = new Random();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int counter = 0, storage = 0;
        for (int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
            System.out.println(m);
            if (m.get(r) > counter) {
                counter = m.get(r);
                storage = r;
            }
        }
        System.out.println(m);
        System.out.println("Чаще повторяется -> "+storage+" --- "+counter);
    }
}
