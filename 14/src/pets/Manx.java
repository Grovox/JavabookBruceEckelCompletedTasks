//: typeinfo/pets/Manx.java
package pets;

public class Manx extends Cat {
  public Manx(String name) { super(name); }
  public Manx() { super(); }

  public static class Factory implements PetFactory<Manx>{
    @Override
    public Manx create() {
      return new Manx();
    }
  }
} ///:~
