package polymorphism.shape2;

public class Percussion extends Instrument{

    @Override
    void play(Note n){
        System.out.println("Percussion.play() " + n);
    }

    @Override
    String what(){
        return "Percussion";
    }

    @Override
    public void adjust(){
        System.out.println("Adjusting Percussion");
    }

}
