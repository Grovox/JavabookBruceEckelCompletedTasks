import java.util.regex.*;
import java.util.*;

public class Fourteen {
    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input)));
        System.out.println();
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input, 3)));
        System.out.println();
        for(String out : input.split("!!"))
            System.out.println(out);
        System.out.println();
        for(String out : input.split("!!",3))
            System.out.println(out);
    }
}