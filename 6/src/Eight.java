
class ConnectionManager {
    private static int k=0;
    static class Connection{
        private Connection(){

        }
        public void prt(){
            System.out.println("Кость");
        }
    }
    private static Connection[] connections;
    private ConnectionManager(){

    }
    static Connection[] outp() {
        if (k < 5) {
            k++;
            return connections = new Connection[]{new Connection(), new Connection(), new Connection(), new Connection(), new Connection()};
        }else return null;
    }

}

public class Eight {
    public static void main(String[] args) {
        ConnectionManager.Connection[] con1 =ConnectionManager.outp();
        con1[0].prt();
        ConnectionManager.Connection[] con2 =ConnectionManager.outp();
        con2[0].prt();
        ConnectionManager.Connection[] con3 =ConnectionManager.outp();
        con3[0].prt();
        ConnectionManager.Connection[] con4 =ConnectionManager.outp();
        con4[0].prt();
        ConnectionManager.Connection[] con5 =ConnectionManager.outp();
        con5[0].prt();
        ConnectionManager.Connection[] con6 =ConnectionManager.outp();
        con6[0].prt();
    }
}
