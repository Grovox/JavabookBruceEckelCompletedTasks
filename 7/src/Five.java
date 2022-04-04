class A{
A(){
    System.out.println("Я класс A");
}
}

class B{
    B(){
        System.out.println("Я класс B");
    }
}

public class Five extends A {
    B b = new B();
    public static void main(String[] args) {
        Five five = new Five();
    }
}
