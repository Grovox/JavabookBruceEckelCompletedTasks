import java.util.Random;

interface Throw{
    String Throw_();
}

interface ThrowFactory{
    Throw getThrow();
}

class CoinThrow implements Throw{
Random rand = new Random();
    @Override
    public String Throw_() {
        int chance = rand.nextInt(2);
        if(chance == 0){
            return "Орел";
        }else return "Решка";
    }
}

class CoinThrowFactory implements ThrowFactory{

    @Override
    public Throw getThrow() {
        return new CoinThrow();
    }
}

class CubeThrow implements Throw{
    Random rand = new Random();
    @Override
    public String Throw_() {
        int chance = rand.nextInt(6)+1;
        return "На кубике - "+String.valueOf(chance);
    }
}

class CubeThrowFactory implements ThrowFactory{

    @Override
    public Throw getThrow() {
        return new CubeThrow();
    }
}

class Games{
    public static void playGame(ThrowFactory factory){
        Throw throw_ = factory.getThrow();
        System.out.println(throw_.Throw_());
    }
}

public class Nineteen {
    public static void main(String[] args) {
        Games.playGame(new CoinThrowFactory());
        Games.playGame(new CubeThrowFactory());
    }
}
