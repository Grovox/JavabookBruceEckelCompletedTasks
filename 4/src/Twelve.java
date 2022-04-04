class Tank{
    int capacity = 0;
    Tank(int cap){
        capacity = cap;
    }
    void empty(){
        capacity = 0;
    }
    void fill(){
        capacity = 10;
    }
    public void finalize(){
        if(capacity >0){
            System.out.println("Ошибка, емкость полная.");
        }
    }
}

public class Twelve {
    public static void main(String[] args) {
        Tank tank = new Tank(3);
        tank.finalize();
        tank.fill();
        tank.finalize();
        tank.empty();
        tank.finalize();

    }
}
