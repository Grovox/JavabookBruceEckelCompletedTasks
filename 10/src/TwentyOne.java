import java.util.Random;

interface U{
    void UA();
    void UB();
    void UC();
}

class A{
  public static U AU(){
        return new U(){
            @Override
            public void UA() {
                System.out.println("UA ");
            }

            @Override
            public void UB() {
                System.out.println("UB");
            }

            @Override
            public void UC() {
                System.out.println("UC");
            }
        };
    }
}

class B{
   private U[] UBmass;
   private int size;
   private A a;

    B(int size,A a){
        this.size = size;
        this.a = a;
        UBmass = new U[size];
    }

    void Create_UBmass(){
        for (int i = 0;i < size; i++) {
            UBmass[i] = A.AU();
        }
    }

    void DeleteElement_UBmass(int k){
        if(k < size){
            UBmass[k] = null;
        } else System.out.println("Вы вышли за преел массива");
    }

    void Use_UBmass(){
        for(int i = 0;i < size; i++){
            if(UBmass[i] != null){
                UBmass[i].UA();
                UBmass[i].UB();
                UBmass[i].UC();
            }
        }
    }

}

public class TwentyOne {
    public static void main(String[] args) {
        A[] a = new A[3];
        B b;
        Random rand = new Random(47);
        for (int i = 0; i < a.length; i ++){
            b = new B(rand.nextInt(5),a[i]);
            b.Create_UBmass();
            b.DeleteElement_UBmass(rand.nextInt(5));
            b.DeleteElement_UBmass(rand.nextInt(5));
            b.DeleteElement_UBmass(rand.nextInt(5));
            b.Use_UBmass();
        }
    }
}
