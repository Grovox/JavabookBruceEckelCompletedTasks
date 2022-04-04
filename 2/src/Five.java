class dog{
    String name;
    String says;
}
public class Five {
    public static void main(String[] args) {
        dog dog_one = new dog();
        dog dog_two = new dog();
        dog_one.name = "Mary";
        dog_two.name = "Max";
        dog_one.says = "Hi Max";
        dog_two.says = "Hello Mary";
        System.out.println(dog_one.name+": "+dog_one.says);
        System.out.println(dog_two.name+": "+dog_two.says);
    }
}
