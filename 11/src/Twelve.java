import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class Twelve {
    public static void main(String[] args) {
        List<Integer> test1 = new LinkedList<Integer>();
        List<Integer> test2 = new LinkedList<Integer>();
        Random rand = new Random();
        for( int i = 0; i < 10;i++)
            test1.add(rand.nextInt(10));
        ListIterator<Integer> iterator_test1 = test1.listIterator();
        while (iterator_test1.hasNext())
            System.out.println(iterator_test1.next());
        System.out.println();
        while (iterator_test1.hasPrevious())
            test2.add(iterator_test1.previous());
        ListIterator<Integer> iterator_test2 = test2.listIterator();
        while (iterator_test2.hasNext())
            System.out.println(iterator_test2.next());

    }
}
