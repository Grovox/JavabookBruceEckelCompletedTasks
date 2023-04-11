//: typeinfo/pets/Pug.java
package pets;

public class Pug extends Dog {
  public Pug(String name) { super(name); }
  public Pug() { super(); }

  public static class Factory implements PetFactory<Pug>{
    @Override
    public Pug create() {
      return new Pug();
    }
  }
} ///:~
