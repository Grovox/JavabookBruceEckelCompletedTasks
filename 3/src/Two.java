class BankTwo{
    float Package;
}
class Change{
    static void f(BankTwo k){
        k.Package = 123.3f;
    }
}
public class Two{
    public static void main(String[] args) {
        BankTwo B1 = new BankTwo();
        Change change = new Change();
        B1.Package = 7.12f;
        System.out.println(B1.Package);
        change.f(B1);
        System.out.println(B1.Package);
    }
}
