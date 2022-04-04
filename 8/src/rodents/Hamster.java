package rodents;

public class Hamster extends Rodent{
    private static long counter = 0;
    private final long id = counter++;
    Hamster(){
        System.out.println("Конструктор Hamster");
        System.out.println("Coздаем " + this);
    }

    public String toString(){
        return "Hamster " + id;
    }

    public void name(){
        System.out.println("Hamster");
    }

}
