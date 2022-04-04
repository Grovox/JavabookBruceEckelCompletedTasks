class Component111{
    Component111(){
        System.out.println("Класс Сomponent111");
    }
    void dispose(){
        System.out.println("Завершение! Класс Сomponent111");
    }
}

class Component222{
    Component222(){
        System.out.println("Класс Сomponent222");
    }
    void dispose(){
        System.out.println("Завершение! Класс Сomponent222");
    }
}

class Component333{
    Component333(){
        System.out.println("Класс Сomponent333");
    }
    void dispose(){
        System.out.println("Завершение! Класс Сomponent333");
    }
}

class Root11{
    Component111 component111 = new Component111();
    Component222 component222 = new Component222();
    Component333 component333 = new Component333();
    Root11(){
        System.out.println("Класс Root");
    }
    void dispose(){
        component111.dispose();
        component222.dispose();
        component333.dispose();
        System.out.println("Завершение! Класс Root11");
    }
}

class Stem11 extends Root11{
    Stem11(){
        System.out.println("Класс Stem");
    }
    void dispose(){
        super.dispose();
        System.out.println("Завершение! Класс Stem11");
    }
}

public class Twelve {
    public static void main(String[] args) {
        Stem11 stem11 = new Stem11();
        stem11.dispose();
    }
}
