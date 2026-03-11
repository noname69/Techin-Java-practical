
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String input = scanner.nextLine();

        double number = Double.parseDouble(input);

        System.out.println("You gave the number " + number);

        scanner.close();
    }
}
