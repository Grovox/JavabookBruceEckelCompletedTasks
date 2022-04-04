import java.util.Random;

public class Two {
    public static void main(String[] args) {
        int a,b;
        Random rand = new Random();
        for(int i=0;i<25;i++){
            a=rand.nextInt(101);
            b=rand.nextInt(101);
            System.out.println("a: "+a);
            System.out.println("b: "+b);
            if(a > b){
                System.out.println("a > b");
            }
            if(a == b){
                System.out.println("a = b");
            }
            if(a < b){
                System.out.println("a < b");
            }
        }
    }
}
