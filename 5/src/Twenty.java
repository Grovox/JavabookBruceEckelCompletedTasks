public class Twenty {
    public static void f(String... args){
        for(String s : args)
            System.out.println(s + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        String []a = {"кот", "нёс", "торт"};
        f("кот","ток");
        f(a);
    }
}
