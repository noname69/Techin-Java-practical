
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int star = 0; star < number; star++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        for (int star = 0; star < number; star++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int star = 1; star <= size; star++) {
            printSpaces(size-star);
            printStars(star);
        }
    }

    public static void christmasTree(int height) {
        int i = 0;
        for (int tree = 1; tree <= height; tree++) {
            printSpaces(height - tree );
            printStars(tree+(i++));
//           printSpaces(Integer.parseInt(String.valueOf(height / 2)));
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
