import factory.Factory;

import java.security.MessageDigestSpi;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface  Null{
    public boolean isNull();
}
class PartTwo implements Null{
    public String toString() {
        return getClass().getSimpleName();
    }
    static List<Factory<? extends PartTwo>> partFactories =
            new ArrayList<Factory<? extends PartTwo>>();
    static {
        // Collections.addAll() gives an "unchecked generic
        // array creation ... for varargs parameter" warning.
        partFactories.add(new FuelFilterTwo.Factory());
        partFactories.add(new AirFilterTwo.Factory());
        partFactories.add(new CabinAirFilterTwo.Factory());
        partFactories.add(new OilFilterTwo.Factory());
        partFactories.add(new FanBeltTwo.Factory());
        partFactories.add(new PowerSteeringBeltTwo.Factory());
        partFactories.add(new GeneratorBeltTwo.Factory());
        partFactories.add(new NullPet.Factory());
    }
    private static Random rand = new Random(47);
    public static PartTwo createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }

    @Override
    public boolean isNull() {
        return false;
    }
}

class NullPet extends PartTwo implements Null{

    @Override
    public boolean isNull() {
        return true;
    }
    public static class Factory
            implements factory.Factory<NullPet> {
        public NullPet create() { return new NullPet(); }
    }
}

class FilterTwo extends PartTwo{
}

class FuelFilterTwo extends FilterTwo implements Null{
    @Override
    public boolean isNull() {
        return false;
    }

    // Create a Class Factory for each specific type:
    public static class Factory
            implements factory.Factory<FuelFilterTwo> {
        public FuelFilterTwo create() { return new FuelFilterTwo(); }
    }
}

class AirFilterTwo extends FilterTwo implements Null{
    @Override
    public boolean isNull() {
        return false;
    }

    public static class Factory
            implements factory.Factory<AirFilterTwo> {
        public AirFilterTwo create() { return new AirFilterTwo(); }
    }
}

class CabinAirFilterTwo extends FilterTwo implements Null{
    @Override
    public boolean isNull() {
        return false;
    }

    public static class Factory
            implements factory.Factory<CabinAirFilterTwo> {
        public CabinAirFilterTwo create() {
            return new CabinAirFilterTwo();
        }
    }
}

class OilFilterTwo extends FilterTwo implements Null{
    @Override
    public boolean isNull() {
        return false;
    }

    public static class Factory
            implements factory.Factory<OilFilterTwo> {
        public OilFilterTwo create() { return new OilFilterTwo(); }
    }
}

class BeltTwo extends PartTwo{
}

class FanBeltTwo extends BeltTwo implements Null{
    @Override
    public boolean isNull() {
        return false;
    }

    public static class Factory
            implements factory.Factory<FanBeltTwo> {
        public FanBeltTwo create() { return new FanBeltTwo(); }
    }
}

class GeneratorBeltTwo extends BeltTwo implements Null{
    @Override
    public boolean isNull() {
        return false;
    }

    public static class Factory
            implements factory.Factory<GeneratorBeltTwo> {
        public GeneratorBeltTwo create() {
            return new GeneratorBeltTwo();
        }
    }
}

class PowerSteeringBeltTwo extends BeltTwo implements Null{
    @Override
    public boolean isNull() {
        return false;
    }

    public static class Factory
            implements factory.Factory<PowerSteeringBeltTwo> {
        public PowerSteeringBeltTwo create() {
            return new PowerSteeringBeltTwo();
        }
    }
}

public class TwentyFour {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++)
            System.out.println(PartTwo.createRandom() + " " + PartTwo.createRandom().isNull());

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
