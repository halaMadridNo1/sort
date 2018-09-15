package ObserverPattern;

/**
 * Created by ${User} on 2018/9/15
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
