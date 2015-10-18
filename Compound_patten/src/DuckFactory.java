/**
 * Created by Administrator on 2015-10-18.
 */
public class DuckFactory extends AbstractDuckFactory{

    public Quackable createMallardDuck(){
        return new MallardDuck();
    }

      public Quackable createDuckCall(){
        return new DuckCall();
    }

    public Quackable createRubberDuck(){
        return new RubberDuck();
    }

    @Override
    public Quackable createReadheadDuck() {
        return new ReadheadDuck();
    }
}
