import java.util.*;
class SimpleException_Five extends Exception{

}

public class Five {
    public void f() throws SimpleException_Five {
        System.out.println("Возбуждаем SimpleException из f()");
        throw new SimpleException_Five();

    }

    public static void main(String[] args) {
        boolean isExceptionThrown;
        Five test = new Five();
        do {
            try {
                test.f();
                isExceptionThrown = false;
            } catch (Exception e) {
                isExceptionThrown = true;
            }
        } while (isExceptionThrown);
    }
}