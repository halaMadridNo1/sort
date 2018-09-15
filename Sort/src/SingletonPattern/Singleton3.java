package SingletonPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class Singleton3 {
    private static volatile Singleton3 singleton3;
    private Singleton3(){}
    public static Singleton3 getSingleton3(){
        if (singleton3 ==null){
            synchronized (Singleton3.class){
                if (singleton3 == null){
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}
