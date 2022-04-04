public class Six {
    public static void main(String[] args) {
        dog dog_one = new dog();
        dog dog_two = new dog();
        dog_one.name = "Mary";
        dog_two.name = "Max";
        dog_one.says = "Hi Max";
        dog_two.says = "Hello Mary";
        dog spot = new dog();
        System.out.println(spot == dog_one);
        System.out.println(dog_two.equals(spot));
    }
}
