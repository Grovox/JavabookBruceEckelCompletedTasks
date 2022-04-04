class Outer{
    private String text;
    Outer(String text){
        this.text = text;
    }
    class Inner{
    public String toString(){
        return text;
    }
    }
    Inner getInner(){
        return new Inner();
    }
}


public class One_Tree {
    public static void main(String[] args) {
        Outer outer = new Outer("Hi") ;
        System.out.println(outer.getInner().getClass().getSimpleName());
    }
}
