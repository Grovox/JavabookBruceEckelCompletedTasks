class Component1{
    Component1(){
        System.out.println("Класс Сomponent1");
    }
}

class Component2{
    Component2(){
        System.out.println("Класс Сomponent2");
    }
}

class Component3{
    Component3(){
        System.out.println("Класс Сomponent3");
    }
}

class Root{
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();
    Root(){
        System.out.println("Класс Root");
    }
}

class Stem extends Root{
    Stem(){
        System.out.println("Класс Stem");
    }
}
public class Nine {
    public static void main(String[] args) {
        Stem stem = new Stem();
    }
}
