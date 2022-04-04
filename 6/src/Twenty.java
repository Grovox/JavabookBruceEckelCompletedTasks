//задание не зделано так-как я хз что это блять значит

class WithFinal {
    private final void f(){
        System.out.println("WithFinal.f()");
    }
    private void g(){
        System.out.println("WithFinal.g()");
    }
}

class OverridingPrivate extends WithFinal{
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate{
    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }
    public void g(){
        System.out.println("OverridingPrivate2.g()");
    }
}

class FinalOverridingIllusion extends OverridingPrivate2{

}

public class Twenty {
    public static void main(String[] args) {
        OverridingPrivate2 OP2 = new OverridingPrivate2();
        OP2.f();
        OP2.g();
        OverridingPrivate OP = OP2;
        //OP.f();
        //OP.g();
        WithFinal WF = OP2;
        //WF.f();
        //WF.g();
    }
}
