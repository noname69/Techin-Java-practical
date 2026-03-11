
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstWord, secondWord;

        System.out.println("Enter the first string:");
        firstWord = scan.nextLine();
        System.out.println("Enter the second string:");
        secondWord = scan.nextLine();

        if(firstWord.equals(secondWord)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        scan.close();
    }
}
