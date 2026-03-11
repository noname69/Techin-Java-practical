import java.util.Scanner;

public class SumOfThreeNumbersImproved {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int numbersSum = 0;

        String[] steps = {"first", "second", "third", "fourth", "fifth" };

        while(i < steps.length) {
            System.out.println("Give the " + steps[i] + " number:");
            try {
                numbersSum = numbersSum + Integer.parseInt(scanner.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("Wrong number. Will ignore it");
            }
            i++;
        }

        System.out.println("The sum of the numbers is " + numbersSum);

    }
}