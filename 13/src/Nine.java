import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nine {
    public static void main(String[] args) {
        String knights = "Then, when you have found the shrubbery, you must " +
                "cut down the mightiest tree in the forest... " +
                "with... a herring!";
        String knights_fix = knights.replaceAll("[aeiouy]", "-");
        System.out.println(knights_fix);
    }
}
