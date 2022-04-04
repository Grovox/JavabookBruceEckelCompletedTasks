import java.util.Random;

interface Throw{
    String Throw_();
}

interface ThrowFactory{
    Throw getThrow();
}

class Wrapper_Fifteen{
    public static Throw CoinThrow(){
        return new  Throw() {
            Random rand = new Random();

            @Override
            public String Throw_() {
                int chance = rand.nextInt(2);
                if (chance == 0) {
                    return "Орел";
                } else return "Решка";
            }
        };
    }

    public static Throw CubeThrow() {
        return new Throw(){
            Random rand = new Random();

            @Override
            public String Throw_() {
                int chance = rand.nextInt(6) + 1;
                return "На кубике - " + String.valueOf(chance);
             }
        };
    }

    static class Games{
        public static void playGame(){
            Throw throw_ = Wrapper_Fifteen.CoinThrow();
            Throw throw_1 = Wrapper_Fifteen.CubeThrow();
            System.out.println(throw_.Throw_());
            System.out.println(throw_1.Throw_());
        }
    }
}

public class Fifteen {
    public static void main(String[] args) {
       Wrapper_Fifteen.Games.playGame();
    }
}
