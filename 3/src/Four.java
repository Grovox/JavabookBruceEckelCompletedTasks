
class speed_two{
    int Time = 5;
    int Long = 7;
    int Speed;
    void Calculation(){
        Speed = Time * Long;
    }
}

public class Four {
    public static void main(String[] args) {
        speed_two sp = new speed_two();
        sp.Calculation();
        System.out.println("Скорость: "+sp.Speed);
    }
}
