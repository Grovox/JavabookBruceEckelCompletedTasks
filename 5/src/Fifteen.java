class Mug {
    Mug(String marker){
        System.out.println("mug("+marker+")");
    }
    void f(String marker){
        System.out.println("f("+marker+")");
    }
}



public class Fifteen {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug("h1");
        mug2 = new Mug("h2");
        System.out.println("mug1 & mug2 инциализированны");
    }
    Fifteen() {
        System.out.println("Mugs()");
    }
    Fifteen(String i) {
        System.out.println("Mugs(String)");
    }
    public static void main(String[] args) {
        System.out.println("В методе main()");
        new Fifteen();
        System.out.println("new Fifteen() завершено");
        new Fifteen("1");
        System.out.println("new Fifteen(1) завершено");
    }
}
