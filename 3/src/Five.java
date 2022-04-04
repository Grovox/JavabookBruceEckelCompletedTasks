public class Five {
    public static void main(String[] args) {
        int i = 0x15;
        int j = 0x2a;
        int k0,k1,k2,k3,k4,k5,k6,k7;
        int k;
        k=i;
        if(k>=0){
            k0 = 1;
        }else{
            k0 = 0;
            k*=-1;
        }
        k7=k%2;
        k/=2;
        k6=k%2;
        k/=2;
        k5=k%2;
        k/=2;
        k4=k%2;
        k/=2;
        k3=k%2;
        k/=2;
        k2=k%2;
        k/=2;
        k1=k%2;
        k/=2;
        System.out.println(k0+" "+k1+" "+k2+" "+k3+" "+k4+" "+k5+" "+k6+" "+k7);
        k=j;
        if(k>=0){
            k0 = 1;
        }else{
            k0 = 0;
            k*=-1;
        }
        k7=k%2;
        k/=2;
        k6=k%2;
        k/=2;
        k5=k%2;
        k/=2;
        k4=k%2;
        k/=2;
        k3=k%2;
        k/=2;
        k2=k%2;
        k/=2;
        k1=k%2;
        k/=2;
        System.out.println(k0+" "+k1+" "+k2+" "+k3+" "+k4+" "+k5+" "+k6+" "+k7);
        k=i|j;
        if(k>=0){
            k0 = 1;
        }else{
            k0 = 0;
            k*=-1;
        }
        k7=k%2;
        k/=2;
        k6=k%2;
        k/=2;
        k5=k%2;
        k/=2;
        k4=k%2;
        k/=2;
        k3=k%2;
        k/=2;
        k2=k%2;
        k/=2;
        k1=k%2;
        k/=2;
        System.out.println(k0+" "+k1+" "+k2+" "+k3+" "+k4+" "+k5+" "+k6+" "+k7);
        k=i^j;
        if(k>=0){
            k0 = 1;
    }else{
            k0 = 0;
            k*=-1;
        }
        k7=k%2;
        k/=2;
        k6=k%2;
        k/=2;
        k5=k%2;
        k/=2;
        k4=k%2;
        k/=2;
        k3=k%2;
        k/=2;
        k2=k%2;
        k/=2;
        k1=k%2;
        k/=2;
        System.out.println(k0+" "+k1+" "+k2+" "+k3+" "+k4+" "+k5+" "+k6+" "+k7);
        k=~i;
        if(k>=0){
            k0 = 1;
        }else{
            k0 = 0;
            k*=-1;
        }
        k7=k%2;
        k/=2;
        k6=k%2;
        k/=2;
        k5=k%2;
        k/=2;
        k4=k%2;
        k/=2;
        k3=k%2;
        k/=2;
        k2=k%2;
        k/=2;
        k1=k%2;
        k/=2;
        System.out.println(k0+" "+k1+" "+k2+" "+k3+" "+k4+" "+k5+" "+k6+" "+k7);
        k=~j;
        if(k>=0){
            k0 = 1;
        }else{
            k0 = 0;
            k*=-1;
        }
        k7=k%2;
        k/=2;
        k6=k%2;
        k/=2;
        k5=k%2;
        k/=2;
        k4=k%2;
        k/=2;
        k3=k%2;
        k/=2;
        k2=k%2;
        k/=2;
        k1=k%2;
        k/=2;
        System.out.println(k0+" "+k1+" "+k2+" "+k3+" "+k4+" "+k5+" "+k6+" "+k7);
    }
}
