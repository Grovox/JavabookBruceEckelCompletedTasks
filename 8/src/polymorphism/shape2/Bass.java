package polymorphism.shape2;

public class Bass extends Wind{

    @Override
    void play(Note n){
        System.out.println("Bass.play() " + n);
    }

    @Override
    public void adjust(){
        System.out.println("Adjusting Bass");
    }


}
