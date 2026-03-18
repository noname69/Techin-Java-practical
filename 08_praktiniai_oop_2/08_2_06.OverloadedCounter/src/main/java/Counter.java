public class Counter {
    private int currentValue;

    public Counter() {
        this.currentValue = 0;
    }

    public Counter(int startValue) {
        this.currentValue = startValue;
    }

    public int value() {
        return currentValue;
    }

    public void increase() {
        currentValue += 1;
    }

    public void increase(int increaseBy) {
        if(increaseBy >= 0) currentValue += increaseBy;
    }

    public void decrease() {
        currentValue -= 1;
    }

    public void decrease(int decreaseBy) {
        if(decreaseBy >= 0) currentValue -= decreaseBy;
    }
}
