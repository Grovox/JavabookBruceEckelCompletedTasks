//: typeinfo/pets/PetCreator.java
// Creates random sequences of Pets.
package pets;
import java.util.*;

public class PetCreator{
  private Random rand = new Random(47);
  private static final List <PetFactory<? extends Pet>> petsFactories = new ArrayList<>();
  static {
    petsFactories.add(new Pet.Factory());
    petsFactories.add(new Dog.Factory());
    petsFactories.add(new Cat.Factory());
    petsFactories.add(new Rodent.Factory());
    petsFactories.add(new Mutt.Factory());
    petsFactories.add(new Pug.Factory());
    petsFactories.add(new EgyptianMau.Factory());
    petsFactories.add(new Manx.Factory());
    petsFactories.add(new Cymric.Factory());
    petsFactories.add(new Rat.Factory());
    petsFactories.add(new Mouse.Factory());
    petsFactories.add(new Hamster.Factory());
    petsFactories.add(new Gerbil.Factory());
  }

  public Pet randomPet() {
    return petsFactories.get(rand.nextInt(petsFactories.size())).create();
  }

  public Pet[] createArray(int size) {
    Pet[] result = new Pet[size];
    for(int i = 0; i < size; i++)
      result[i] = randomPet();
    return result;
  }

  public ArrayList<Pet> arrayList(int size) {
    ArrayList<Pet> result = new ArrayList<Pet>();
    Collections.addAll(result, createArray(size));
    return result;
  }
}
//Старый PetCreator изменет по заданию 15
/*public abstract class PetCreator {
  private Random rand = new Random(47);
  // The List of the different types of Pet to create:
  public abstract List<Class<? extends Pet>> types();
  public Pet randomPet() { // Create one random Pet
    int n = rand.nextInt(types().size());
    try {
      return types().get(n).newInstance();
    } catch(InstantiationException e) {
      throw new RuntimeException(e);
    } catch(IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }	
  public Pet[] createArray(int size) {
    Pet[] result = new Pet[size];
    for(int i = 0; i < size; i++)
      result[i] = randomPet();
    return result;
  }
  public ArrayList<Pet> arrayList(int size) {
    ArrayList<Pet> result = new ArrayList<Pet>();
    Collections.addAll(result, createArray(size));
    return result;
  }
} *////:~
