import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;
public class BoxAndFileOfClient {
    private static Map<String, Client> clients = new HashMap<>();

    static public Client getClient(String name) {
        return clients.get(name);
    }

    static public void createClient(String name){
        clients.put(name,new Client(name));
    }

    static public void removeClient(String name) {
        clients.remove(name);
    }
}
