import factory.*;
import net.mindview.util.TypeCounter;

import java.util.ArrayList;

public class Thirteen {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        ArrayList<Part> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Part.createRandom());
        }
        for (Part part : list) {
            System.out.print(part.getClass().getSimpleName() + " ");
            counter.count(part);
        }

        System.out.println();
        System.out.println(counter);
    }
}
