class Amphibian{

    public void Colour(){

    }

    static void Temperature(Amphibian amphibian){

    }

}

class Frog extends Amphibian{

}

public class Sixteen {
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.Colour();
        Amphibian.Temperature(frog);
    }
}
