import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageFacility {

    Map<String, ArrayList<String>> units;

    public StorageFacility() {
        this.units = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!units.containsKey(unit)) {
            units.put(unit, new ArrayList<>());
        }
        units.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return units.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (units.containsKey(storageUnit)) {
            units.get(storageUnit).remove(item);

            if (units.get(storageUnit).isEmpty()) {
                units.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(units.keySet());
    }
}
