import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class fourteen {
    public static void main(String[] args) {
        Random rand = new Random();
        LinkedList<Integer> test = new LinkedList<Integer>();
        ListIterator<Integer> testIterator = test.listIterator();
        for(int i = 0; i < 10;i++)
            testIterator.add(rand.nextInt(10));
        while (testIterator.hasPrevious())
            System.out.println(testIterator.previous());
    }
}
