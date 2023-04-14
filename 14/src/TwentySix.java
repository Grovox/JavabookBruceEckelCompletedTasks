interface Instrument{
    public void play();
}

abstract class Stinger implements Instrument{ }

class Balalaika extends Stinger {
    @Override
    public void play() {
        System.out.println("play Balalaika");
    }
}

class Bow extends Stinger {
    @Override
    public void play() {
        System.out.println("play Bow");
    }
}

class Violin extends Stinger{
    @Override
    public void play() {
        System.out.println("play Violin");
    }
}


abstract class Keyboard implements Instrument{ }

class PipeOrgan extends Keyboard{
    @Override
    public void play() {
        System.out.println("play PipeOrgan");
    }
}

class Synthesizer extends Keyboard{
    @Override
    public void play() {
        System.out.println("play Synthesizer");
    }
}

class Accordion extends Keyboard{
    @Override
    public void play() {
        System.out.println("play Accordion");
    }
}

abstract class Wind implements Instrument{
    public void clearSpitValve(){
        System.out.println("Wind instrument" + this.getClass().getName() + "is clean");
    }
}

class Trumpet extends Wind{
    @Override
    public void play() {
        System.out.println("play Trumpet");
    }
}

class Clarinet extends  Wind{
    @Override
    public void play() {
        System.out.println("play Clarinet");
    }
}

class Flute extends Wind{
    @Override
    public void play() {
        System.out.println("play Flute");
    }
}

public class TwentySix {
}
