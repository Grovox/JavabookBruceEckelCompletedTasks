class MyExeption extends Exception{}

class MyExeption2 extends Exception{}

public class Six {
    public static void main(String[] args) {
        try {
            throw new MyExeption();
        }catch (MyExeption e){
            e.printStackTrace(System.out);
        }

        try {
            throw new MyExeption2();
        }catch (MyExeption2 e){
            e.printStackTrace(System.out);
        }
    }
}