class OneExc extends Exception{}

class TwoExc extends OneExc{}

class TreeExc extends TwoExc{}

class A{
   void f() throws OneExc {
       System.out.println("A---");
        throw new OneExc();
    }
}

class B extends A{
    void f() throws TwoExc {
        System.out.println("B---");
        throw new TwoExc();
    }
}

class C extends B{
    void f() throws TreeExc {
        System.out.println("C---");
        throw new TreeExc();
    }
}

public class TwentyFive {
    public static void main(String[] args) {
        try {
            C c = new C();
            B b = c;
            A a = b;
            a.f();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
