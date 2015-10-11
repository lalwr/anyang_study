
import java.util.ArrayList;


/**
 * Created by mac on 15. 10. 4..
 */
public class PancakeHouseMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("사과케이크", 2.99);
    }



    public void addItem(String name, double price) {
        MenuItem menuItem = new MenuItem(name, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

}