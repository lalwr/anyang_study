/**
 * Created by admin on 2015-10-16.
 */
public class TicoFactory implements CarFactory {
    @Override
    public Car makeCar() throws Exception {
        return  new Car("tico", "1000원");
    }
}
