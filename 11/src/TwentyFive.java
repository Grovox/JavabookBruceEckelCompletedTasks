import TextFile.TextFile;

import java.util.*;

public class TwentyFive {
    public static void main(String[] args) {
        Map<String,ArrayList<Integer>> box = new HashMap<String, ArrayList<Integer>>();
        ArrayList<Integer> num = new ArrayList<Integer>();
        LinkedList<String> words = new LinkedList<>(new TextFile("GGG.txt", "\\W+"));
        Set<String> words1 = new HashSet<String>(new TextFile("GGG.txt", "\\W+"));
        Iterator<String> words_iter = words1.iterator();
        while (words_iter.hasNext()){
            String k = words_iter.next();
            ListIterator<String> words_iter1 = words.listIterator();
            while (words_iter1.hasNext()){
                if(k.equals(words_iter1.next())){
                    num.add(words_iter1.nextIndex());
                }
            }
            ArrayList<Integer> num1 = new ArrayList<Integer>(num);
            box.put(k,num1);
            num.clear();
        }
        System.out.println(box);
    }
}
