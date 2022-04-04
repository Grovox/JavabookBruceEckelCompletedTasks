package shape;

public abstract class Percussion implements Instrument,Playable {

    @Override
    public void play(Note n){
        System.out.println(this + ".play() " + n);
    }


    public String toString(){
        return "Percussion";
    }

    @Override
    public void adjust(){
        System.out.println(this + ".Adjusting");
    }

}
