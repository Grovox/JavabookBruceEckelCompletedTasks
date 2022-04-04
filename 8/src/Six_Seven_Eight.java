import polymorphism.shape.RandomShapeGenerator;
import polymorphism.shape2.*;

public class Six_Seven_Eight {
    private static RandomGenerator gen = new RandomGenerator();
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Bass(),
                new Woodwind(),
                new Violin()
        };
        Music music = new Music();
        music.tuneALL(instruments);

        System.out.println(music.WhatALL(instruments));
        for(Instrument i : instruments)
            i.adjust();

        Instrument[] instrument2 = new Instrument[20];
        for(int i =0; i< instrument2.length;i++){
            instrument2[i] = gen.next();
        }
        music.tuneALL(instrument2);

        System.out.println(music.WhatALL(instrument2));
        for(Instrument i : instrument2)
            i.adjust();
    }
}
