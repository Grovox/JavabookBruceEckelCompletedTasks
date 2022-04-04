import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Eleven {
    public static void main(String[] args) {

        String k = "Arline ate eight apples and one orange while Anita hadn't any";

        Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b");
        Matcher m = p.matcher(k);
        while (m.find()){
            System.out.println(" " + m.start() + " " + m.group() + " ");
        }
    }
}
