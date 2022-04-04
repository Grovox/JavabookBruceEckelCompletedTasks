import java.util.Formatter;

class TestString{
    int a = 5;
    long b = 500000000;
    float c = 7.54f;
    double d = 7.34323452352331;

    @Override
    public String toString() {
        return String.format("TestString{ %n a = %d %n b = %d %n c = %f %n d = %f }" , a , b , c , d);
    }
}

public class Six {
    public static void main(String[] args) {
        TestString sf = new TestString();
        System.out.println(sf.toString());
    }
}
