package shape;

public abstract class Stringed implements Instrument,Playable {

    @Override
    public void play(Note n){
        System.out.println(this + ".play() " + n);
    }

    public String toString(){
        return "Stringed";
    }

    @Override
    public void adjust(){
        System.out.println(this + ".Adjusting");
    }

}
