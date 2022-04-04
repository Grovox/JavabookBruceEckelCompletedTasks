package polymorphism.shape2;

import polymorphism.shape.*;

import java.util.Random;

public class RandomGenerator {
    private Random rand = new Random(50);
    public Instrument next(){
        switch (rand.nextInt(6)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Stringed();
            case 3:
                return new Bass();
            case 4:
                return new Woodwind();
            case 5:
                return new Violin();
        }
    }
}

