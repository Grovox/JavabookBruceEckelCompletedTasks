//: typeinfo/pets/Rodent.java
package pets;

public class Rodent extends Pet {
  public Rodent(String name) { super(name); }
  public Rodent() { super(); }

  public static class Factory implements PetFactory<Rodent>{
    @Override
    public Rodent create() {
      return new Rodent();
    }
  }
} ///:~
