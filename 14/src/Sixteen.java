import coffee.FactoryCoffeeGenerator;

public class Sixteen {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(FactoryCoffeeGenerator.createRandom().toString());
        }
    }
}
