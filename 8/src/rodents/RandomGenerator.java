package rodents;
import java.util.Random;

public class RandomGenerator {

    private Random rand = new Random(47);

    public RandomGenerator(){
        System.out.println("Конструктор RandomGenerator");
    }

    public Rodent next(){
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Hamster();
            case 1:
                return new Mouse();
            case 2:
                return new Rat();
        }
    }
}
