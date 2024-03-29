import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Twelve {
    public static void main(String[] args) {
        String POEM =
                "Twas brillig, and the slithy toves\n" +
                        "Did gyre and gimble in the wabe.\n" +
                        "All mimsy were the borogoves,\n" +
                        "And the mome raths outgrabe.\n\n" +
                        "Beware the Jabberwock, my son,\n" +
                        "The jaws that bite, the claws that catch.\n" +
                        "Beware the Jubjub bird, and shun\n" +
                        "The frumious Bandersnatch.";
            Matcher m =
                    Pattern.compile("[^A-Z\\S]+[a-z]+").matcher(POEM);
            int numberWords = 0;
            while(m.find()) {
                for(int j = 0; j <= m.groupCount(); j++)
                    System.out.println("[" + m.group(j) + "]");
                System.out.println();
                numberWords++;
        }
            System.out.println("Количество слов с срочной буквы ->"+numberWords);
    }
}
