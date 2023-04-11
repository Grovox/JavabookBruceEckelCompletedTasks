//: generics/coffee/Cappuccino.java
package coffee;
public class Cappuccino extends Coffee {
    public static class Factory implements CoffeeFactory <Cappuccino>{
        @Override
        public Cappuccino create() {
            return new Cappuccino();
        }
    }
} ///:~
