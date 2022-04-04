import rodents.*;

public class Nine_Twelve_Fifteen {
    private static RandomGenerator gen = new RandomGenerator();

    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[15];
        for (int i = 0; i< rodents.length; i++){
            rodents[i] = gen.next();
        }
        for(Rodent i : rodents)
            i.name();
    }
}
