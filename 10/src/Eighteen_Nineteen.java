interface Interface_Eighteen{
    void print();
    class Class_in_interface implements Interface_Eighteen{
        @Override
        public void print() {
            System.out.println("hi");
        }

         public static void k(){
             Class_in_interface class_in_interface =  new Class_in_interface();
             class_in_interface.print();
        }
    }
}

class Wrapper_Eighteen implements Interface_Eighteen{

    @Override
    public void print() {

    }
}

public class Eighteen_Nineteen {
    public static void main(String[] args) {
        Wrapper_Eighteen wrapper_eighteen = new Wrapper_Eighteen();
        wrapper_eighteen.print();
        new Interface_Eighteen.Class_in_interface().k();
        new Interface_Eighteen.Class_in_interface().print();

    }
}
