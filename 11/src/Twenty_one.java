import TextFile.TextFile;

import java.util.*;

public class Twenty_one {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>(new TextFile("GGG.txt", "\\W+"));
        Collections.sort(words,String.CASE_INSENSITIVE_ORDER);
        Iterator<String> iterator_words = words.iterator();
        Map<String,Integer> words1 = new TreeMap<String, Integer>();
        int i = 0;
        while (iterator_words.hasNext()) {
            words1.put(iterator_words.next(),i);
            i++;
        }
        System.out.println(words1);
    }
}