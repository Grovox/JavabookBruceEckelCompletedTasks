import ExtraFile.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Eighteen {
    public static void main(String[] args) throws Exception {
        if(args.length < 1) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile("\".+?\"");
        Pattern pLowComment = Pattern.compile("//");
        Pattern pOpenBigComment = Pattern.compile("/\\*");
        Pattern pCloseBigComment = Pattern.compile("\\*/");
        int index = 0;
        Matcher m = p.matcher("");
        Matcher mLowComment = pLowComment.matcher("");
        Matcher mOpenBigComment = pOpenBigComment.matcher("");
        Matcher mCloseBigComment = pCloseBigComment.matcher("");
        Boolean lowComment = false;
        Boolean bigComment = false;
        for(String line : new TextFile(args[0])) {
            m.reset(line);
            mLowComment.reset(line);
            mOpenBigComment.reset(line);
            mCloseBigComment.reset(line);
            if(mLowComment.find())
                lowComment = true;
            if(mOpenBigComment.find())
                bigComment = true;
            if(mCloseBigComment.find())
                bigComment = false;

            while(m.find() && lowComment == false && bigComment == false)
                System.out.println(m.group());
            lowComment = false;
        }
    }
}
