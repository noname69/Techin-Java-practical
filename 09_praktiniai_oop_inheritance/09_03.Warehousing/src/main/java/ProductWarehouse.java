import java.util.ArrayList;

public class ProductWarehouse extends Warehouse {
    private String productName;
//    private ArrayList<Double>

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setName(String newName) {
        productName = newName;
    }

    @Override
    public String toString() {
        return  getName() + ": " + super.toString();
    }
}
