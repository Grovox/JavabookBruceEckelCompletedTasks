public class One {
     public void f() throws Exception {
        System.out.println("Возбуждаем Exception из f()");
        throw new Exception();
    }
    public static void main(String[] args) {
        One test =new One();
        try{
            test.f();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("Работвет:)");
        }
    }
}
