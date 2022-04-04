import java.util.regex.Pattern;
import java.util.regex.Matcher;

class testreg{
    private Pattern p = Pattern.compile("^[A-Z].*\\.$");
    private Matcher m;
    public boolean run(String text){
        m = p.matcher(text);
        return m.find();
    }
}
public class Seven {
    public static void main(String[] args) {
        String s = "I like spending time with my friends.";
        testreg reg = new testreg();
        System.out.println(reg.run(s));
    }
}
