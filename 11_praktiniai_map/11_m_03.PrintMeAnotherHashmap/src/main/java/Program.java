
import java.util.HashMap;

public class Program {

    public static void printValues(HashMap<String, Book> hashmap) {
        for(var m:hashmap.entrySet()) {
            System.out.println(m.getValue());
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for(var m:hashmap.entrySet()) {
            if(m.getValue().getName().contains(text)) {
                System.out.println(m.getValue());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "..."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

}
