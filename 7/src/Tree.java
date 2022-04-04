class Art {
Art(){
    System.out.println("Конструктор Art");
}
}

class Drawign extends Art{
   Drawign(){
       System.out.println("Конструктор Drawign");
   }
}
public class Tree extends Drawign {
   Tree(){
       System.out.println("Конструктор Tree");
   }

    public static void main(String[] args) {
        Tree n = new Tree();
    }
}
