class GG{
    GG(int i){
        System.out.println("Конструктор GG");
    }
}

class BGG extends GG{
    BGG(int i){
        super(i);
        System.out.println("Конструктор BGG");
    }
}

public class Six extends BGG{
    Six(){
        super(11);
        System.out.println("Конструктор Six");
    }

    public static void main(String[] args) {
        Six a = new Six();
    }
}
