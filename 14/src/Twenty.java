import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Twenty {
    public static String errorMessage = "Вы задали неправильные параметры при запуске программы.";
    public static void main(String[] args) { // Параметры JavaTest java.lang.Class
        if(args.length != 2){
            System.out.println(errorMessage);
            System.exit(1);
        }
        Class myClass;
        Class javaClass;
        try {
            myClass = Class.forName(args[0]);
            javaClass = Class.forName(args[1]);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Информация о моем классе
        System.out.println("Name - " + myClass.getName());
        System.out.println("SimpleName - " + myClass.getSimpleName());
        System.out.println("CanonicalName - " + myClass.getCanonicalName());
        System.out.println("toString - " + myClass.toString());
        System.out.println("Superclass().getName - " + myClass.getSuperclass().getName());
        System.out.println("Package - " + myClass.getPackage());
        System.out.println("getClassLoader().getName() - " + myClass.getClassLoader().getName());

        System.out.println("Interfaces:");
        Class[] interfaceClasses = myClass.getInterfaces();
        for (Class interfaceClass : interfaceClasses){
            System.out.println("interface().getName - " + interfaceClass.getName());
        }

        System.out.println("Annotations:");
        Annotation[] annotations = myClass.getAnnotations();
        for (Annotation annotation : annotations){
            System.out.println("annotation.toString() - " + annotation.toString());
        }

        System.out.println("methods:");
        Method[] methods = myClass.getMethods();
        for (Method method : methods){
            System.out.println("methods.getName() - " + method.getName());
        }

        System.out.println("methods:");
        Field[] fields = myClass.getFields();
        for (Field field : fields){
            System.out.println("fields.getName() - " + field.getName());
        }

        // Информация о класса Class
        System.out.println("Name - " + javaClass.getName());
        System.out.println("SimpleName - " + javaClass.getSimpleName());
        System.out.println("CanonicalName - " + javaClass.getCanonicalName());
        System.out.println("toString - " + javaClass.toString());
        System.out.println("Superclass().getName - " + javaClass.getSuperclass().getName());
        System.out.println("Package - " + javaClass.getPackage());

        System.out.println("Interfaces:");
        Class[] interfaceClasses1 = javaClass.getInterfaces();
        for (Class interfaceClass1 : interfaceClasses1){
            System.out.println("interface().getName - " + interfaceClass1.getName());
        }

        System.out.println("Annotations:");
        Annotation[] annotations1 = javaClass.getAnnotations();
        for (Annotation annotation1 : annotations1){
            System.out.println("annotation.toString() - " + annotation1.toString());
        }

        System.out.println("methods:");
        Method[] methods1 = javaClass.getMethods();
        for (Method method1 : methods1){
            System.out.println("methods.getName() - " + method1.getName());
        }

        System.out.println("methods:");
        Field[] fields1 = javaClass.getFields();
        for (Field field1 : fields1){
            System.out.println("fields.getName() - " + field1.getName());
        }
    }
}
class JavaTest{}