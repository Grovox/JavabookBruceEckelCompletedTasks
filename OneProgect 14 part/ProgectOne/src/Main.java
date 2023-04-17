import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        BoxAndFileOfClient.createClient("Alex");
        BoxAndFileOfClient.createClient("Max");
        BoxAndFileOfClient.createClient("Irina");

        Client client = BoxAndFileOfClient.getClient("Alex");
        client.addMoney(1000);

        ClassLoader classLoader = client.getClass().getClassLoader();
        Class[] interfaces = client.getClass().getInterfaces();

        ClassInterface proxyClient = (ClassInterface) Proxy.newProxyInstance(classLoader, interfaces, new Transaction(client));

        proxyClient.transferMoney(125,"Max");
        proxyClient.transferMoney(125,"Irina");

        proxyClient.transferMoney(125,"Yra");
        proxyClient.transferMoney(1250,"Max");

        System.out.println("Alex " + BoxAndFileOfClient.getClient("Alex").getMoney());
        System.out.println("Max " + BoxAndFileOfClient.getClient("Max").getMoney());
        System.out.println("Irina " + BoxAndFileOfClient.getClient("Irina").getMoney());
    }
}
