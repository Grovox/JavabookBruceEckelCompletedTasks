class TestAccess{
    void TestAccessChange(){
        inter_class interClass = new inter_class();
        interClass.open_int = 2;
        interClass.close_int = 2;
        System.out.println("open_int - "+interClass.open_int);
        System.out.println("close_int - "+interClass.close_int);
    }
    class inter_class{
        int open_int = 0;
        private int close_int = 0;
    }
}


public class Eight {
    public static void main(String[] args) {
        TestAccess testAccess = new TestAccess();
        testAccess.TestAccessChange();
    }
}
