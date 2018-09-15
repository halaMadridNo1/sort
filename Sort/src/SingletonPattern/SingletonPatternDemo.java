package SingletonPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        //获取唯一可用对象
        Singleton instance = Singleton.getInstance();
        instance.showMessage();
    }

}
