import java.util.*;

class Sequence1{
    private LinkedList<Object> items = new LinkedList<Object>();
    private Iterator<Object> objectIterator;
    public void add(Object x){
        this.items.add(x);
    }
    public void print(){
        objectIterator = items.listIterator();
        while (objectIterator.hasNext()){
            System.out.println(objectIterator.next());
        }
    }
}

public class Nine {
    public static void main(String[] args) {
        Random rand = new Random();
        Sequence1 sequence = new Sequence1();
        for(int i = 0 ; i < rand.nextInt(51) ; i++)
            sequence.add(Integer.toString(rand.nextInt(51)));
        sequence.print();
    }
}
