
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int answer;
        int numberOne, numberTwo;

        System.out.println("Give the first number:");
        numberOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        numberTwo = Integer.parseInt(scanner.nextLine());

        answer = numberOne * numberTwo;

        System.out.println(numberOne + " * " + numberTwo + " = " + answer);
    }
}