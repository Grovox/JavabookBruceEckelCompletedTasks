//: typeinfo/Shapes.java
import java.util.*;

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();

    void rotate(){
        if(this instanceof Circle){
            this.draw();
        }
    }
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape {
    public String toString() { return "Rhomboid"; }
}

public class Three_Four_Five {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(
                new Circle(), new Square(), new Triangle(), new Rhomboid()
        );

        for(Shape shape : shapeList) {
            shape.draw();
            shape.rotate();
            System.out.println();
        }
        try{
            if(shapeList.get(3)  instanceof Rhomboid){
                Rhomboid rhomboid = (Rhomboid) shapeList.get(3);
                rhomboid.draw();
            }else throw new Exception();
        }catch (Exception e){
            System.out.println("Преобразование не возможно");
            System.exit(1);
        }
        /*Circle circle = (Rhomboid) shapeList.get(3);*/ //нельзя преобразовать
    }
}
