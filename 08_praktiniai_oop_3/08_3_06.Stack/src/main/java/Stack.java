
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Stack {
    private ArrayList<String> stackList;

    public Stack() {
        this.stackList = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public void add(String value) {
        stackList.add(value);
    }

    public ArrayList<String> values() {
        return new ArrayList<>(stackList);
    }

    public String take() {
        if(isEmpty()) {
            return null;
        }
        String last = stackList.get(stackList.size() - 1);
        stackList.remove(stackList.size() - 1);
        return last;
    }
}
