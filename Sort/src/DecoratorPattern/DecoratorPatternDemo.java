package DecoratorPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape  circle = new Circle();
        Shape  decorator = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        decorator.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }
}
