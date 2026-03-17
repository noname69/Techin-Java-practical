
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.sum = 0;
        this.count = 0;
    }

    public void addNumber(int number) {
        sum += number;
        count += 1;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (count > 0) {
            return (double) sum / count;
        }

        return 0.0;
    }
}
