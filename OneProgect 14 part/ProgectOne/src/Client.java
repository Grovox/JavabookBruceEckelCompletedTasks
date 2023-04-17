import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Client implements ClassInterface {
    private String name;
    private int money;
    public static final File partOfClient;

    public static final Path LogFile;
    private Path fileCardClient;

    static {
        File[] directoriesOfClientsFiles = new File("C:\\Users\\Grovox\\Desktop\\Projects\\Javabook_BruceEckel_completedTasks\\OneProgect 14 part\\ProgectOne\\FilesOfClientsAndLogs").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });
        String nameToPart = "C:\\Users\\Grovox\\Desktop\\Projects\\Javabook_BruceEckel_completedTasks\\OneProgect 14 part\\ProgectOne\\FilesOfClientsAndLogs\\RunProgram-"
                + String.valueOf(directoriesOfClientsFiles.length+1);

        partOfClient = new File(nameToPart);
        partOfClient.mkdir();

        try {
            LogFile = Files.createFile(Path.of(partOfClient.getPath(),"LogFile.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Client(String name, int money) {
        this.name = name;
        this.money = money;

        createFileClient();
    }

    public Client(String name) {
        this.name = name;
        money = 0;

        createFileClient();
    }
    private void createFileClient(){
        try {
            fileCardClient = Files.createFile(Path.of(partOfClient.getPath(),name+".txt"));

            String text = "Name - " + name + "\n" + "Money - 0";

            Files.write(fileCardClient, text.getBytes(), StandardOpenOption.APPEND);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void refactorFileClient(){
        try {
            BufferedWriter bf = Files.newBufferedWriter(Path.of(fileCardClient.toAbsolutePath().toString()),
                    StandardOpenOption.TRUNCATE_EXISTING);

            String text = "Name - " + name + "\n" + "Money - " + money;

            Files.write(fileCardClient, text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money += money;

        refactorFileClient();

        String text = "У клиента " + this.name + " добавился баланс на " + money + ", текущий баланс - " + this.money + "\n";
        try {
            Files.write(LogFile, text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void removeMoney(int money) {
        this.money -= money;

        refactorFileClient();

        String text = "У клиента " + this.name + " убавился баланс на " + money + ", текущий баланс - " + this.money + "\n";
        try {
            Files.write(LogFile, text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void transferMoney(int money, String name){
        removeMoney(money);
    }
}
