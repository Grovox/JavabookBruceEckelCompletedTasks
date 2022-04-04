class Overload{
    int Operation(int x){
        System.out.println("int x - "+x);
        return x;
    }
    String Operation(String x){
        System.out.println("String x - "+x);
        return x;
    }
    char Operation(char x){
        System.out.println("char x - "+x);
        return x;
    }
}

class Derivative extends Overload{
    float Operation(float x){
        System.out.println("float x - "+x);
        return x;
    }
}

public class Thirteen {
    public static void main(String[] args) {
        Derivative derivative = new Derivative();
        derivative.Operation(2.5f);
        derivative.Operation(1);
        derivative.Operation('x');
        derivative.Operation("Hi");
    }
}
