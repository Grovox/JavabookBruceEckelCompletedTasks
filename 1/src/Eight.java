public class Eight {
    public static void main(String[] args) {
        StaticTest one = new StaticTest();
        StaticTest two = new StaticTest();
        System.out.println(one.i);
        one.i++;
        System.out.println(two.i);
    }
}
