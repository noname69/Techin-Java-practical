import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String input = scanner.nextLine();

        int number = Integer.parseInt(input);

        System.out.println("You gave the number " + number);

        scanner.close();
    }
}