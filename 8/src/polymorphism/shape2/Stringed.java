package polymorphism.shape2;

public class Stringed extends Instrument{

    @Override
    void play(Note n){
        System.out.println("Stringed.play() " + n);
    }

    @Override
    String what(){
        return "Stringed";
    }

    @Override
    public void adjust(){
        System.out.println("Adjusting Stringed");
    }

}
