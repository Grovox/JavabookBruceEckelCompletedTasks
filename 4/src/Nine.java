public class Nine {
    static void Fibonacci(int number){
        int k=1,k1=1,k2=1;
        System.out.println(k1);
        while(k<=number){
            System.out.println(k);
            k2=k1;
            k1=k;
            k+=k2;
        }
    }
    public static void main(String[] args) {
     Fibonacci(25);
    }
}
