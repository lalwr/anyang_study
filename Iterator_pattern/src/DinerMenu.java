
/**
 * Created by mac on 15. 10. 4..
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("스테이크" ,5.99);
    }

    public void addItem(String name, double price){
        MenuItem menuItem = new MenuItem(name , price);
        if (numberOfItems >= MAX_ITEMS){
            System.out.println("메뉴꽊참");
        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
