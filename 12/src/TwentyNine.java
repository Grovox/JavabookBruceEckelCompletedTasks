class BaseballExceptionTwo extends RuntimeException {}
class FoulTwo extends BaseballExceptionTwo {}
class StrikeTwo extends BaseballExceptionTwo {}

abstract class InningTwo {
    public InningTwo() throws BaseballExceptionTwo {}
    public void event() throws BaseballExceptionTwo {
        // Doesn't actually have to throw anything
    }
    public abstract void atBat() throws StrikeTwo, FoulTwo;
    public void walk() {} // Throws no checked exceptions
}

class StormExceptionTwo extends RuntimeException {}
class RainedOutTwo extends StormExceptionTwo {}
class PopFoulTwo extends FoulTwo {}

interface StormTwo {
    public void event() throws RainedOutTwo;
    public void rainHard() throws RainedOutTwo;
}

class StormyInningTwo extends InningTwo implements StormTwo {
    public StormyInningTwo()
            throws RainedOutTwo, BaseballExceptionTwo {}
    public StormyInningTwo(String s)
            throws FoulTwo, BaseballExceptionTwo {}
    public void rainHard() throws RainedOutTwo {}
    public void event() {}
    public void atBat() throws PopFoulTwo {}
}

public class TwentyNine {
    public static void main(String[] args) {
        try {
            StormyInningTwo siTwo = new StormyInningTwo();
            siTwo.atBat();
        } catch(PopFoulTwo e) {
            System.out.println("Pop foul");
        } catch(RainedOutTwo e) {
            System.out.println("Rained out");
        } catch(BaseballExceptionTwo e) {
            System.out.println("Generic baseball exception");
        }
        try {
            InningTwo iTwo = new StormyInningTwo();
            iTwo.atBat();
        } catch(StrikeTwo e) {
            System.out.println("Strike");
        } catch(FoulTwo e) {
            System.out.println("Foul");
        } catch(RainedOutTwo e) {
            System.out.println("Rained out");
        } catch(BaseballExceptionTwo e) {
            System.out.println("Generic baseball exception");
        }
    }
}
