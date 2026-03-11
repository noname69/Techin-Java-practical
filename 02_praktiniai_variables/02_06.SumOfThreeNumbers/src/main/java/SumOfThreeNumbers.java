import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne, numberTwo, numberThree;
        int numbersSum = 0;

        System.out.println("Give the first number:");
        numberOne = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the second number:");
        numberTwo = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the third number:");
        numberThree = Integer.parseInt(scanner.nextLine());

        numbersSum = numberOne + numberTwo + numberThree;

        System.out.println("The sum of the numbers is " + numbersSum);

        scanner.close();
    }
}