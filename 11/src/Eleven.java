import java.util.*;
interface Test_Eleven{
    String toString();
}
class Test_Eleven_one implements Test_Eleven{
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}

class Test_Eleven_two implements Test_Eleven{
    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}

public class Eleven {
    public static void main(String[] args) {
        List<Test_Eleven>  test = new LinkedList<>();
        for(int i = 0;i < 10;i++){
            if(i%2 == 1){
                test.add(new Test_Eleven_one());
            }else {
                test.add(new Test_Eleven_two());
            }
        }
        Iterator<Test_Eleven> test_Iterator = test.iterator();
        while(test_Iterator.hasNext()) {
            System.out.println(test_Iterator.next().toString());
        }
    }
}
