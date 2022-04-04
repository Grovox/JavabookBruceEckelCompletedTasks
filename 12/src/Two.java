public class Two {
    public void f() throws Exception {
        System.out.println("Возбуждаем Exception из f()");
        throw new Exception();
    }
    public static void main(String[] args) {
        Two test =new Two();
        test = null;
        //test.f(); делает ошибку
        try{
            test.f();
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("Работвет:)");
        }
    }
}