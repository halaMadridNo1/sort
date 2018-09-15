package SingletonPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class Singleton4 {
    private static class SingletonHolder{
        private static final Singleton4 INSTANCE = new Singleton4();

    }
    private Singleton4(){}
    public static final Singleton4 getSingleton4(){
        return SingletonHolder.INSTANCE;
    }
}
