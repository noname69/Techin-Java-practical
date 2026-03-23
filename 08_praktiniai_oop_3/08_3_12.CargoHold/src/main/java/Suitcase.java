import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (maxWeight >= item.getWeight()) {
            maxWeight -= item.getWeight();
            items.add(item);
        }

    }

    public void printItems() {
        StringBuilder result = new StringBuilder();
        for(Item item: items) {
//            result.append(item.getName()).append(" (").append(item.getWeight()).append(")");
            System.out.println(item.getName() + "(" + item.getWeight() + " kg)");
        }
//        result.append("Total Weight: ").append(totalWeight());
//        System.out.println(result);
        System.out.println("Total Weight: " + totalWeight() + " kg");
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if(items.isEmpty()) return null;

        Item heaviestItem = items.get(0);
        for(Item item: items) {
            if(item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        String itemName = "items";
        if (items.isEmpty()) {
            itemName = "no items (0 kg)";
        } else if (items.size() == 1) {
            itemName = "item";
        }




        return items.isEmpty() ? itemName : items.size() + " " + itemName + " (" + totalWeight() + " kg)";
    }
}
