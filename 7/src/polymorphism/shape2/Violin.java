package polymorphism.shape2;

public class Violin extends Instrument{

    void play(Note n){
        System.out.println("Violin.play() " + n);
    }

    String what(){
        return "Violin ";
    }

    public void adjust(){
        System.out.println("Adjusting Violin");
    }

}
