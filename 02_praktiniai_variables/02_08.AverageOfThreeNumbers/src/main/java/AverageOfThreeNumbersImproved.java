
import java.util.Scanner;

public class AverageOfThreeNumbersImproved {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] steps = {"first", "second", "third", "fourth", "fifth", "sixth" };
        int i = 0;
        int numbersSum = 0;
        int validCount = 0;

        while(i < steps.length) {
            System.out.println("Give the " + steps[i] + " number:");
            try {
                numbersSum = numbersSum + Integer.parseInt(scanner.nextLine());
                validCount++;
            } catch(NumberFormatException e) {
                System.out.println("Wrong number. Will ignore it");
            }
            i++;
        }

        if(validCount > 0) {
            double average = (double) numbersSum / validCount;
            System.out.println("The average is " + average);
        } else {
            System.out.println("No valid numbers were entered");
        }



    }
}
