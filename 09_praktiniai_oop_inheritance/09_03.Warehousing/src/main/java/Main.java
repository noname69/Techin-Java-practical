

public class Main {

    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 10, 5);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());

        juice.addToWarehouse(1.0);
        System.out.println(juice);

        System.out.println(juice.history());
    }

}
