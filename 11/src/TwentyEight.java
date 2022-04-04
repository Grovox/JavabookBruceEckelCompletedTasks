import java.util.*;

public class TwentyEight {
    public static void main(String[] args) {
        PriorityQueue<Double> numbers = new PriorityQueue<Double>();
        Random rand = new Random(10);
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextDouble());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers.poll());
        }
    }
}