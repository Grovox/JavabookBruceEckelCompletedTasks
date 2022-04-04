abstract class Base1{

}

class Derivative1 extends Base1{
    void print(){
        System.out.println("Derivative1");
    }
    static void test(Base1 base1){

    }
}

public class Four {
    public static void main(String[] args) {
        Derivative1 derivative1 = new Derivative1();
        derivative1.print();
        derivative1.test(derivative1);
    }
}
