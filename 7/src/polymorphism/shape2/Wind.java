package polymorphism.shape2;

public class Wind extends Instrument{

    @Override
    void play(Note n){
        System.out.println("Wind.play() " + n);
    }

    @Override
    String what(){
        return "Wind";
    }

    @Override
    public void adjust(){
        System.out.println("Adjusting Wind");
    }

}
