import java.util.HashMap;
import java.util.Map;

public class IOU {

    private final HashMap<String, Double> owedMap;

    public IOU() {
        this.owedMap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        owedMap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return owedMap.getOrDefault(toWhom, 0.0);
    }
}
