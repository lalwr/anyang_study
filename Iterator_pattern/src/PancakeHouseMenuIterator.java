import java.util.ArrayList;

/**
 * Created by mac on 15. 10. 4..
 */
public class PancakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items){
        this.items = items;
    }

    public Object next(){
        MenuItem menuItem = items.get(position);
        position = position +1;
        return menuItem;
    }

    public boolean hasNext(){
        if(position >= items.size() || items.get(position) == null){
            return false;
        }else {
            return true;
        }
    }
}
