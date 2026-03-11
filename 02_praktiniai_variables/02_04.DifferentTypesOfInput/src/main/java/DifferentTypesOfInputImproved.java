
import java.util.Scanner;

public class DifferentTypesOfInputImproved {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean validInteger = false;
        boolean validDouble = false;
        boolean validBoolean = false;

        System.out.println("Give a string:");
        String sentence = scan.nextLine();

        System.out.println("Give an integer:");
        int integerNumber = 0;
        try {
            integerNumber = Integer.parseInt(scan.nextLine());
            validInteger = true;
        } catch (NumberFormatException e) {
            System.out.println("Not valid integer number");
        }

        System.out.println("Give a double:");
        double floatingPointNumber = 0;
        try {
            floatingPointNumber = Double.parseDouble(scan.nextLine());
            validDouble = true;
        } catch (NumberFormatException e) {
            System.out.println("Not valid floating point number");
        }

        System.out.println("Give a boolean:");
        boolean logicalValue = false;
        String input = scan.nextLine().trim().toLowerCase();
        if(input.equals("true")) {
            logicalValue = true;
            validBoolean = true;
        } else if(input.equals("false")) {
            validBoolean = true;
        } else {
            System.out.println("Not valid boolean value");
        }

        if (validInteger && validDouble && validBoolean) {
            System.out.println("You gave the string " + sentence);
            System.out.println("You gave the integer " + integerNumber);
            System.out.println("You gave the double " + floatingPointNumber);
            System.out.println("You gave the boolean " + logicalValue);
        } else {
            System.out.println("Something wet wrong. Check your inputs.");
        }

    }
}
