import java.util.*;

class ListFeatures2 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<String> words = new LinkedList<String>();
        words.add("Rat");
        words.add("Manx");
        words.add("Cymric");
        words.add("Mutt");
        words.add("Pug");
        words.add("Cymric");
        words.add("Pug");
        System.out.println("1: " + words);
        String h = "Hamser";
        words.add(h);
        System.out.println("2: " + words);
        System.out.println("3: " + words.contains(h));
        words.remove(h);
        String p = words.get(2);
        System.out.println("4: " + p + " " + words.indexOf(p));
        String word = words.get(rand.nextInt(7));
        System.out.println("5: " + words.indexOf(word));
        System.out.println("6: " + words.remove(word));
        System.out.println("7: " + words.remove(p));
        System.out.println("8: " + words);
        words.add(3, "Hello");
        System.out.println("9: " + words);
        List<String> sub = new LinkedList<String>(words.subList(0,3));
        System.out.println("Частичный список: " + sub);
        System.out.println("10: " + words.containsAll(sub));
        Collections.sort(sub);
        System.out.println("После сортировки: " + sub);
        System.out.println("ll: " + sub.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("После перемешивания: " + sub);
        System.out.println("12: " + sub.containsAll(sub));
        List<String> copy = new LinkedList<String>(words);
        sub = Arrays.asList(words.get(1), words.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new LinkedList<String>(words);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, "Lol");
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + words.isEmpty());
        words.clear();
        System.out.println("19: " + words);
        System.out.println("20: " + words.isEmpty());
        words.addAll(copy);
        System.out.println("21:" +words);
        Object[] o = words.toArray();
        System.out.println("22:" + o[3]);
        String[] pa = words.toArray(new String[0]);
        System.out.println("23: " + words.indexOf(pa[3]));
    }
}
public class Six {
}
