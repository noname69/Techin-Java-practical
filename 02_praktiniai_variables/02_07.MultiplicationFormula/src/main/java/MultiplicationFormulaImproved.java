
import java.util.Scanner;

public class MultiplicationFormulaImproved {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int numbersMultiply = 1;

        String[] steps = {"first", "second", "third", "fourth"};
        StringBuilder answer = new StringBuilder();

        while (i < steps.length) {
            System.out.println("Give the " + steps[i] + " number:");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                numbersMultiply *= number;
                answer.append(number);
                if (i < steps.length - 1) {
                    answer.append(" * ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Wrong number. Will ignore it");
            }
            i++;
        }
        answer.append(" = ").append(numbersMultiply);

        System.out.println(answer);
    }
}