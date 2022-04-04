import Test_interface.interfaceprocessor.*;

class Wrappper_Fourteen{
    public static ProcessorQ Change() {
        return new ProcessorQ(){

            @Override
            public String name (){
                return this.getClass().getSimpleName();
            }
            @Override
            public String process (Object input){
                String text = input.toString();
                String[] chancetext = text.split("");
                String changetext2 = "";
                String storage;
                int k;
                for (int i = 1; i < text.length(); i += 2) {
                    k = i - 1;
                    storage = chancetext[i];
                    chancetext[i] = chancetext[k];
                    chancetext[k] = storage;

                }
                for (int i = 0; i < text.length(); i++) {
                    changetext2 += chancetext[i];
                }
                return changetext2;
            }
        } ;
    }
    static class Apply {
        public static void process(Object s){
            ProcessorQ p = Wrappper_Fourteen.Change();
            System.out.println("Using Processor "+p.name());
            System.out.println(p.process(s));
        }
    }


}

public class Fourteen {
    public static void main(String[] args) {
        String text = "Привет";
        Wrappper_Fourteen.Apply.process(text);
    }
}



