/**
 * Created by mac on 15. 10. 4..
 */
public class MenuItem {
    private String name;
    private double Price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public MenuItem(String name, double price) {
        this.name = name;
        this.Price = price;
    }

    public MenuItem(){

    }

   
}
