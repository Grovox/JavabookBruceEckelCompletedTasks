package polymorphism.shape2;

public class Music {

    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void tuneALL(Instrument[] e){
        for (Instrument i : e)
        tune(i);
    }

    public static String WhatALL(Instrument[] e){
        String n = "";
        for (Instrument i : e)
           n+= i.what()+" ";
        return n;
    }
}
