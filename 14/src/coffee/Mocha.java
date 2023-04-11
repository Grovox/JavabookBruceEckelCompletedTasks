//: generics/coffee/Mocha.java
package coffee;
public class Mocha extends Coffee {
    public static class Factory implements CoffeeFactory <Mocha>{
        @Override
        public Mocha create() {
            return new Mocha();
        }
    }
} ///:~
