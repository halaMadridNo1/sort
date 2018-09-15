package SingletonPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class Singleton {
    //创建Singleton的一个对象
    private static Singleton instance = new Singleton();
    //私有化构造函数,保证不会被实列化
    private Singleton(){

    }
    //获取唯一可用对象
    public static Singleton getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("hello world");
    }
}
