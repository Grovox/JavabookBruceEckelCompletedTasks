import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ten    {
    public static void main(String[] args) {

        String k = "Java now has regular expressions";

        Pattern p = Pattern.compile("^Java");
        Matcher m = p.matcher(k);
        System.out.println(m.find());

        p = Pattern.compile("\\Breg.*");
        m = p.matcher(k);
        System.out.println(m.find());

        p = Pattern.compile("n.w\\s+h(a|i)s");
        m = p.matcher(k);
        System.out.println(m.find());

        p = Pattern.compile("s?");
        m = p.matcher(k);
        System.out.println(m.find());

        p = Pattern.compile("s*");
        m = p.matcher(k);
        System.out.println(m.find());

        p = Pattern.compile("s+");
        m = p.matcher(k);
        System.out.println(m.find());

        p = Pattern.compile("s{4}");
        m = p.matcher(k);
        System.out.println(m.find());

        p = Pattern.compile("s{1}");
        m = p.matcher(k);
        System.out.println(m.find());

        p = Pattern.compile("s{0,3}");
        m = p.matcher(k);
        System.out.println(m.find());


    }
}
