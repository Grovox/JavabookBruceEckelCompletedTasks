import Test_protected.*;
class Successor extends Slave{
public void call_metod(){
    metod();
    }
}

public class fifteen {
    public static void main(String[] args) {
        Slave slave = new Slave();
        //slave.metod();
        Successor successor = new Successor();
        successor.call_metod();
    }
}
