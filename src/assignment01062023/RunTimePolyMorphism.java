package assignment01062023;

public class RunTimePolyMorphism {

    public static void main(String[] args){
        Shape shape;
        shape = new Square();
        shape.calculateArea();
        shape = new Triangle();
        shape.calculateArea();

    }
}
