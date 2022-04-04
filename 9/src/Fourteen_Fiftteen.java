interface Dragon{
    void Burn();
    void Eat();
}

interface Vampire{
    void DrinkBlood();
    void kill();
}

interface Werewolf{
    void Tear();
    void BiteOffTheHead();
}

interface DangerousCreatures extends Dragon,Vampire,Werewolf{
    void HazardCounter();
}

abstract class CreateMythicalWorld implements DangerousCreatures{

    /*public void Dragon(Dragon dragon){

    }

    public void Vampire(Vampire vampire){

    }

    public void Werewolf(Werewolf werewolf){

    }

    public void DragonVampireWerewolf(Dragon dragon,Vampire vampire,Werewolf werewolf){

    }*/

    @Override
    public void Burn() {

    }

    @Override
    public void Eat() {

    }

    @Override
    public void DrinkBlood() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void Tear() {

    }

    @Override
    public void BiteOffTheHead() {

    }

    @Override
    public void HazardCounter() {

    }

}

class World extends CreateMythicalWorld{
    public void Dragon(Dragon dragon){

    }

    public void Vampire(Vampire vampire){

    }

    public void Werewolf(Werewolf werewolf){

    }

    public void DragonVampireWerewolf(Dragon dragon,Vampire vampire,Werewolf werewolf){

    }
}

public class Fourteen_Fiftteen {
    public static void main(String[] args) {
       // CreateMythicalWorld go = new CreateMythicalWorld();
        World go = new World();
        go.Dragon(go);
        go.Vampire(go);
        go.Werewolf(go);
        go.DragonVampireWerewolf(go,go,go);
    }
}
