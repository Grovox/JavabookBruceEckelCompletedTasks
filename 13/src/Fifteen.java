
// {Args: JGrep.java "\\b[Ssct]\\w+"}

import java.util.regex.*;
import ExtraFile.TextFile;

public class Fifteen {
    public static void main(String[] args) throws Exception {
        if(args.length < 2) {
            System.out.println("Usage: java Fifteen file regex");
            System.exit(0);
        }

        int flag = 0;
            for (int indexFlag = 2; indexFlag < args.length; indexFlag++) {
                if ( args[indexFlag].equals("Pattern.CANON_EQ"))
                    flag += Pattern.CANON_EQ;
                if (args[indexFlag].equals("Pattern.CASE_INSENSITIVE"))
                    flag += Pattern.CASE_INSENSITIVE;
                if (args[indexFlag].equals("Pattern.COMMENTS"))
                    flag += Pattern.COMMENTS;
                if (args[indexFlag].equals("Pattern.MULTILINE"))
                    flag += Pattern.MULTILINE;
                if (args[indexFlag].equals("Pattern.DOTALL"))
                    flag += Pattern.DOTALL;
                if (args[indexFlag].equals("Pattern.LITERAL"))
                    flag += Pattern.LITERAL;
                if (args[indexFlag].equals("Pattern.UNICODE_CASE"))
                    flag += Pattern.UNICODE_CASE;
                if (args[indexFlag].equals("Pattern.UNIX_LINES"))
                    flag += Pattern.UNIX_LINES;
            }
        Pattern p = Pattern.compile(args[1], flag);
        int index = 0;
        Matcher m = p.matcher("");
        for(String line : new TextFile(args[0])) {
            m.reset(line);
            while(m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
        }
    }
}