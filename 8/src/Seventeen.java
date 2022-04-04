
class AlertStatus{

    public void print(){
        System.out.println("None status");
    }

}

class  AlertGOODStatus extends  AlertStatus{

    public void print(){
        System.out.println("Good status");
    }

}

class  AlertBadStatus extends  AlertStatus{

    public void print(){
        System.out.println("Bad status");
    }

}

class  AlertFineStatus extends  AlertStatus{

    public void print(){
        System.out.println("Fine status");
    }

}

class Starship{
    private AlertStatus alertStatus = new AlertStatus();

    public void changeGood(){
        alertStatus = new AlertGOODStatus();
    }

    public void changeBad(){
        alertStatus = new AlertBadStatus();
    }

    public void changeFine(){
        alertStatus = new AlertFineStatus();
    }

    public void printStatus(){
        alertStatus.print();
    }

}

public class Seventeen {
    public static void main(String[] args) {
        Starship starship = new Starship();
        starship.printStatus();
        starship.changeBad();
        starship.printStatus();
        starship.changeGood();
        starship.printStatus();
        starship.changeFine();
        starship.printStatus();
    }

}
