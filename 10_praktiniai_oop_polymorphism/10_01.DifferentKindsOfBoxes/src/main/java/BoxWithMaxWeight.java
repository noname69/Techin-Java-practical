import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
//    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        super.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(item.getWeight() <= capacity) {
            System.out.println("added");
            items.add(item);
            capacity -= item.getWeight();
        }
        else {
            System.out.println("not added");
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
