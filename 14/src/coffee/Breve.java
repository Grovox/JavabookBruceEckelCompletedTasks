//: generics/coffee/Breve.java
package coffee;
public class Breve extends Coffee {
    public static class Factory implements CoffeeFactory <Breve>{
        @Override
        public Breve create() {
            return new Breve();
        }
    }
} ///:~
