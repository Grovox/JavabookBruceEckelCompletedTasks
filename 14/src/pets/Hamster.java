//: typeinfo/pets/Hamster.java
package pets;

public class Hamster extends Rodent {
  public Hamster(String name) { super(name); }
  public Hamster() { super(); }

  public static class Factory implements PetFactory<Hamster>{
    @Override
    public Hamster create() {
      return new Hamster();
    }
  }
} ///:~
