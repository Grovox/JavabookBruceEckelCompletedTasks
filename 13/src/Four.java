import java.util.*;

 class Receipt {
     private int[] column = {15,5,10};
    private double total = 0;
    private Formatter f = new Formatter(System.out);
    public void Column_width(int Column_one, int Column_two,int Column_three){
        column[0] = Column_one;
        column[1] = Column_two;
        column[2] = Column_three;
    }
    public void printTitle() {
        f.format("%-"+column[0]+"s %"+column[1]+"s %"+column[2]+"s\n", "Item", "Qty", "Price");
        f.format("%-"+column[0]+"s %"+column[1]+"s %"+column[2]+"s\n", "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {
        f.format("%-"+column[0]+"."+column[0]+"s %"+column[1]+"d %"+(0.2+(float)column[2])+"f\n", name, qty, price);
        total += price;
    }
    public void printTotal() {
        f.format("%-"+column[0]+"s %"+column[1]+"s %"+(0.2+(float)column[2])+"f\n", "Tax", "", total*0.06);
        f.format("%-"+column[0]+"s %"+column[1]+"s %"+column[2]+"s\n", "", "", "-----");
        f.format("%-"+column[0]+"s %"+column[1]+"s %"+(0.2+(float)column[2])+"f\n", "Total", "",
                total * 1.06);
    }
}

public class Four {
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
        receipt.Column_width(25,8,12);
        System.out.println();
        System.out.println();
        System.out.println();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
