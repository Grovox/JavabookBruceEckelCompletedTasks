interface Monster{
    void menace();
}

interface DangerousMonster extends Monster{
    void destroy();
}

interface Lethal{
    void kill();
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class Wrapper3 {
    public DangerousMonster DragonZilla(){
        return new DangerousMonster() {

            @Override
            public void menace() {

            }
            @Override
            public void destroy() {

            }

        };
    }

    public Vampire VeryBadVampire () {
        return new Vampire(){
            @Override
            public void menace () {

            }

            @Override
            public void destroy () {

            }

            @Override
            public void kill () {

            }

            @Override
            public void drinkBlood () {

            }
        };
    }

    static class HorrorShow {
        static void u(Monster b) {
            b.menace();
        }

        static void v(DangerousMonster d) {
            d.destroy();
            d.menace();
        }

        static void w(Lethal l) {
            l.kill();
        }
    }
}
public class Twelve {
    public static void main(String[] args) {
        Wrapper3 wrapper3 = new Wrapper3();
        Wrapper3.HorrorShow horrorShow =new Wrapper3.HorrorShow();
        horrorShow.u(wrapper3.DragonZilla());
        horrorShow.v(wrapper3.DragonZilla());
        horrorShow.u(wrapper3.VeryBadVampire());
        horrorShow.v(wrapper3.VeryBadVampire());
        horrorShow.w(wrapper3.VeryBadVampire());
    }
}
