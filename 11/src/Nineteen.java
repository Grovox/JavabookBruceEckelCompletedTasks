import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

public class Nineteen {
    public static void main(String[] args) {
        Random rand = new Random();
        HashSet<Integer> test = new HashSet< Integer>();
        for (int i = 0; i < 10; i++)
            test.add(rand.nextInt(11));
        System.out.println(test);
        Iterator<Integer> Iter_test= test.iterator();
        LinkedHashSet<Integer> box = new LinkedHashSet<Integer>();
        while (Iter_test.hasNext())
            box.add(Iter_test.next());
        System.out.println(box);
    }
}
