class TestClassMain{
    static int k;
    TestClassMain(){
            System.out.println("TestClassMain() ");
    }
}

public class Twenty_tree {
    public static void main(String[] args) {
        TestClassMain.k=70;
        TestClassMain testClassMain = new TestClassMain();
    }
}
