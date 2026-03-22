import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;
//    private int totalWeight;

    public Package() {
        this.gifts = new ArrayList<>();
//        this.totalWeight = 0;
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
//        totalWeight += gift.getWeight();
    }

    public int totalWeight() {
        int totalWeight = 0;
        for(Gift gift: gifts) {
            totalWeight += gift.getWeight();
        }

        return totalWeight;
    }
}
