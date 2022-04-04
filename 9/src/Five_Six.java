import Test_interface.*;

class Derivative2 implements Test_interface {
   private int id;
   private String name;

    Derivative2(int number, String text){
        id = number;
        name = text;
    }

    @Override
    public void print() {
        System.out.println("Derivative2");
    }

    @Override
    public void name() {
        System.out.println("name-"+name);
    }

    @Override
    public void id() {
        System.out.println("id-"+id);
    }
}

public class Five_Six {
    public static void main(String[] args) {
        Derivative2 derivative2 = new Derivative2(1,"Test");
        derivative2.print();
        derivative2.name();
        derivative2.id();
    }
}
