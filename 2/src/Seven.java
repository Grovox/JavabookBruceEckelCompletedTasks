import java.util.Random;

public class Seven {
    public static void main(String[] args) {
        Random rand = new Random();
        int coin = rand.nextInt(2);
        if(coin == 1){
            System.out.println("Rejka");
        }else System.out.println("Orol");
    }
}
