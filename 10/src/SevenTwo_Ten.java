interface interface_Test{
    void Method_Test();
}

class wrapper_Test{
    interface_Test TestCreateClass(){
        return new interface_Test() {
            public int i = 7;
            @Override
            public void Method_Test(){
                System.out.println("number - "+ i);
            }
        };
        //return new ClassInMethod();
    }
}

public class SevenTwo_Ten {
    public static void main(String[] args) {
        wrapper_Test wrappertest = new wrapper_Test();
        interface_Test Class = wrappertest.TestCreateClass();
        Class.Method_Test();
        //System.out.println(Class.i);
    }
}
