public class Nine {
    public static void main(String[] args) {
        float i = 1.5e-43f;
        float j = 1.7e-33f;
        double i1 = 1.3e-25;
        double j1 = 1.7e-71;
        if(i<j){
            System.out.println("float: Наибольшее: "+i);
            System.out.println("float: Наименьшее: "+j);
        }else {
            System.out.println("float: Наибольшее: "+j);
            System.out.println("float: Наименьшее: "+i);
        }

        if(i1<j1){
            System.out.println("double: Наибольшее: "+i1);
            System.out.println("double: Наименьшее: "+j1);
        }else {
            System.out.println("double: Наибольшее: "+j1);
            System.out.println("double: Наименьшее: "+i1);
        }
    }
}
