class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}
class UmpireException extends BaseballException {}
abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {
    }
    public abstract void atBat() throws Strike, Foul;
    public void walk() {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

 class StormyInning extends Inning implements Storm {
    public StormyInning() throws RainedOut, BaseballException {}
    public void f() throws UmpireException{
        throw new UmpireException();
    }
    public StormyInning(String s) throws Foul, BaseballException {}
    public void rainHard() throws RainedOut {}
    public void event() {}
    public void atBat() throws PopFoul {}
}

public class Twenty {
    public static void main(String[] args) {
        try{
            StormyInning si = new StormyInning();
            si.atBat();
            si.f();
        } catch(PopFoul e) {
            System.out.println("Pop foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch(Strike e) {
            System.out.println("Strike");
        } catch(Foul e) {
            System.out.println("Foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}
