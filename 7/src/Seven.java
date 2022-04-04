class AA{
    AA(int i){
        System.out.println("Я класс A");
    }
}

class BB{
    BB(int j){
        System.out.println("Я класс B");
    }
}

public class Seven extends AA {
    BB b = new BB(5);

    Seven(int i) {
        super(i);

    }

    public static void main(String[] args) {
        Seven seven = new Seven(5);
    }
}
