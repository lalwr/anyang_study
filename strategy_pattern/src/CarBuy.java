/**
 * Created by admin on 2015-10-16.
 */
public class CarBuy {
        public static void main(String[] args) throws Exception {
            CarMarket market = new CarMarket();
            Car roliCar = market.carDisplay(new TicoFactory());
            System.out.println("이름" + roliCar.getName() + "가격: " + roliCar.getPrice());
        }
}
