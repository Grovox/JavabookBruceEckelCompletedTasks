class test_finalize_two {
    boolean checked_out =false;
    test_finalize_two(boolean check_out){
        checked_out = check_out;
    }
    void check_In(){
        checked_out = false;
    }
    public void finalize(){
        if (checked_out) {
            System.out.println("Ошибка: " + checked_out);
            checked_out = false;
        }
    }
}

public class Eleven {
    public static void main(String[] args) {
        test_finalize_two test1 = new test_finalize_two(true);
        //test1.check_In();
        test1.finalize();
    }
}
