//: typeinfo/RegisteredFactories.java
// Registering Class Factories in the base class.

import java.util.*;

class Part1 {
    public String toString() {
        return getClass().getSimpleName();
    }
    static private List<Class<? extends Part1>> partFactories = new ArrayList<Class<? extends Part1>>();
    static List<Part1> partStorage = new ArrayList<>();

    static {
        partFactories.add(FuelFilter.class);
        partFactories.add(AirFilter.class);
        partFactories.add(CabinAirFilter.class);
        partFactories.add(OilFilter.class);
        partFactories.add(FanBelt.class);
        partFactories.add(PowerSteeringBelt.class);
        partFactories.add(GeneratorBelt.class);
    }
    private static Random rand = new Random(47);
    public static void createRandom() {
        int n = rand.nextInt(partFactories.size());
        try {
            partStorage.add(partFactories.get(n).newInstance());
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

class Filter extends Part1 {}

class FuelFilter extends Filter {

}

class AirFilter extends Filter {

}

class CabinAirFilter extends Filter {

}

class OilFilter extends Filter {

}

class Belt extends Part1 {}

class FanBelt extends Belt {

}

class GeneratorBelt extends Belt {

}

class PowerSteeringBelt extends Belt {
}

public class fourteen {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            Part1.createRandom();
        }
        System.out.println(Part1.partStorage.toString());
    }
}
