class Dog_main{
    void bark(){
        System.out.println("фрфр");
    }
    void bark(int a, double b){
        System.out.println("рррр");
    }
    void bark(double b, int a){
        System.out.println("рфрр");
    }
}

public class Six {
    public static void main(String[] args) {
        Dog_main dog1 = new Dog_main();
        dog1.bark();
        dog1.bark(1,1.0);
        dog1.bark(1.0, 1);
    }
}
