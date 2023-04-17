import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class Transaction implements InvocationHandler {
    private Client client;
    public Transaction(Client client) {
        this.client = client;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Client clientRecipient = BoxAndFileOfClient.getClient(args[1].toString());


        if(clientRecipient == null) {
            String text = "Клиент " + args[1].toString() + " для подобного перевода небыл найден\n";
            try {
                Files.write(client.LogFile, text.getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            if (client.getMoney() < (Integer) args[0]) {
                String text = "У клиента " + client.getName() + " недостаточно средств для перевода \n";
                try {
                    Files.write(client.LogFile, text.getBytes(), StandardOpenOption.APPEND);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }else {
                String text = "Клиент " + client.getName() + " перевел " + (Integer) args[0] + " клиенту " + clientRecipient.getName() + "\n";
                try {
                    Files.write(client.LogFile, text.getBytes(), StandardOpenOption.APPEND);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                clientRecipient.addMoney((Integer) args[0]);
                method.invoke(client, (Integer) args[0], (String) args[1]);
            }
        }
        return null;
    }
}
