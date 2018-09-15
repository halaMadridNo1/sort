package SingletonPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 singleton1(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
