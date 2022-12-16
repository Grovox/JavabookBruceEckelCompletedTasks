import java.util.regex.*;

class Candy {
    static { System.out.println("Loading Candy"); }
}

class Gum {
    static { System.out.println("Loading Gum"); }
}

class Cookie {
    static { System.out.println("Loading Cookie"); }
}

public class Seven {
    public static void main(String[] args) throws Exception {
        if(args.length != 1) {
            System.out.println("The argument for creating the class was not entered\nor there are more than one arguments!!!");
            System.exit(0);
        }
        System.out.println("inside main");
        try {
            Class.forName(args[0]);
        } catch(ClassNotFoundException e) {
            System.out.println("Couldn't find " + args[0]);
            System.exit(0);
        }
        System.out.println("After Class.forName(\"" + args[0] + "\")");
    }
}