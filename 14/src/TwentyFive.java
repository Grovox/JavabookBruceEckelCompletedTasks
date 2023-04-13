import packageOfTwentyFive.ClassOfTwentyFive;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TwentyFive {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class classRefract;
        try {
            classRefract = Class.forName("packageOfTwentyFive.ClassOfTwentyFive");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Method[] methods;
        methods = classRefract.getDeclaredMethods();

        for (Method method : methods){
            method.setAccessible(true);
            method.invoke(new ClassOfTwentyFive());
        }

    }
}
