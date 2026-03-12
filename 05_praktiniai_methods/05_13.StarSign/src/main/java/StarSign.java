
public class StarSign {

    public static void main(String[] args) {


        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!

        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int star = 0; star < number; star++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size) {
        for (int star = 0; star < size; star++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int star = 0; star < height; star++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int star = 1; star <= size; star++) {
            printStars(star);
        }
    }
}
