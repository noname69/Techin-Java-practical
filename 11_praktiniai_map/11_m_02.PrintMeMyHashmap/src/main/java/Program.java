
import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String, String> hashmap) {
        for(var m:hashmap.entrySet()) {
            System.out.println(m.getKey());
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for(var m:hashmap.entrySet()) {
            if(m.getKey().contains(text)) {
                System.out.println(m.getKey());
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for(var m:hashmap.entrySet()) {
            if(m.getKey().contains(text)) {
                System.out.println("ok");
                System.out.println(m.getValue());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();

        hashmap.put("e.g.", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e.", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
        System.out.println("---");
    }

}
