import java.io.*;

class People{
    int age;
    long footSize;
    float height;
    double weight;
    String name;

    public String toString(){
        return "age -> " + age + "\n"
                +"footSize -> " + footSize + "\n"
                +"height -> " + height + "\n"
                +"weight -> " + weight + "\n"
                +"name -> " + name + "\n";
    }
}

public class Twenty {
        public static BufferedReader input = new BufferedReader(
                new StringReader("Robin\n185.5 75.4\n44\n57"));
    public static void main(String[] args) {
        try {
            People people = new People();
            System.out.println("What is your name?");
            people.name = input.readLine();
            System.out.println(people.name);
            System.out.println("what is your height and weight?");
            System.out.println("(input: (height)<float> (weight)<double>)");
            String numbers = input.readLine();
            System.out.println(numbers);
            String[] numArray = numbers.split(" ");
            people.height = Float.parseFloat(numArray[0]);
            people.weight = Double.parseDouble(numArray[1]);
            System.out.println("what is your foot size?");
            System.out.println("(input: (foot size)<long>)");
            people.footSize = Long.parseLong(input.readLine());
            System.out.println(people.footSize);
            System.out.println("how old are you?");
            System.out.println("(input: (age)<int>)");
            people.age = Integer.parseInt(input.readLine());
            System.out.println(people.age);

            System.out.println("\n\n\nOutput of the toString function:\n" + people.toString());

        } catch(IOException e) {
            System.err.println("I/O exception");
        }
    }
}
