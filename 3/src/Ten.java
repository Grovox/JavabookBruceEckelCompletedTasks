public class Ten {
    public static void main(String[] args) {
        int i = 0x15;
        int j = 0x2a;
        System.out.println(Integer.toBinaryString(i)+" "+Integer.toBinaryString(j));
        System.out.println(Integer.toBinaryString(i&j));
        System.out.println(Integer.toBinaryString(i|j));
        System.out.println(Integer.toBinaryString(i^j));
        System.out.println(Integer.toBinaryString(~i));
        System.out.println(Integer.toBinaryString(~j));
    }
}
