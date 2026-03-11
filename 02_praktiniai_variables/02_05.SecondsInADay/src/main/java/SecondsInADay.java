
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days;
        long seconds;

        System.out.println("How many days would you like to convert to seconds?");

        days = Integer.parseInt(scanner.nextLine());
        seconds = (long) days * 24 * 60 * 60;

        System.out.println(seconds);

        scanner.close();
    }
}
