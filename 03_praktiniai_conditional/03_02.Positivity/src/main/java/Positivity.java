
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;

        System.out.println("Give a number:");
        number = Integer.parseInt(scan.nextLine());

        if(number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is not positive");
        }

        scan.close();
    }
}
