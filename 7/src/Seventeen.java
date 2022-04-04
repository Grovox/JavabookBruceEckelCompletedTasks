class Amphibian1{

    public void Colour(){

    }

    static void Temperature(Amphibian1 amphibian){

    }

}

class Frog1 extends Amphibian1{

    public void Colour(){

    }

    static void Temperature(Amphibian1 amphibian){

    }
}


public class Seventeen {
    public static void main(String[] args) {
        Frog1 frog1 = new Frog1();
        frog1.Colour();
        Amphibian1.Temperature(frog1);
    }
}
