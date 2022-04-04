class message_main{
    message_main(){
        System.out.println("Hello");
    }
    message_main(String name){
        System.out.println("Hello "+name);
    }
}

public class Four {
    public static void main(String[] args) {
        new message_main();
        new message_main("Mary");
    }
}
