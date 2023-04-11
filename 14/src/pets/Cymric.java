//: typeinfo/pets/Cymric.java
package pets;

public class Cymric extends Manx {
  public Cymric(String name) { super(name); }
  public Cymric() { super(); }

  public static class Factory implements PetFactory<Cymric>{
    @Override
    public Cymric create() {
      return new Cymric();
    }
  }
} ///:~
