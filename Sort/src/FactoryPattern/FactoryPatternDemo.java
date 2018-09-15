package FactoryPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape cricle = shapeFactory.getShape("CIRCLE");
        cricle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
