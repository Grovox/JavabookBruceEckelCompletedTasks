import coffee.Coffee;
import coffee.CoffeeGenerator;
import net.mindview.util.TypeCounter;
import pets.Pet;
import pets.Pets;

public class Twelve {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Coffee.class);
        CoffeeGenerator gen = new CoffeeGenerator();
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for(Coffee coffee : new CoffeeGenerator(5)) {
            System.out.print(coffee.getClass().getSimpleName() + " ");
            counter.count(coffee);
        }

        System.out.println();
        System.out.println(counter);
    }
}
