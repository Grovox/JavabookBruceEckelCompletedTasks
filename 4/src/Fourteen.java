class rock{
    static String troll;
    rock(String text){
        troll = text;
    }
    static void print(){
        System.out.println("troll "+troll);
    }
}
class test{
    static rock space;
    static {
        space = new rock("text_bla");
    }

}

public class Fourteen {
    public static void main(String[] args) {
        //rock rock_main = new rock("halamala");
        //rock_main.print();
        test test_main = new test();
        test_main.space.print();
        //rock rock_main = new rock("halamala");
        //rock_main.print();
        //test_main.space.print();
    }
}
