class Shared {

    private int refcout = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared(){
        System.out.println("Coздаем " + this);
    }

    public void addRef(){
        refcout++;
    }

    protected void dispose(){
        if(--refcout == 0){
            System.out.println("Disposing " + this);
        }
    }

    public String toString(){
        return "Shared " + id;
    }

    @Override
    protected void finalize() {
        System.out.println("finalize().Shared");
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared){
        System.out.println("Создаем " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose(){
        System.out.println("dispose " + this);
        shared.dispose();
    }

    public String toString(){
        return "Composing " + id;
    }

    @Override
    protected void finalize(){
        System.out.println("finalize().Composing"+ this);
    }

}

public class Fourteen {
    public static void main(String[] args){
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared),new Composing(shared)};
        for(Composing c : composing) {
            c.dispose();
            c.finalize();
        }
        shared.finalize();
    }
}
