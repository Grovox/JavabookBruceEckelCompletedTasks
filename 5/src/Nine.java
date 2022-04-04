class happy_this{
    int happiness_level = 0;
    String happiness_mark = "none";
    happy_this(int number){
        happiness_level = number;
        System.out.println("Конструктор с параметром int");
    }
    happy_this(int happiness_level, String happiness_mark){
        this.happiness_level = happiness_level;
        this.happiness_mark = happiness_mark;
        System.out.println("Конструктор с дувмя параметрами");
    }
    happy_this(){
        this(5, "Be happy now");
        System.out.println("Конструктор без параметров");
    }
    void print_happy(){
        System.out.println("happiness_level: "+happiness_level+" happiness_mark: "+happiness_mark);
    }
}

public class Nine {
    public static void main(String[] args) {
        happy_this h_t = new happy_this(7,"happy");
        h_t.print_happy();
    }

}
