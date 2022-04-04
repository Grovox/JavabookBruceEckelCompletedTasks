class BaseException{
    BaseException(){
        throw new ArrayIndexOutOfBoundsException();
    }
}

class derivative extends BaseException{

    derivative(){
        try{

        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace(System.out);
        }
    }
}

public class TwentyOne {
    public static void main(String[] args) throws Exception {
        derivative der = new derivative();
    }
}
