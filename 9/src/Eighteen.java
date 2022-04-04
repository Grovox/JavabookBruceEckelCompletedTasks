interface Cycle{
    void ride(Cycle k);
    static void wheels(Cycle k){
        System.out.println("wheels."+k.getClass().getSimpleName());
    }
    void balance();
}

interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle {

    @Override
    public void ride(Cycle k) {
        System.out.println("Unicycle");
        Cycle.wheels(k);
    }

    public void balance(){
        System.out.println("Unicycle.balance");
    }

}

class UnicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle {

    public void balance(){
        System.out.println("Bicycle.balance");
    }


    @Override
    public void ride(Cycle k) {
        System.out.println("Bicycle");
        Cycle.wheels(k);
    }

}

class BicycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle {

    public void balance(){
        System.out.println("Tricycle.balance");
    }


    @Override
    public void ride(Cycle k) {
        System.out.println("Tricycle");
        Cycle.wheels(k);
    }

}

class TricycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

class Create{
    public static void PlayCreate(CycleFactory factory){
        Cycle cycle = factory.getCycle();
        cycle.balance();
        cycle.ride(cycle);
    }

/*    public static void main(String[] args) {
        PlayCreate((CycleFactory) new Unicycle());
        PlayCreate((CycleFactory) new Bicycle());
        PlayCreate((CycleFactory) new Tricycle());
    }*/
}

public class Eighteen {
    public static void main(String[] args) {
        /*Cycle[] cycle = {new Unicycle(),new Bicycle(), new Tricycle()};
        for (int i =0;i<cycle.length;i++){
            cycle[i].balance();
            ((Cycle)cycle[i]).ride(cycle[i]);
        }*/
        Create.PlayCreate(new UnicycleFactory());
        Create.PlayCreate(new BicycleFactory());
        Create.PlayCreate(new TricycleFactory());
    }
}