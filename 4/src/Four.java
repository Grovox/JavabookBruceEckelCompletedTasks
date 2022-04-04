public class Four {
    public static void main(String[] args) {
        int k=0;
        for(int i=1;i<1000;i++){
            for(int j=1;j<=i;j++){
                if(i%j == 0){
                    k++;
                }
            }
            if(k<3){
                System.out.println(i);
            }
            k=0;
        }
    }
}
