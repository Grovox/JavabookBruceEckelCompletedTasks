public class Ten {
    public static void main(String[] args) {
        int k1,k2,k3,k4;
        for(int i = 1000;i < 10000; i++){
            k1=i%10;
            k2=i%100-k1;
            k3=i%1000-k2-k1;
            k4=i-k3-k2-k1;
            k2/=10;
            k3/=100;
            k4/=1000;
            if(i == (k1*10+k2)*(k3*10+k4))
                System.out.println(i + " = " + (k1*10+k2)+"*"+(k3*10+k4));
            if(i == (k1*10+k3)*(k2*10+k4))
                System.out.println(i + " = " + (k1*10+k3)+"*"+(k2*10+k4));
            if(i == (k1*10+k3)*(k4*10+k2))
                System.out.println(i + " = " + (k1*10+k3)+"*"+(k4*10+k2));
            if(i == (k1*10+k4)*(k3*10+k2))
                System.out.println(i + " = " + (k1*10+k4)+"*"+(k3*10+k2));
            if(i == (k1*10+k4)*(k2*10+k3))
                System.out.println(i + " = " + (k1*10+k4)+"*"+(k2*10+k3));
            if(i == (k1*10+k2)*(k4*10+k3))
                System.out.println(i + " = " + (k1*10+k2)+"*"+(k4*10+k3));
            if(i == (k2*10+k1)*(k3*10+k4))
                System.out.println(i + " = " + (k2*10+k1)+"*"+(k3*10+k4));
            if(i == (k2*10+k1)*(k4*10+k3))
                System.out.println(i + " = " + (k2*10+k1)+"*"+(k4*10+k3));
            if(i == (k2*10+k4)*(k1*10+k3))
                System.out.println(i + " = " + (k2*10+k4)+"*"+(k1*10+k3));
            if(i == (k2*10+k4)*(k3*10+k1))
                System.out.println(i + " = " + (k2*10+k4)+"*"+(k3*10+k1));
            if(i == (k2*10+k3)*(k1*10+k4))
                System.out.println(i + " = " + (k2*10+k3)+"*"+(k1*10+k4));
            if(i == (k2*10+k3)*(k4*10+k1))
                System.out.println(i + " = " + (k2*10+k3)+"*"+(k4*10+k1));
            if(i == (k3*10+k1)*(k2*10+k4))
                System.out.println(i + " = " + (k3*10+k1)+"*"+(k2*10+k4));
            if(i == (k3*10+k1)*(k4*10+k2))
                System.out.println(i + " = " + (k3*10+k1)+"*"+(k4*10+k2));
            if(i == (k3*10+k2)*(k1*10+k4))
                System.out.println(i + " = " + (k3*10+k2)+"*"+(k1*10+k4));
            if(i == (k3*10+k2)*(k4*10+k1))
                System.out.println(i + " = " + (k3*10+k2)+"*"+(k4*10+k1));
            if(i == (k3*10+k4)*(k1*10+k2))
                System.out.println(i + " = " + (k3*10+k4)+"*"+(k1*10+k2));
            if(i == (k3*10+k4)*(k2*10+k1))
                System.out.println(i + " = " + (k3*10+k4)+"*"+(k2*10+k1));
            if(i == (k4*10+k1)*(k2*10+k3))
                System.out.println(i + " = " + (k4*10+k1)+"*"+(k2*10+k3));
            if(i == (k4*10+k1)*(k3*10+k2))
                System.out.println(i + " = " + (k4*10+k1)+"*"+(k3*10+k2));
            if(i == (k4*10+k3)*(k1*10+k2))
                System.out.println(i + " = " + (k4*10+k3)+"*"+(k1*10+k2));
            if(i == (k4*10+k3)*(k2*10+k1))
                System.out.println(i + " = " + (k4*10+k3)+"*"+(k2*10+k1));
            if(i == (k4*10+k2)*(k3*10+k1))
                System.out.println(i + " = " + (k4*10+k2)+"*"+(k3*10+k1));
            if(i == (k4*10+k2)*(k1*10+k3))
                System.out.println(i + " = " + (k4*10+k2)+"*"+(k1*10+k3));
        }
    }
}
