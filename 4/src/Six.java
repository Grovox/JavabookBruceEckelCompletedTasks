public class Six {
    static int test(int testval, int bigin, int end){
        if( testval>bigin && testval<end){
            return 1;
        }else return 0;
    }

    public static void main(String[] args) {
        System.out.println(test(5,3,8));
        System.out.println(test(2,3,8));
        System.out.println(test(11,3,8));
    }
}
