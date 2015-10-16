/**
 * Created by admin on 2015-10-16.
 */
public class BMWFactory implements CarFactory{

    @Override
    public Car makeCar() throws Exception {
        return new Car("BMW", "50000원");
    }
}
