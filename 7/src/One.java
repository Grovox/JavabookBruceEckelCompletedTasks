
class Roro{
    private String s;
    Roro(){
        System.out.println("Roro");
        s="Rororira";
    }
    public String toString(){
        return s;
    }
}

public class  One {
    private String s;
    private Roro roro;
    One(){
        System.out.println("One");
        s = "что происходит?";
    }
    public String toString(){
        if(roro == null){
            roro = new Roro();
        }
        return s+" "+roro;
    }

    public static void main(String[] args) {
        One one = new One();
        System.out.println(one);    
    }
}
