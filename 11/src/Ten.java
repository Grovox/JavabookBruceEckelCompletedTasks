import rodents.*;
import java.util.*;
public class Ten {
    private static RandomGenerator gen = new RandomGenerator();

    public static void main(String[] args) {
        ArrayList<Rodent1> rodents = new ArrayList<Rodent1>();
        for (int i = 0; i < 15; i++) {
            rodents.add(gen.next());
        }
        Iterator<Rodent1> rodent1Iterator = rodents.iterator();
        while (rodent1Iterator.hasNext())
            rodent1Iterator.next().name();
    }
}