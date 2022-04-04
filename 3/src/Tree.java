import java.util.Random;

public class Tree {
    public static void main(String[] args) {
        int a,b;
        Random rand = new Random();
        while(1==1){
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
