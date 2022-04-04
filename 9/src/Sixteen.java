import java.io.IOException;
import java.nio.*;
import java.util.*;

class GenerateWord implements Readable{
    private static Random rand = new Random();
    private static final char[] BaseCapitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWYZ".toCharArray();
    private static final char[] BaseLowersLetter = "abcdefghijklmnopqrstuvwyz".toCharArray();
    private int LengthWord;
    GenerateWord(int LengthWord){
        this.LengthWord = LengthWord;
    }

    @Override
    public int read(CharBuffer cb){
    cb.append(BaseCapitalLetter[rand.nextInt(BaseCapitalLetter.length)]);
    for(int i = 0; i<LengthWord; i++){
        cb.append(BaseLowersLetter[rand.nextInt(BaseLowersLetter.length)]);
    }
    cb.append(" ");
        return ++LengthWord;
    }

}


public class Sixteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new GenerateWord(17));
        System.out.println(scanner.next());

    }
}
