package AbstractFactoryPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
