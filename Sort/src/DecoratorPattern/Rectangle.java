package DecoratorPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
