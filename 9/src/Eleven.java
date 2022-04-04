import Test_interface.interfaceprocessor.*;

abstract class goprocess implements Processor{

    @Override
    public String name() {
        return getClass().getSimpleName();
    }
    @Override
    public abstract String process(Object input);
}

class Change extends goprocess {
    @Override
    public String process(Object input) {
        String text = input.toString();
        String[] chancetext = text.split("");
        String changetext2 = "";
        String storage;
        int k;
        for(int i =1; i<text.length();i+=2) {
            k=i-1;
            storage = chancetext[i];
            chancetext[i] = chancetext [k];
            chancetext[k] = storage;

        }
        for(int i =0; i<text.length();i++) {
            changetext2+=chancetext[i];
        }
        return changetext2;
    }
}

public class Eleven {
    public static void main(String[] args) {
        Change change = new Change();
        String text = "Привет";
        Apply.process(new Change(), text);
    }
}
