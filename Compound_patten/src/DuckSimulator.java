/**
 * Created by Administrator on 2015-10-18.
 */
public class DuckSimulator{
    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory){

        Quackable redheadDuck= duckFactory.createReadheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator : With Composite-Flocks");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        System.out.println("\nDuck Simulator : With Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("\nDuck Simulator : Whole Flock Simulator");
        simulate(flockOfDucks);

        System.out.println("The ducks quacked "+QuackCounter.getQuack()
                + " times");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
