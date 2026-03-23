import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if(maxWeight >= suitcase.totalWeight()) {
            maxWeight -= suitcase.totalWeight();
            suitcases.add(suitcase);
        }
    }

    public void printItems() {
        for(Suitcase suitcase: suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        int totalWeight = 0;
        for(Suitcase suitcase: suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return suitcases.size() + " suitcases ("+ totalWeight +" kg)";
    }
}
