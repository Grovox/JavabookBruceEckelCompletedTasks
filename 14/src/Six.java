import java.util.*;

abstract class Shape_One {
    Boolean flag = false;
    void draw() { System.out.println(this.getClass().getName() + ".draw()"); }
    abstract public String toString();

    void setFlag(){
        if(flag != true){
            flag = true;
        }else flag = false;
    }
}

class Circle_One extends Shape_One {
    public String toString() { return "flag -> " + flag; }
}

class Square_One extends Shape_One {
    public String toString() { return "flag -> " + flag; }
}

class Triangle_One extends Shape_One {
    public String toString() { return "flag -> " + flag; }
}

public class Six {
    public static void main(String[] args) {
        List<Shape_One> shapeList = Arrays.asList(
                new Circle_One(), new Square_One(), new Triangle_One()
        );
        for (Shape_One shape : shapeList) {
            shape.draw();
            System.out.println(shape.toString());
        }
        System.out.println();
        shapeList.get(0).setFlag();
        shapeList.get(1).setFlag();
        shapeList.get(2).setFlag();
        shapeList.get(2).setFlag();
        for (Shape_One shape : shapeList) {
            shape.draw();
            System.out.println(shape.toString());
        }
    }
}
