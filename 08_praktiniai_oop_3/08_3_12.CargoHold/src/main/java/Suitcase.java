import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (maxWeight > item.getWeight()) {
            maxWeight -= item.getWeight();
            items.add(item);
        }

    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for(Item item: items) {
            totalWeight += item.getWeight();
        }
        return items.size() + " items (" + totalWeight + " kg)";
    }
}
