public class AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColor;
    void ChangeTheHueOfTheColor(int newHue){
        switch (newHue){
            case 1: System.out.println(" \033[41m "); break;
            case 2: System.out.println(" \033[43m "); break;
            case 3: System.out.println(" \033[43m "); break;
            case 4: System.out.println(" \033[42m "); break;
            case 5: System.out.println(" \033[46m "); break;
            case 6: System.out.println(" \033[44m "); break;
            case 7: System.out.println(" \033[45m "); break;
        }
    }
}
