
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age;

        System.out.print("How old are you? ");
        age = Integer.parseInt(scan.nextLine());

        String answer = (age < 0 || age > 120) ? "Impossible!" : "OK";

        System.out.println(answer);
    }
}
