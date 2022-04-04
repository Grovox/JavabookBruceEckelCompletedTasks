class Component11{
    Component11(int i){
        System.out.println("Класс Сomponent11-"+i);
    }
}

class Component22{
    Component22(int i){
        System.out.println("Класс Сomponent22-"+i);
    }
}

class Component33{
    Component33(int i){
        System.out.println("Класс Сomponent33-"+i);
    }
}

class Root1{
    Component11 component11 = new Component11(1);
    Component22 component22 = new Component22(2);
    Component33 component33 = new Component33(3);
    Root1(int k){
        System.out.println("Класс Root1-"+k);
    }
}

class Stem1 extends Root1{
    Stem1(int x){
        super(1);
        System.out.println("Класс Stem1-"+x);
    }
}

public class Ten {
    public static void main(String[] args) {
        Stem1 stem1 = new Stem1(1);
    }
}
