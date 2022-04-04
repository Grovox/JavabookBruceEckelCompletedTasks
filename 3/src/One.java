class Bank{
    float Package;
}
public class One {
    public static void main(String[] args) {
       Bank B1 = new Bank();
       Bank B2 = new Bank();
        B1.Package = 7.12f;
        B2.Package = 18.23f;
        System.out.println(B1.Package + " " + B2.Package);
        B1.Package = B2.Package;
        System.out.println(B1.Package + " " + B2.Package);
        B1.Package = 7.34f;
        System.out.println(B1.Package + " " + B2.Package);
        B2 = B1;
        System.out.println(B1.Package + " " + B2.Package);
        B2.Package = 12.55f;
        System.out.println(B1.Package + " " + B2.Package);
        B1.Package = 23.5f;
        System.out.println(B1.Package + " " + B2.Package);
    }
}
