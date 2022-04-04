class qqq{
    qqq(int k){
        System.out.println("Класс qqq");
    }
}

public class Eight extends qqq {
    Eight(){
        super(1);
        System.out.println("Класс Eight");
    }
    Eight(int k){
        super(k);
        System.out.println("Класс Eight");
    }

    public static void main(String[] args) {
        Eight eight_one = new Eight();
        Eight eight_two = new Eight();
    }
}
