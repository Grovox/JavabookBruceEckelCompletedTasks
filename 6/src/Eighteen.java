import java.util.*;

class Final_test{
    private Random rand = new Random(47);
    int i = rand.nextInt(20);
    static int i1;
    final int i2;
    static final int i3 = 0;


    Final_test(){
        i++;
        i1=2;
        i2=15;
        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}

public class Eighteen {
    public static void main(String[] args) {
        Final_test FT = new Final_test();
        FT.i++;
        FT.i1++;
        //FT.i2++; незя
        //FT.i3++; незя
        System.out.println(FT.i);
        System.out.println(FT.i1);
        System.out.println(FT.i2);
        System.out.println(FT.i3);
    }
}
