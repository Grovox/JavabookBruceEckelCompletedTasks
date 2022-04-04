package Test_six;

class work_priv {
    class priv {
        private void prt_priv(){
            System.out.println("Рууух");
        }
    }
    priv a = new priv();
    void print(){
        a.prt_priv();
    }
}
