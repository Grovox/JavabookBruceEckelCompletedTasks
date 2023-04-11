//: typeinfo/pets/Cat.java
package pets;

public class Cat extends Pet {
  public Cat(String name) { super(name); }
  public Cat() { super(); }

  public static class Factory implements PetFactory<Cat>{
    @Override
    public Cat create() {
      return new Cat();
    }
  }
} ///:~
