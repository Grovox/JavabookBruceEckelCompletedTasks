//: typeinfo/pets/Dog.java
package pets;

public class Dog extends Pet {
  public Dog(String name) { super(name); }
  public Dog() { super(); }

  public static class Factory implements PetFactory<Dog>{
    @Override
    public Dog create() {
      return new Dog();
    }
  }
} ///:~
