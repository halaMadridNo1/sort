package AbstractFactoryPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
