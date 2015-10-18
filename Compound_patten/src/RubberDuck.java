import java.util.*;

/**
 * Created by Administrator on 2015-10-18.
 */
public class RubberDuck implements Quackable{
    public void quack(){
        System.out.println("Quack");
    }


    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
