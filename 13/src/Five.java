import java.math.BigInteger;
import java.util.Formatter;

class Format{

}

public class Five {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);

        int v = 121;
        BigInteger w = new BigInteger("50000000000000");
        char u = 'a';
        String s = "qwerty";
        double x = 179.543;
        Five y = new Five();
        boolean z = false;

        f.format("d: % d\n", v); // печатает пробел перед положительным числом
        f.format("d: %+d\n", v); // добавляем + перед положительным числом
        f.format("d: %(d\n", -v); // помещает отрицательные числовые значения в круглые скобки
        System.out.println();

        f.format("d: %, d\n", w); // Разделяет число пробелами
        System.out.println();

        f.format("e: |%20.4f|\n", x); // выравнивает по правому краю
        f.format("e: |%-20.4f|\n", x); // выравнивает по левому краю
        System.out.println();

        f.format("Geeks %nFor %nGeeks%n"); // Переноси на новую строку
        System.out.println();

        f.format("10 %% 4 = 2\n"); // вставляет знак процент
        System.out.println();

        f.format("%X\n", 250); // переводит числов 16-рачную систему в верхнем регистре
        f.format("%x\n", 250); // переводит числов 16-рачную систему в нижнем регистре
        System.out.println();

        f.format("%e\n", 123.1234); // выводит число в научной нотации в нижнем регистре
        f.format("%E\n", 123.1234); // выводит число в научной нотации в вернем регистре
        System.out.println();

        f.format("%16.2e\n", 123.1234567); //формат точности
        f.format("%.4f\n", 123.1234567); //формат точности
        f.format("%.4g\n", 123.1234567); //формат точности
        f.format("%.15s\n", "12345678901234567890"); //формат точности
        f.format("%010d\n", 88); //формат точности
        System.out.println();


        System.out.println("u = 'a'");
        f.format("s: %s\n", u); //char как строка
        f.format("c: %c\n", u); //char как символ Юникода
        f.format("b: %b\n", u); //char как Логическое значение
        f.format("h: %h\n", u); //char как Хеш код
        System.out.println();


        System.out.println("v = 121");
        f.format("d: %d\n", v); //int как Целое число
        f.format("c: %c\n", v); //int как строка
        f.format("b: %b\n", v); //int как Логическое значение
        f.format("s: %s\n", v); //int как символ Юникода
        f.format("x: %x\n", v); //int как Целое число в 16-ричной системе
        f.format("h: %h\n", v); //int как Хеш код
        System.out.println();


        System.out.println("w = new BigInteger(\"50000000000000\")");
        f.format("d: %d\n", w); //BigInteger как Целое число
        f.format("b: %b\n", w); //BigInteger как Логическое значение
        f.format("s: %s\n", w); //BigInteger как символ Юникода
        f.format("x: %x\n", w); //BigInteger как Целое число в 16-ричной системе
        f.format("h: %h\n", w); //BigInteger как Хеш код
        System.out.println();


        System.out.println("x = 179.543");
        f.format("b: %b\n", x); //double как Логическое значение
        f.format("s: %s\n", x); //double как символ Юникода
        f.format("f: %f\n", x); //double как Вещественное число
        f.format("e: %e\n", x); //double как Вещественное число в экспоненциаьной записи
        f.format("h: %h\n", x); //double как Хеш код
        System.out.println();


        System.out.println("y = new Five()");
        f.format("b: %b\n", y); //Объект как Логическое значение
        f.format("s: %s\n", y); //Объект как символ Юникода
        f.format("h: %h\n", y); //Объект как Хеш код
        System.out.println();


        System.out.println("z = false");
        f.format("b: %b\n", z); //boolean как Логическое значение
        f.format("s: %s\n", z); //boolean как символ Юникода
        f.format("h: %h\n", z); //boolean как Хеш код

    }
}
