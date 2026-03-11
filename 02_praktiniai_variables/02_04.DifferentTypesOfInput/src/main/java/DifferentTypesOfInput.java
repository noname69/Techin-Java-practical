
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String sentence = scan.nextLine();

        System.out.println("Give an integer:");
        int integerNumber = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double:");
        double floatingPointNumber = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean:");
        boolean logicalValue = Boolean.parseBoolean(scan.nextLine());

        System.out.println("You gave the string " + sentence);
        System.out.println("You gave the integer " + integerNumber);
        System.out.println("You gave the double " + floatingPointNumber);
        System.out.println("You gave the boolean " + logicalValue);

        scan.close();
    }
}
