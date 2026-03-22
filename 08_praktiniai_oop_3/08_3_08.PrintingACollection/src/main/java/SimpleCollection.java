
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (elements.isEmpty())
            return "The collection " + name + " is empty.";

        String numName = "elements";

        if(elements.size() == 1) {
            numName = "element";
        }

        StringBuilder line = new StringBuilder("The collection " + name + " has " + elements.size() + " " +  numName + ":\n");

        for (int i = 0; i < elements.size(); i++) {
            line.append(elements.get(i));

            if (i < elements.size() - 1) {
                line.append("\n");
            }
        }

        return line.toString();
    }
}
