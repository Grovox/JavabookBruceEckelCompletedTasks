
import java.util.*;

public class Sixteen_Twenty {
    public static void main(String[] args) {
        Set<String> Character = new HashSet<String>(Arrays.asList("а А у У о О и И э Э ы Ы".split(" ")));
        Map<String,Integer> box = new HashMap<String, Integer>();
        int Counter = 0;
        int AllCounter = 0;
        String text = "Я хотел бы удалить первый символ строки";
        for(String s : text.split(" ")){
            Counter = 0;
            char[] ch = s.toCharArray();
            for(int i = 0;i < s.length();i++){
                if(Character.contains(String.valueOf(ch[i]))){
                    Counter++;
                    AllCounter++;
                }
            }
            System.out.println("В слове - # "+s+" # Гласных букв - "+Counter);
            box.put(s,Counter);
        }
        System.out.println("Всего гласных букв в тексе - "+AllCounter);
        System.out.println(box);
    }
}
