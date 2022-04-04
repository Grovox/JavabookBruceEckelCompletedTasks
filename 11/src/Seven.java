import java.util.*;

class Testlist{
    /*ArrayList<Rodent> rodents = new ArrayList<Rodent>();*/
}

public class Seven {
    public static void main(String[] args) {
        Testlist[] testlist = {new Testlist(), new Testlist(), new Testlist(), new Testlist(), new Testlist(),
                new Testlist(), new Testlist(), new Testlist(), new Testlist(), new Testlist()};
        List<Testlist> list = new LinkedList<Testlist>(Arrays.asList(testlist));
        System.out.println(list);
        List<Testlist> list1 = list.subList(0,10);
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);
    }
}
