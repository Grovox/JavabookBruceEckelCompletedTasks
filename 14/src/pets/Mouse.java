//: typeinfo/pets/Mouse.java
package pets;

public class Mouse extends Rodent {
  public Mouse(String name) { super(name); }
  public Mouse() { super(); }

  public static class Factory implements PetFactory<Mouse>{
    @Override
    public Mouse create() {
      return new Mouse();
    }
  }
} ///:~
