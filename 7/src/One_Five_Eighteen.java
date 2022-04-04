class Cycle{

 void ride(Cycle k){
     System.out.println("Cycle");
     wheels(k);
    }

    void wheels(Cycle k){
        System.out.println("wheels."+k);
    }

}

class Unicycle extends Cycle{

    public void balance(){
        System.out.println("Unicycle.balance");
    }

    void ride(Unicycle k){
        System.out.println("Unicycle");
        wheels(k);
    }

}

class Bicycle extends Cycle{

    public void balance(){
        System.out.println("Bicycle.balance");
    }


    void ride(Bicycle k){
        System.out.println("Bicycle");
        wheels(k);
    }

}

class Tricycle extends Cycle{

    public void balance(){
        System.out.println("Tricycle.balance");
    }


    void ride(Tricycle k){
        System.out.println("Tricycle");
        wheels(k);
    }

}

public class One_Five_Eighteen {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        unicycle.ride(unicycle);
        unicycle.ride(bicycle);
        bicycle.ride(bicycle);
        tricycle.ride(tricycle);
        unicycle.ride(cycle);
        bicycle.ride(cycle);
        tricycle.ride(cycle);
        Cycle[] cycle1 = {unicycle,bicycle,tricycle};
        //cycle1[0].balance;
        //cycle1[1].balance;
        //cycle1[2].balance;
        ((Unicycle)cycle1[0]).balance();
        //((Unicycle)cycle1[1]).balance();
        ((Bicycle)cycle1[1]).balance();
        ((Tricycle)cycle1[2]).balance();


    }

}
