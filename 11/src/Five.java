import java.util.*;
class ListFeatures {

    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> numbers = new LinkedList<Integer>();
        for(int i = 0;i < 10; i++){
            numbers.add(rand.nextInt(25));
        }
        System.out.println("1: " + numbers);
       Integer h = rand.nextInt(25);
        numbers.add(h);
        System.out.println("2: " + numbers);
        System.out.println("3: " + numbers.contains(h));
        numbers.remove(h);
        Integer p = numbers.get(2);
        System.out.println("4: " + p + " " + numbers.indexOf(p));
        Integer number = numbers.get(rand.nextInt(9));
        System.out.println("number: " + number);
        System.out.println("5: " + numbers.indexOf(number));
        System.out.println("6: " + numbers.remove(number));
        System.out.println("7: " + numbers.remove(p));
        System.out.println("8: " + numbers);
        numbers.add(3, rand.nextInt(25));
        System.out.println("9: " + numbers);
        List<Integer> sub = new LinkedList<Integer>(numbers.subList(0,4));
        System.out.println("Частичный список: " + sub);
        System.out.println("10: " + numbers.containsAll(sub));
        Collections.sort(sub);
        System.out.println("После сортировки: " + sub);
        System.out.println("ll: " + sub.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("После перемешивания: " + sub);
        System.out.println("12: " + sub.containsAll(sub));
        List<Integer> copy = new LinkedList<Integer>(numbers);
        sub = Arrays.asList(numbers.get(1), numbers.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new LinkedList<Integer>(numbers);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, rand.nextInt(25));
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + numbers.isEmpty());
        numbers.clear();
        System.out.println("19: " + numbers);
        System.out.println("20: " + numbers.isEmpty());
        numbers.addAll(copy);
        System.out.println("21:" +numbers);
        Object[] o = numbers.toArray();
        System.out.println("22:" + o[3]);
        Integer[] pa = numbers.toArray(new Integer[0]);
        System.out.println("23: " + numbers.indexOf(pa[3]));
    }
}
public class Five {

}
