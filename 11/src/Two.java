
import java.util.Collection;
import java.util.HashSet;

public class Two {
    public static void main(String[] args) {
        HashSet<Integer> c = new HashSet<Integer>();
        for(int i = 0 ;i < 10; i++)
            c.add(i);
        c.add(5);
        c.add(15);
        for (Integer i : c)
            System.out.println(i);
    }
}
