import java.util.LinkedList;
import java.util.List;
import java.util.Random;

interface Selector{
    boolean end();
    Object current();
    void next();
}

class Sequence{
     private List<Object> items = new LinkedList<>();
    /*private Object[] items;
    private int next = 0;

    public Sequence(int size){
        items = new Object[size];
    }*/
    public void add(Object x){
       this.items.add(x);
       /* if(next<items.length)
            items[next++] = x;*/
    }

    private class SequenceSelector implements Selector{
        private int i =0;

        @Override
        public boolean end() {
            return i == items.size();
        }

        @Override
        public Object current() {
            return items.get(i);
        }

        @Override
        public void next() {
            if(i<items.size())
                i++;
        }
    }

    public Selector selector(){
        return new SequenceSelector();
    }
}

public class Tree {
    public static void main(String[] args) {
        Random rand = new Random();
        Sequence sequence = new Sequence();
        for(int i = 0 ; i < rand.nextInt(50) ; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
