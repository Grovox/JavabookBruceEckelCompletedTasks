import java.util.*;

public class Twenty_four {
    public static void main(String[] args) {
        Map<String,String> storage = new HashMap<String, String>();
        storage.put("a","aaa");
        storage.put("b","bbb");
        storage.put("f","fff");
        storage.put("c","ccc");
        storage.put("d","ddd");
        storage.put("i","iii");
        storage.put("g","ggg");
        System.out.println(storage);
        ArrayList<String> list = new ArrayList<String>(storage.keySet());
        Arrays.sort(new ArrayList[]{list});
        Iterator<String> list_iter= list.listIterator();
        Map<String,String> storage_two = new HashMap<String, String>();
        while (list_iter.hasNext()){
            String box = list_iter.next();
            storage_two.put(box,storage.get(box));
            System.out.println(box);
        }
        System.out.println(storage_two);
    }
}
