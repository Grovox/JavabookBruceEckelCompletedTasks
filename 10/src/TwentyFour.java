import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class TwentyFour {
    public static void main(String[] args) {
        LinkedHashMap<String,String> test = new LinkedHashMap<String, String>();
        test.put("i","ii");
        test.put("d","dd");
        test.put("c","cc");
        test.put("a","aa");
        test.put("b","bb");
        System.out.println(test);
        List<String> box = new LinkedList<String>();
        for(int i = 0 ;i < 5;i++){
            if(i == 0)
                box.add(test.get("a"));
            if(i == 1)
                box.add(test.get("b"));
            if(i == 2)
                box.add(test.get("c"));
            if(i == 3)
                box.add(test.get("d"));
            if(i == 4)
                box.add(test.get("i"));
        }
        Iterator<String> iteratorbox = box.iterator();
        while (iteratorbox.hasNext())
            System.out.println(iteratorbox.next());
        iteratorbox = box.iterator();
        test.clear();
        System.out.println(test);
        test.put("a",iteratorbox.next());
        test.put("b",iteratorbox.next());
        test.put("c",iteratorbox.next());
        test.put("d",iteratorbox.next());
        test.put("i",iteratorbox.next());
        System.out.println(test);
    }
}
