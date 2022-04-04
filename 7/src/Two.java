class Cleanser {
    private String s = " Cleanser ";
    public void append(String a){ s+=a;}
    public void dilute(){append("dilute() ");}
    public void apply(){append("apply() ");}
    public void scrab(){append("scrab() ");}
    public String toString() {return s;}

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrab();
        System.out.println(x);
    }

}

class Detergent extends Cleanser{
    public void scrab(){
        append("Detergent.scrub() ");
        super.scrab();
    }
    public void farm(){append("farm() ");}

    public static void main(String[] args) {
        Detergent n = new Detergent();
        n.dilute();
        n.apply();
        n.scrab();
        n.farm();
        System.out.println(n);
        System.out.println("Проверка базового класса ");
        Cleanser.main(args);
    }
}
public class Two extends Detergent {
    public void scrab(){
        append("Two.scrub() ");
        super.scrab();
    }
    public void sterilize(){append("sterilize() ");}

    public static void main(String[] args) {
        Two n = new Two();
        n.dilute();
        n.apply();
        n.scrab();
        n.farm();
        n.sterilize();
        System.out.println(n);
        System.out.println("Проверка класса Detergent ");
        Detergent.main(args);
    }
}


