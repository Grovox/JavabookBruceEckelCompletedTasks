import java.lang.reflect.InvocationTargetException;
interface HasBatteries1 {}
interface Waterproof1 {}
interface Shoots1 {}

class Toy1 {
    Toy1() {}
    Toy1(int i) {
    }
}

class FancyToy1 extends Toy1
        implements HasBatteries1, Waterproof1, Shoots1 {
    FancyToy1() { super(1); }
}

public class Nineteen {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("FancyToy1");
        } catch(ClassNotFoundException e) {
            System.out.println("Can't find FancyToy1");
            System.exit(1);
        }
        printInfo(c);
        for(Class face : c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.getDeclaredConstructors()[1].newInstance(1);
        } catch(InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch(IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        printInfo(obj.getClass());
    }
}
