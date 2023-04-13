import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Time;
public class TwentyTwo {
}
class Const {
    static long start = System.nanoTime();
}
class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Метод DynamicProxyHandler.invoke начало - " + (System.nanoTime() - Const.start));
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args);
        if(args != null)
            for(Object arg : args)
                System.out.println("  " + arg);
        System.out.println("Метод DynamicProxyHandler.invoke конец - " + (System.nanoTime() - Const.start));
        System.out.println();
        return method.invoke(proxied, args);
    }
}

class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        System.out.println("Метод SimpleDynamicProxy.consumer начало - " + (System.nanoTime() - Const.start));
        iface.doSomething();
        iface.somethingElse("bonobo");
        System.out.println("Метод SimpleDynamicProxy.consumer конец - " + (System.nanoTime() - Const.start));
        System.out.println();
    }
    public static void main(String[] args) {
        RealObject real = new RealObject();
        System.out.println("Первый вызов метод main.consumer - " + (System.nanoTime() - Const.start));
        consumer(real);
        // Insert a proxy and call again:
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{ Interface.class },
                new DynamicProxyHandler(real));

        System.out.println("Второй вызов метод main.consumer - " + (System.nanoTime() - Const.start));
        consumer(proxy);
    }

}