/**
 * Created by Administrator on 2015-10-18.
 */
public interface QuackObservable{

    public void registerObserver(Observer observer);
    public void notifyObservers();
}
