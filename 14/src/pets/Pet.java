//: typeinfo/pets/Pet.java
package pets;

public class Pet extends Individual {
  public Pet(String name) { super(name); }
  public Pet() { super(); }
  public static class Factory implements PetFactory<Pet>{

    @Override
    public Pet create() {
      return new Pet();
    }
  }
} ///:~
