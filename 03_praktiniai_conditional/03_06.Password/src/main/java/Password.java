
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String passwd = "Caput Draconis";
        String password;

        System.out.println("Password?");
        password = scan.nextLine();

        if(password.equals(passwd)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

        scan.close();
    }
}
