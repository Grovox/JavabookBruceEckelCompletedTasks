interface Selector{
    boolean end();
    Object current();
    void next();
}

interface reverseSelector{
    boolean start();
    Object current();
    void back();
}


    class Text {
        String text = "Крот";

        public String toString() {
            return text;
        }
    }

    class Sequence {
        SequenceSelector sequenceSelector = new SequenceSelector();
        Text[] text = new Text[3];
        private Object[] items;
        private int next = 0;

        Sequence(int size) {
            items = new Object[size];
        }

        public void add(Object x) {
            if (next < items.length)
                items[next++] = x;
        }


         private class SequenceSelector implements Selector,reverseSelector {
            private int i = 0;

            @Override
            public boolean end() {
                return i == items.length;
            }

            @Override
            public boolean start() {
                return i == 0;
            }

            @Override
            public Object current() {
                return items[i];
            }

            @Override
            public void back() {
                if (i > 0)
                    i--;
            }

            @Override
            public void next() {
                if (i <= items.length)
                    i++;
            }

            public Sequence SequenceOut() {
                return Sequence.this;
            }
        }
        public Selector selector() {
            return sequenceSelector;
        }
        public reverseSelector reverseSelector() {
            return sequenceSelector;
        }
    }

public class Two_Four_Twenty {
    public static void main(String[] args) {
       Sequence sequence = new Sequence(10);
        sequence.add(new Text());
        for(int i = 0;i<9;i++)
            sequence.add(i);
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
        reverseSelector reverseSelector = sequence.reverseSelector();
        while (!reverseSelector.start()){
            reverseSelector.back();
            System.out.println(reverseSelector.current());
        }
    }

}
