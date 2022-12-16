public class Ten {
    public static void main(String[] args) {
        char a[] = {'q','w','e'};
        System.out.println("Является ли примитивом? -> " + a.getClass().getComponentType().isPrimitive());
    }
}
