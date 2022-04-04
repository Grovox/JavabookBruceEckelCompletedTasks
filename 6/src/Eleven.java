class Cleanser1 {
    private String s = " Cleanser1 ";
    public void append(String a){ s+=a;}
    public void dilute(){append("dilute() ");}
    public void apply(){append("apply() ");}
    public void scrab(){append("scrab() ");}
    public String toString() {return s;}

    public static void main(String[] args) {
        Cleanser1 x = new Cleanser1();
        x.dilute(); x.apply(); x.scrab();
        System.out.println(x);
    }

}

class Detergent1{
    private Cleanser1 cleanser1 = new Cleanser1();
    public void foam(String s){cleanser1.append(s);}
    public void dilute(){cleanser1.dilute();}
    public void apply(){cleanser1. apply();}
    public void scrab(){ cleanser1.scrab();}
    public static void main(String[] args) {
        Detergent1 detergent1 = new Detergent1();
        detergent1.dilute();
        detergent1.apply();
        detergent1.scrab();
        detergent1.foam("foam() ");
        detergent1.cleanser1.dilute();
        System.out.println("Проверка делегирования класса ");
        System.out.println(detergent1.cleanser1);
        System.out.println("Проверка базового класса ");
        Cleanser1.main(args);
    }
}
public class Eleven extends Detergent1 {

}
