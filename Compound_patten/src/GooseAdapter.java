import java.util.*;

/**
 * Created by Administrator on 2015-10-18.
 */
public class GooseAdapter implements Quackable{
    Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    public void quack(){
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
