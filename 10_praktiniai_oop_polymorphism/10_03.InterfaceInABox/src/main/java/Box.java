import java.util.ArrayList;
import java.util.List;

public class Box implements Packable {
    private final double maxWeight;
    private final List<Packable> itemsInBox;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.itemsInBox = new ArrayList<>();
    }

    public void add(Packable item) {
        if((maxWeight - weight()) > item.weight()) {
            itemsInBox.add(item);
        }
    }

    public double weight() {
        double weight = 0;
        for(Packable item : itemsInBox) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + itemsInBox.size() + " items, total weight " + weight() + " kg";
    }
}
