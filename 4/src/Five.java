class Dog{
    void bark(){
        System.out.println("фрфр");
    }
    void bark(int a){
        System.out.println("рррр");
    }
    void bark(double b){
        System.out.println("рфрр");
    }
}

public class Five {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.bark(1);
        dog1.bark(1.0);
    }
}
