interface interface_Test1{
    void Method_Test();
}

class wrapper_Test1{
    void TestCreateClass(){
        class ClassInMethod1 implements interface_Test1{
            public int i = 4;
            @Override
            public void Method_Test() {
                System.out.println("number - "+ i);
            }
        }
        interface_Test1 Class = new ClassInMethod1();
        Class.Method_Test();
    }
}

public class EightTwo {
    public static void main(String[] args) {
        wrapper_Test1 wrappertest1 = new wrapper_Test1();
        wrappertest1.TestCreateClass();
    }
}
