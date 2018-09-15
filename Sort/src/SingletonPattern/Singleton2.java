package SingletonPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2(){}
    public static synchronized Singleton2 getSingleton2(){
        if (singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
