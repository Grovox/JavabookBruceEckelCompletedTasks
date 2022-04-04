public class Tree_Seven_TwentySeven {
    public void f() throws ArrayIndexOutOfBoundsException {
        System.out.println("Возбуждаем Exception из f()");
        try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (Exception e){
            throw new RuntimeException();
        }
    }
    public static void main(String[] args) {
        Tree_Seven_TwentySeven test =new Tree_Seven_TwentySeven();
        try{
            test.f();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("Работвет:)");
        }
    }
}