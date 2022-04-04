class text2 {
    String b ="Hi: ";
    int k;
    text2(int k){
        System.out.println(b+k);
    }
}

public class Two {
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            new text2(i);
        }
    }
}
