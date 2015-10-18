import java.util.*;

/**
 * Created by Administrator on 2015-10-18.
 */
public class QuackCounter implements Quackable{
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuack(){
        return numberOfQuacks;
    }



    @Override
    public void quack() {

    }


    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
