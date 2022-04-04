class test_finalize {
    boolean checked_out =false;
    test_finalize(boolean check_out){
        checked_out = check_out;
    }
    void check_In(){
        checked_out = false;
    }
    public void finalize(){
        if (checked_out == true) {
            System.out.println("Ошибка: " + checked_out);
            checked_out = false;
        }
    }
}

public class  Ten {
    public static void main(String[] args) {
        test_finalize test1 = new test_finalize(true);
        test1.check_In();
        new test_finalize(true);
        new test_finalize(true).finalize();

    }
}
