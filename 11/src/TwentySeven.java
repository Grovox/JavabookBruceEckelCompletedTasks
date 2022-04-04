import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Command{
    private String text = "Queue-";
    int i = 0;
    static int k = 0;
    Command(){
        i = k;
        k++;
    }
    String operator(){
        return text+i;
    }
}

class Filling{
    Queue<Command> box = new LinkedList<Command>();
    void fill(){
        for(int i = 0; i < 10;i++){
            box.add(new Command());
        }
        System.out.println(box);
    }

    Queue<Command> out(){
        return box;
    }


}
class Print{
    void PrintCommand(Queue<Command> box){
        Iterator<Command> boxIterator = box.iterator();
        while (boxIterator.hasNext())
            System.out.println(boxIterator.next().operator());
    }
}



public class TwentySeven {
    public static void main(String[] args) {
        Filling filling= new Filling();
        filling.fill();
        Print print = new Print();
        print.PrintCommand(filling.out());
    }
}
