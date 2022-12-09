import java.util.regex.*;
import ExtraFile.TextFile;

public class Seventeen {
    public static void main(String[] args) throws Exception {
        if(args.length < 1) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        //Find comment in file
        Pattern pLow = Pattern.compile("//.+");
        Pattern pOpenBig = Pattern.compile("/\\*");
        Pattern pCloseBig = Pattern.compile("\\*/");
        Pattern pAllLine = Pattern.compile(".+");
        int index = 0;
        Matcher mLow = pLow.matcher("");
        Matcher mOpenBig = pOpenBig.matcher("");
        Matcher mCloseBig = pCloseBig.matcher("");
        Matcher mAllLine = pAllLine.matcher("");
        Boolean flagBigComment = false;
        for(String line : new TextFile(args[0])) {
            mLow.reset(line);
            mOpenBig.reset(line);
            mCloseBig.reset(line);
            mAllLine.reset(line);

            if(mOpenBig.find())
                flagBigComment = true;

            while (mAllLine.find() && flagBigComment == true)
                System.out.println(mAllLine.group());

            if (mCloseBig.find())
                flagBigComment = false;

            while(mLow.find() && flagBigComment == false)
                System.out.println(mLow.group());

        }
    }
}
