
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber, secondNumber;

        System.out.println("Give the first number:");
        firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / " + secondNumber + " = " + ((double)firstNumber / secondNumber));
    }
}
