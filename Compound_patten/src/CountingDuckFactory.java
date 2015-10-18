/**
 * Created by Administrator on 2015-10-18.
 */
public class CountingDuckFactory extends AbstractDuckFactory{

    public Quackable createMallardDuck(){
        return new QuackCounter(new MallardDuck());
    }

     public Quackable createDuckCall(){
        return new QuackCounter(new DuckCall());
    }

    public Quackable createRubberDuck(){
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createReadheadDuck() {
        return new QuackCounter(new ReadheadDuck());
    }
}