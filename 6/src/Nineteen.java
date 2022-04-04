class Empty{
    private int i;
    Empty(int n){
        i=n;
    }
}

class Empty_final{
   private final Empty empty;

    Empty_final() {
        empty = new Empty(1);
    }
    Empty_final(int i) {
        empty = new Empty(i);
    }
   /* public void change(int i){
        empty = new Empty(i);
    }*/
}

public class Nineteen {
    public static void main(String[] args) {
        Empty_final empty_final = new Empty_final();
        Empty_final empty_final1 = new Empty_final(15);
        //empty_final.empty;
    }
}
