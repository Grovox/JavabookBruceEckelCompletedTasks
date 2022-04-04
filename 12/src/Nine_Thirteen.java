class MyException1 extends Exception{}
class MyException2 extends Exception{}
class MyException3 extends Exception{}
class  Exceptions{
    private void f1() throws MyException1{
        System.out.println("Запуск MyException1");
        throw new MyException1();
    }

    private void f2() throws MyException2{
        System.out.println("Запуск MyException2");
        throw new MyException2();
    }

    private void f3() throws MyException3{
        System.out.println("Запуск MyException3");
        throw new MyException3();
    }

    void start() throws MyException1, MyException2, MyException3 {
        System.out.println("Метод start");
//        f1();
        f2();
        f3();
    }
}

public class Nine_Thirteen {
    public static void main(String[] args) {
        Exceptions exs = new Exceptions();
        try {
//            exs.start();
            throw new NullPointerException();
        }catch (Exception e){
            System.out.println("Перехвачено!");
            e.printStackTrace(System.out);
        }finally {
            System.out.println("finally работает");
        }
    }
}
