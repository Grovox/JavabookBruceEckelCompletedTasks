import TextFile.TextFile;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
class box{
    final String word_box;
    final int counter;
    private static int counterst =0;
    box(String word){
        word_box = word;
        counter =counterst;
        counterst++;
    }
    void print(){
        System.out.println(word_box+" "+counter);
    }
}
public class Twenty_two {
    public static void main(String[] args) {
        Set<String> words = new HashSet<String>(new TextFile("GGG.txt", "\\W+"));
        Iterator<String> words_iter = words.iterator();
        Set<box> stack = new HashSet<box>();
        while (words_iter.hasNext())
            stack.add(new box(words_iter.next()));
        Iterator<box> stack_iter = stack.iterator();
        while (stack_iter.hasNext())
            stack_iter.next().print();
    }
}