//: generics/coffee/Latte.java
package coffee;
public class Latte extends Coffee {
    public static class Factory implements CoffeeFactory <Latte>{
        @Override
        public Latte create() {
            return new Latte();
        }
    }
} ///:~
