public class TwentyOne {
}



interface Interface {
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSomething() {
        System.out.println("Метод RealObject.doSomething начало - " + (System.nanoTime() - Const.start));

        System.out.println("doSomething");
        System.out.println(System.nanoTime());

        System.out.println("Метод RealObject.doSomething конец - " + (System.nanoTime() - Const.start));
        System.out.println();
    }
    public void somethingElse(String arg) {
        System.out.println("Метод RealObject.somethingElse начало - " + (System.nanoTime() - Const.start));

        System.out.println("somethingElse " + arg);
        System.out.println(System.nanoTime());

        System.out.println("Метод RealObject.somethingElse конец - " + (System.nanoTime() - Const.start));
        System.out.println();
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    public void doSomething() {
        System.out.println("Метод SimpleProxy.doSomething начало - " + (System.nanoTime() - Const.start));

        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();

        System.out.println("Метод SimpleProxy.doSomething конец - " + (System.nanoTime() - Const.start));
        System.out.println();
    }
    public void somethingElse(String arg) {
        System.out.println("Метод SimpleProxy.somethingElse начало - " + (System.nanoTime() - Const.start));

        System.out.println("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);

        System.out.println("Метод SimpleProxy.somethingElse конец - " + (System.nanoTime() - Const.start));
        System.out.println();
    }
}

class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        System.out.println("Метод SimpleProxyDemo.consumer начало - " + (System.nanoTime() - Const.start));

        iface.doSomething();
        iface.somethingElse("bonobo");

        System.out.println("Метод SimpleProxyDemo.consumer конец - " + (System.nanoTime() - Const.start));
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Первый main вызов - " + (System.nanoTime() - Const.start));
        consumer(new RealObject());

        System.out.println("Второй main вызов - " + (System.nanoTime() - Const.start));
        consumer(new SimpleProxy(new RealObject()));
    }
} /* Output:
doSomething
somethingElse bonobo
SimpleProxy doSomething
doSomething
SimpleProxy somethingElse bonobo
somethingElse bonobo
*///:~
