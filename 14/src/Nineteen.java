//: typeinfo/RegisteredFactories.java
// Registering Class Factories in the base class.
import factory.*;
import pets.*;

import java.util.*;

class Part1 {
    private static final List<Class<? extends Factory<? extends Part>>> partFactories =
            new ArrayList<Class<? extends Factory<? extends Part>>>(
                    Arrays.asList(
                            FuelFilter.Factory.class, AirFilter.Factory.class,
                            CabinAirFilter.Factory.class, OilFilter.Factory.class,
                            FanBelt.Factory.class, PowerSteeringBelt.Factory.class,
                            GeneratorBelt.Factory.class));
    private List<Factory> createdObjects = new ArrayList<>();

    private static Random rand = new Random(47);

    public void createRandom() throws InstantiationException, IllegalAccessException {
        int n = rand.nextInt(partFactories.size());
        createdObjects.add(partFactories.get(n).newInstance());
    }

    public List getCreatedObjects(){
        return createdObjects;
    }

    public String toString() {
        String out = "";
        Iterator iterator = createdObjects.iterator();
        while (iterator.hasNext()){
            out += iterator.next().getClass().getName() + "\n";
        }
        return out;
    }
}

class Filter extends Part {}

class FuelFilter extends Filter {
    // Create a Class Factory for each specific type:
    public static class Factory
            implements factory.Factory<FuelFilter> {
        public FuelFilter create() { return new FuelFilter(); }
    }
}

class AirFilter extends Filter {
    public static class Factory
            implements factory.Factory<AirFilter> {
        public AirFilter create() { return new AirFilter(); }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory
            implements factory.Factory<CabinAirFilter> {
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory
            implements factory.Factory<OilFilter> {
        public OilFilter create() { return new OilFilter(); }
    }
}

class Belt extends Part {}

class FanBelt extends Belt {
    public static class Factory
            implements factory.Factory<FanBelt> {
        public FanBelt create() { return new FanBelt(); }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory
            implements factory.Factory<GeneratorBelt> {
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory
            implements factory.Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}

public class Nineteen {
    public static void main(String[] args){
        Part1 part1 = new Part1();
        for(int i = 0; i < 25; i++){
            try {
                part1.createRandom();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println(part1);
        System.out.println();
        System.out.println(part1.getCreatedObjects());
    }
} /* Output:
GeneratorBelt
CabinAirFilter
GeneratorBelt
AirFilter
PowerSteeringBelt
CabinAirFilter
FuelFilter
PowerSteeringBelt
PowerSteeringBelt
FuelFilter
*///:~
