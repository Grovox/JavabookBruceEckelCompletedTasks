import java.util.ArrayList;
import java.util.Iterator;

class Gerbil{
    int gerbilNumber;
    void hop(){
        System.out.println("gerbilNumber -  " + gerbilNumber);
    }
}

public class One_Eight {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        gerbils.add(new Gerbil());
        gerbils.add(new Gerbil());
        gerbils.add(new Gerbil());
        gerbils.get(0).hop();
        gerbils.get(1).hop();
        gerbils.get(2).hop();
        System.out.println();
        Iterator<Gerbil> gerbilIterator = gerbils.iterator();
        while (gerbilIterator.hasNext()){
            Gerbil g = gerbilIterator.next();
            g.hop();
        }
    }
}
