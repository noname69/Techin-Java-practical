
public class MainProgram {

    public static void main(String[] args) {
        Product typeMeasure = new Product("Type measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(typeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
