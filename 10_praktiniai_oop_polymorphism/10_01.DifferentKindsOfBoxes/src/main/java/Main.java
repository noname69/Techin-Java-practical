

public class Main {

    public static void main(String[] args) {
        OneItemBox box = new OneItemBox();

        box.add(new Item("Saluko"));
        box.add(new Item("Pirkka"));


        System.out.println(box.isInBox(new Item("Saluko")));
        System.out.println(box.isInBox(new Item("Pirkka")));

    }
}
