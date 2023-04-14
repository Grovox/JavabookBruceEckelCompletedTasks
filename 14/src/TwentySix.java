import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Instrument{
    public void play();
}

class Clarinet implements Instrument {
    @Override
    public void play() {
        System.out.println("play Clarinet");
    }
}

class Flute implements Instrument {
    @Override
    public void play() {
        System.out.println("play Flute");
    }
}

interface Wind {
    public void clearSpitValve();
}
class WindInvocationHandler implements InvocationHandler {
    private Instrument instrument;

    private Wind wind;
    public WindInvocationHandler(Instrument instrument) {

        this.instrument = instrument;

        wind = new Wind() {
            @Override
            public void clearSpitValve() {
                System.out.println("The wind instrument is clean");
            }
        };

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        wind.clearSpitValve();
        method.invoke(instrument,args);

        return null;
    }
}
public class TwentySix {
    public static void main(String[] args) {
        Instrument flute = new Flute();

        ClassLoader vasiaClassLoader = flute.getClass().getClassLoader();

        Class[] classes = flute.getClass().getInterfaces();

        Instrument proxyFlute = (Instrument) Proxy.newProxyInstance(vasiaClassLoader, classes, new WindInvocationHandler(flute));

        proxyFlute.play();
    }
}
