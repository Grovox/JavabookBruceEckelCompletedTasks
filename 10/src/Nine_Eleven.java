interface Test2{
    void TestMethod2();
}

class WrapperTest2{
    public Test2 maintest2() {
        return new Test2(){
            @Override
            public void TestMethod2() {

            }
        };
    }
        /*public Test2 OutInnerTest2(){
        WrapperTest2 wrapperTest2 = new WrapperTest2();
        Test2 InnerTest2_ = wrapperTest2.new InnerTest2();
            return InnerTest2_;
        }*/
        /*public Test2 OutInnerTest2(){
            return new InnerTest2();
        }*/
}

public class Nine_Eleven {
    public static void main(String[] args) {
        WrapperTest2 wrapperTest2 = new WrapperTest2();
        System.out.println(wrapperTest2.maintest2().getClass().getSimpleName());
        //System.out.println(wrapperTest2.OutInnerTest2().getClass().getSimpleName());
        //Test2 InnerTest2_ = wrapperTest2.new InnerTest2();
    }

}
