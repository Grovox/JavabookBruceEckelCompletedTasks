class OnOffException1 extends Exception {}
class OnOffException2 extends Exception {}

class Switch {
    private boolean state = false;
    public boolean read() { return state; }
    public void on() { state = true;
        System.out.println(this); }
    public void off() { state = false; System.out.println(this); }
    public String toString() { return state ? "on" : "off"; }
}

class OnOffSwitch {
    static Switch sw = new Switch();
    public static void f()
            throws OnOffException1,OnOffException2 {}
}

public class Fourteen {
    public static void main(String[] args) {
        OnOffSwitch OFsw = new OnOffSwitch();
        try {
            OFsw.sw.on();
            // Code that can throw exceptions...
            OFsw.f();
            OFsw.sw.off();
            throw new RuntimeException();
        } catch(OnOffException1 e) {
            System.out.println("OnOffException1");
            OFsw.sw.off();
        } catch(OnOffException2 e) {
            System.out.println("OnOffException2");
            OFsw.sw.off();
        }
    }
}
