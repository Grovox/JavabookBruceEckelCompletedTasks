class thisException{
    void g(){
        System.out.println("Возбуждаем исключение : RuntimeException()");
        throw new RuntimeException();
        //throw new NullPointerException();
    }
    void f(){
    try {
        System.out.println("Вызываем g();");
        g();
    }catch (RuntimeException e){
        System.out.println("Перехватываем исключение : RuntimeException()");
        e.printStackTrace(System.out);
        System.out.println("Возбуждаем новое исключение : ArithmeticException");
        throw new ArithmeticException();
    }
    }
}

public class Ten_Eleven {
    public static void main(String[] args) {
        thisException exc = new thisException();
        try{
            exc.f();
        }catch (ArithmeticException e){
            System.out.println("Перехватываем исключение : ArithmeticException");
            e.printStackTrace(System.out);
        }
    }
}
