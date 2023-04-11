//: typeinfo/pets/Rat.java
package pets;

public class Rat extends Rodent {
  public Rat(String name) { super(name); }
  public Rat() { super(); }

  public static class Factory implements PetFactory<Rat>{
    @Override
    public Rat create() {
      return new Rat();
    }
  }
} ///:~
