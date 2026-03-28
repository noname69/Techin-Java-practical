
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {



    public static void main(String[] args) {

        Map<String, String> users = new HashMap<>();

        users.put("alex", "sunshine");
        users.put("emma", "haskell");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String usename = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if(users.containsKey(usename)) {
            if (users.get(usename).equals(password)) {
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
        }


    }
}
