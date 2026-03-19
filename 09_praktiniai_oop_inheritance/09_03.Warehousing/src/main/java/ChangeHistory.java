import java.util.ArrayList;
import java.util.Collection;

public class ChangeHistory {
    private final ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        double max = history.getFirst();

        for (double num : history) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public double minValue() {
        double min = history.getFirst();

        for (double num : history) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public double average() {
        double sum = 0;
        for (double num : history) {
            sum += num;
        }
        return sum / history.size();
    }

    @Override
    public String toString() {
        return "" + history;
    }
}
