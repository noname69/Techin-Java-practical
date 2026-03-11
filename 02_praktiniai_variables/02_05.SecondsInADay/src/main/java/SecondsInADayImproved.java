
import java.util.Scanner;

public class SecondsInADayImproved {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = 0;
        try {
            days = Integer.parseInt(scanner.nextLine());
            if(days <= 0) {
                System.out.println("Can not be 0 or negative days");
                return;
            }
        } catch(NumberFormatException e) {
            System.out.println("Not valid number.");
            return;
        }

        long seconds = (long) days * 24 * 60 * 60;

        System.out.println(seconds);

    }
}
