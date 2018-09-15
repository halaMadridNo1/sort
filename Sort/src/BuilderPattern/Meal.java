package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${User} on 2018/9/16
 */
public class Meal {
    private List<Item> itmes = new ArrayList<Item>();
    public void addItem(Item item){
        itmes.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : itmes) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : itmes) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
