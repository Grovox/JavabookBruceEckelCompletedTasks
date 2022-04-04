interface Day{
   String M = "Monday";
}

public class Seventeen {
    public static void main(String[] args) {
        Day day = new Day() {};
        //!day.M = "k";
       String k = Day.M;
    }
}
