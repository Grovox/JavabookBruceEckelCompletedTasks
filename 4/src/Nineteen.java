
public class Nineteen {
    public static void f(String... textvar){
        for(String s : textvar)
            System.out.println(s + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        String []a = {"кот", "нёс", "торт"};
    f("кот","ток");
    f(a);
    }
}
