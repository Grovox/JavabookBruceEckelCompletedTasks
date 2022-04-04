interface Test_Thirteen{

}

class Wrapper4{

   public Test_Thirteen Test_Thirteen_out11 (int k){
       return new Test_Thirteen(){
           {
               System.out.println(k);
           }
       };
   }

    class Test_Thirteen_Two{
       public Test_Thirteen Test_Thirteen_out(int b){
           return Wrapper4.this.Test_Thirteen_out11(b);
       }
    }

}


public class Thirteen {
    public static void main(String[] args) {
        Wrapper4 wrapper4 = new Wrapper4();
        Wrapper4.Test_Thirteen_Two test_thirteen_two = wrapper4.new Test_Thirteen_Two();
        test_thirteen_two.Test_Thirteen_out(11);
    }

}
