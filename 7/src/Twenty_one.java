class WithFinalq {
    private final void f(){
        System.out.println("WithFinal.f()");
    }
    private void g(){
        System.out.println("WithFinal.g()");
    }
}

class OverridingPrivateq extends WithFinalq{
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
}

public class Twenty_one {
}
