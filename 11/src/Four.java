import java.util.*;

class NameHero{
    String[] nameHero= {"Рассказчик", "Тайлер Дёрден", "Марла Зингер", "Большой Боб", "Мистер Ангел"};
    private int i =0;
    String next(){
        if(i < 5){
            return nameHero[i++];
        }else{
            i=0;
            return nameHero[i++];
        }
    }
}

public class Four {
    public static void main(String[] args) {
        NameHero nameHero = new NameHero();
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();
        HashSet<String> hashSet = new HashSet<String>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        TreeSet<String> treeSet = new TreeSet<String>();
        for (int i = 0;i<10;i++)
            arrayList.add(nameHero.next());
        for (int i = 0;i<10;i++)
            linkedList.add(nameHero.next());
        for (int i = 0;i<10;i++)
            hashSet.add(nameHero.next());
        for (int i = 0;i<10;i++)
            linkedHashSet.add(nameHero.next());
        for (int i = 0;i<10;i++)
            treeSet.add(nameHero.next());

        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
