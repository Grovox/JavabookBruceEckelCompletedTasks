interface WritingAccessories {
    void write();
}

interface pencil extends WritingAccessories{
    void paint();
    @Override
    void write();
}

interface pen extends WritingAccessories{
    @Override
    void write();
}

interface SchoolFees extends pencil,pen{
    @Override
    void paint();
    @Override
    void write();
}
public class Thirteen {

}
