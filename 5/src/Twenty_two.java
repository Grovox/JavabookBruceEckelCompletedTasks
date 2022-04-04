public class Twenty_two {
    money Money;
    public Twenty_two(money Money) {this.Money = Money;}
    public void describe(){
        System.out.print("Валюта: ");
        switch (Money) {
            case CNY: System.out.println("Юань"); break;
            case EUR: System.out.println("Евро"); break;
            case GBP: System.out.println("Фунт Стерлингов"); break;
            case JPY: System.out.println("Иена"); break;
            case RUR: System.out.println("Рубль"); break;
            case USD: System.out.println("Доллар"); break;
            default: System.out.println("Денег нет");
        }
    }

    public static void main(String[] args) {
        Twenty_two lol = new Twenty_two(money.USD);
        Twenty_two lol1 = new Twenty_two(money.JPY);
        Twenty_two lol2 = new Twenty_two(money.CNY);
        lol.describe();
        lol1.describe();
        lol2.describe();
    }
}
