abstract class Base{
    int k;
    abstract void print();
}

class Derivative extends Base{

    Derivative(){
        k=0;
        print();
    }

    @Override
    void print() {
        System.out.println(k);
    }
}

public class Tree {
    public static void main(String[] args) {
        Derivative derivative = new Derivative();
        derivative.print();
    }
}
