package shape;

public class Music {

    public static void tune(Playable i){
        i.play(Note.MIDDLE_C);
    }

    public static void tuneALL(Playable[] e){
        for (Playable i : e)
        tune(i);
    }
}
