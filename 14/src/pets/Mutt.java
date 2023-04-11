//: typeinfo/pets/Mutt.java
package pets;

public class Mutt extends Dog {
  public Mutt(String name) { super(name); }
  public Mutt() { super(); }

  public static class Factory implements PetFactory<Mutt>{
    @Override
    public Mutt create() {
      return new Mutt();
    }
  }
} ///:~
