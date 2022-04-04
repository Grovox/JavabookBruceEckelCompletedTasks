import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Eight {
    public static void main(String[] args) {
        String knights = "Then, when you have found the shrubbery, you must " +
                "cut down the mightiest tree in the forest... " +
                "with... a herring!";
        Pattern pattern = Pattern.compile("(the|you)");
        Matcher m = pattern.matcher(knights);
        while (m.find()){
            System.out.println(m.start()+ " " + m.group() + " ");
        }
    }
}
