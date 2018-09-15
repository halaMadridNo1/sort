package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${User} on 2018/9/15
 */
public class Subject {

    private List<Observer> list = new ArrayList<Observer>();
    private int state;
     public int getState(){
         return state;
     }
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    public void attach(Observer observer){
        list.add(observer);
    }
    public void notifyAllObservers(){
        for (Observer observer : list) {
            observer.update();
        }
    }

}
