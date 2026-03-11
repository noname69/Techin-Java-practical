
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;

        System.out.println("Give a number:");
        number = Integer.parseInt(scan.nextLine());
        if(Math.abs(number) % 2 == 1) {
            System.out.println("Number " + number + " is odd");
        } else {
            System.out.println("Number " + number + " is even");
        }

        scan.close();
    }
}
