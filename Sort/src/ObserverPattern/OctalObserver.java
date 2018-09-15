package ObserverPattern;

/**
 * Created by ${User} on 2018/9/16
 */
public class OctalObserver extends Observer {
    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
}
