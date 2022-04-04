class Close{
    private int close_int = 0;
    private void close_method(){
        System.out.println(close_int);
    }
    public void call_change(){
        inter_class interClass = new inter_class();
        interClass.change();
    }
    class inter_class{
        void change(){
            close_int=5;
            close_method();
        }
    }
}

public class Seven {
    public static void main(String[] args) {
        Close close = new Close();
        close.call_change();
    }
}
