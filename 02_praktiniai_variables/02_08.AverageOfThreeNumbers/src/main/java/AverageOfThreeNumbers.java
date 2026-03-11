
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne, numberTwo, numberThree;
        double numbersAverage = 0;

        System.out.println("Give the first number:");
        numberOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        numberTwo = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number:");
        numberThree = Integer.parseInt(scanner.nextLine());

        numbersAverage = (double)(numberOne + numberTwo + numberThree) / 3;

        System.out.println("The average is " + numbersAverage);

        scanner.close();
    }
}
