package pets;

public class Gerbil extends Pet {
    public Gerbil(String name) { super(name); }
    public Gerbil() { super(); }

    public static class Factory implements PetFactory<Gerbil>{
        @Override
        public Gerbil create() {
            return new Gerbil();
        }
    }
}
