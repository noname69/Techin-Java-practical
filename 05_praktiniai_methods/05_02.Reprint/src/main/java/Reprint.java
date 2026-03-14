
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hom many times?");

        int times = Integer.parseInt(scanner.nextLine());
        for (int t = 0; t < times; t++) {
            printText();
        }
    }

    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {

        System.out.println("In a hole in the ground there lived a method");

    }
}
