package polymorphism.shape2;

public class Instrument {

    void play(Note n){
        System.out.println("Instrument.play() " + n);
    }

    String what(){
        return "Instrument ";
    }

    public void adjust(){
        System.out.println("Adjusting Instrument");
    }

}
