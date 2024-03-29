//: typeinfo/pets/EgyptianMau.java
package pets;

public class EgyptianMau extends Cat {
  public EgyptianMau(String name) { super(name); }
  public EgyptianMau() { super(); }

  public static class Factory implements PetFactory<EgyptianMau>{
    @Override
    public EgyptianMau create() {
      return new EgyptianMau();
    }
  }
} ///:~
