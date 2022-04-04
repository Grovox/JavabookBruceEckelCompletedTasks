class Annoyance extends RuntimeException {}
class Sneeze extends Annoyance {}

public class Thirty {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch(Sneeze s) {
            System.out.println("Caught Sneeze");
            s.printStackTrace(System.out);
        } catch(Annoyance a) {
            System.out.println("Caught Annoyance");
            a.printStackTrace(System.out);
        }
        try {
            throw new Sneeze();
        } catch(Annoyance a) {
            System.out.println("Caught Annoyance");
            a.printStackTrace(System.out);
        }
        try {
            throw new Sneeze();
        } catch(RuntimeException a) {
            System.out.println("Caught RuntimeException");
            a.printStackTrace(System.out);

        }

    }
}

