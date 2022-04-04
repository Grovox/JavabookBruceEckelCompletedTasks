class Test{
    void dispose(){
        System.out.println("Метод Test.dispose");
//        int a =1;
//        a/=0;
    }
}

class FailingConstructor{
    Test test;
    Test test2;
    FailingConstructor(){
        test = new Test();
        int a =1;
//        a/=0;
        test2 = new Test();
        test2.dispose();
    }
    void dispose(){
        System.out.println("Метод FailingConstructor.dispose");
}
}

public class TwentyTwo_TwentyTree_TwentyFour {
    public static void main(String[] args) {
        try{
            FailingConstructor FC = new FailingConstructor();
            FC.dispose();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
