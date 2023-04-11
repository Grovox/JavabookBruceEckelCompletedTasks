package coffee;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FactoryCoffeeGenerator {
    private static List<CoffeeFactory<? extends Coffee>> coffeeFactory = new ArrayList<>();
    static {
        coffeeFactory.add(new Americano.Factory());
        coffeeFactory.add(new Breve.Factory());
        coffeeFactory.add(new Cappuccino.Factory());
        coffeeFactory.add(new Latte.Factory());
        coffeeFactory.add(new Mocha.Factory());
    }

    private static Random rand = new Random(47);

    public static Coffee createRandom() {
        return coffeeFactory.get(rand.nextInt(coffeeFactory.size())).create();
    }
}
