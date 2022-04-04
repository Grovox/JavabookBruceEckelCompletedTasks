class this_{
    int i=0,j=0;
this_ use_this(){
    i++;
    return this;
}
void not_use_this(){
    j++;
}
void print_i (){
    System.out.println("i: "+i);
}
void print_j (){
    System.out.println("j: "+j);
}
}
public class Eight {
    public static void main(String[] args) {
        this_ a = new this_();
        a.use_this().use_this().use_this().print_i();
        a.not_use_this();
        a.not_use_this();
        a.not_use_this();
        a.print_j();
    }
}
