import java.util.*;

/**
 * Created by Administrator on 2015-10-18.
 */
public class Observable implements QuackObservable{
    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck = duck;
    }

      @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(){
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer observer = (Observer)iterator.next();
            observer.update(duck);
        }
    }
}
