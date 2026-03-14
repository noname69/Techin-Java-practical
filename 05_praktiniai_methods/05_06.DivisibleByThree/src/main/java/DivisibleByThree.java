
import java.util.Scanner;

public class DivisibleByThree {

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int number = beginning; number <= end; number++ ) {
            if(number % 3 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        divisibleByThreeInRange(start, end);
    }

}
