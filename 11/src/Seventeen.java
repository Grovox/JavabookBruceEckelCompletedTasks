import java.util.*;

class Gerbil1{
    static int box = 0;
    int gerbilNumber;
    Gerbil1(){
        gerbilNumber = box;
        box++;
    }
    int hop(){
        return gerbilNumber;
    }
}

public class Seventeen {
    public static void main(String[] args) {
        Map<String, Gerbil1> Gerbils = new HashMap<>();
        Gerbils.put(String.valueOf(Gerbil1.box),new Gerbil1());
        Gerbils.put(String.valueOf(Gerbil1.box),new Gerbil1());
        Gerbils.put(String.valueOf(Gerbil1.box),new Gerbil1());
        Gerbils.put(String.valueOf(Gerbil1.box),new Gerbil1());
        Gerbils.put(String.valueOf(Gerbil1.box),new Gerbil1());
        Iterator<String> gerbil1Iterator = Gerbils.keySet().iterator();
        while (gerbil1Iterator.hasNext()){
            System.out.println(Gerbils.getClass().getSimpleName()+" "+Gerbils.get(gerbil1Iterator.next()).gerbilNumber);
        }
    }
}
