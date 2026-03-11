
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOne, numberTwo;

        System.out.println("Give the first number:");
        numberOne = Integer.parseInt(scan.nextLine());
        System.out.println("Give the second number:");
        numberTwo = Integer.parseInt(scan.nextLine());

        if(numberOne > numberTwo) {
            System.out.println("Greater number is: " + numberOne);
        } else if (numberOne < numberTwo) {
            System.out.println("Greater number is: " + numberTwo);
        } else {
            System.out.println("The numbers are equal!");
        }

        scan.close();
    }
}
