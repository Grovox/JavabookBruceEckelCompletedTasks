interface fast_food{
    void Sandwich();
}

class Meal {
    Meal(){
        System.out.println("Meal()");
    }
}

class Bread {
    Bread(){
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese(){
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce(){
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {

    Lunch(){
        System.out.println("Lunch()");
    }

}

class PortableLunch extends Lunch {

    PortableLunch(){
        System.out.println("PortableLunch()");
    }

}

class Sandwich extends PortableLunch implements fast_food{

    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();

    @Override
    public void Sandwich() {
        System.out.println("Sandwich()");
    }
}

public class Eight {
    public static void main(String[] args) {
        new Sandwich();
    }
}


