
public class Main {

    public static void main(String[] args) {

        Box box = new Box(10);
        Box box2 = new Box(10);

        Box bigBox = new Box(20);

        box.add(new Book("aaa", "aaaaaa", 2));
        box.add(new Book("bbb", "bbbbbb", 1));
        box.add(new Book("ccc", "cccccc", 0.7));

        box.add(new CD("cd1", "cdx", 1973));
        box.add(new CD("cd2", "cdy", 1975));
        box.add(new CD("cd3", "cdz", 2012));

        box2.add(new CD("cd4", "cdz", 2012));

        bigBox.add(box);
        bigBox.add(box2);

        System.out.println(bigBox);
    }

}
