//: generics/coffee/Americano.java
package coffee;
public class Americano extends Coffee {
    public static class Factory implements CoffeeFactory <Americano>{
        @Override
        public Americano create() {
            return new Americano();
        }
    }
} ///:~
