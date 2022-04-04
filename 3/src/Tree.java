import java.util.Random;

class speed{
    int Time;
    int Long;
    int Speed;
    void Calculation(){
        Speed = Time * Long;
    }
}
public class Tree {
    public static void main(String[] args) {
    speed sp = new speed();
    Random rand = new Random(47);
    sp.Long = rand.nextInt(100) + 1;
    sp.Time = rand.nextInt(100) + 1;
    sp.Calculation();
    System.out.println("Скорость: "+sp.Speed);
    }
}
