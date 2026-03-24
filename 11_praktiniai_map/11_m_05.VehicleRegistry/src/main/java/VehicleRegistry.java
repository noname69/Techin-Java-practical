import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> licensePlates;

    public VehicleRegistry() {
        this.licensePlates = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (licensePlates.containsKey(licensePlate)) {
            return false;
        }
        licensePlates.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return licensePlates.get(licensePlate);

    }

    public boolean remove(LicensePlate licensePlate) {
        if (licensePlates.containsKey(licensePlate)) {
            licensePlates.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for(var plate: licensePlates.entrySet()) {
            System.out.println(plate.getKey());
        }
    }

    public void printOwners() {
        HashSet<String> printedOwners = new HashSet<>();

        for (String owner : licensePlates.values()) {
            if (!printedOwners.contains(owner)) {
                System.out.println(owner);
                printedOwners.add(owner);
            }
        }
    }
}
