import java.io.File;
import java.util.regex.*;
import ExtraFile.TextFile;

public class Sixteen {
    public static void main(String[] args) throws Exception {

        if(args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        Matcher m = p.matcher("");
        int index;
        if (args[0].matches("\\w+\\.\\w+")){
            index = 0;
            for(String line : new TextFile(args[0])) {
                m.reset(line);
                while(m.find())
                    System.out.println(index++ + ": " + m.group() + ": " + m.start());
            }
        }else {
            File[] files = new File(args[0]).listFiles();
            for (int i = 0; i < files.length; i++){
                index = 0;
                System.out.println(files[i].getName()+"\n");
                for (String line : new TextFile(files[i].getAbsolutePath())){
                    m.reset(line);
                    while(m.find())

                        System.out.println(index++ + ": " + m.group() + ": " + m.start());
                }
            }
        }
    }
}

