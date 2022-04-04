class Glyph{

    void draw(){
        System.out.println("Glyph.draw()");
    }

    Glyph(){
        System.out.println("Перед вызовом Draw");
        draw();
        System.out.println("После вызова Draw");
    }

}

class RoundGlyph extends Glyph{

    private int radius = 1;

    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radios = " + radius);
    }

    void draw(){
        System.out.println("RoundGlyph.draw(), radios = " + radius);
    }

}

class RectangularGlyph extends Glyph{

    private int width = 3;

    RectangularGlyph(int r){
        width = r;
        System.out.println("RoundGlyph.RoundGlyph(), radios = " + width);
    }

    void draw(){
        System.out.println("RoundGlyph.draw(), radios = " + width);
    }

}

public class Sixteen {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(7);
    }
}
