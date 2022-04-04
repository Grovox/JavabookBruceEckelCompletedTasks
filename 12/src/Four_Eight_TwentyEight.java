class SimpleException extends RuntimeException{
    String n;
    SimpleException(String n){
        this.n = n;
        print();
    }
    void print(){
        System.out.println(n);
    }
}

public class Four_Eight_TwentyEight {
    public void f() throws SimpleException {
        System.out.println("Возбуждаем SimpleException из f()");
        throw new SimpleException("11");

    }
    public static void main(String[] args) {
        Four_Eight_TwentyEight test =new Four_Eight_TwentyEight();
        try{
            test.f();
        }catch (RuntimeException e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("Работвет:)");
        }
    }
}