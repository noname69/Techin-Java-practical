package lt.techin.practice.users;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<String> hobbies1 = new ArrayList<>();
        hobbies1.add("football");
        hobbies1.add("chess");
        hobbies1.add("paintball");

        User u1 = new User("Jonas", 20, true, hobbies1);
        User u2 = new User("Juozas", 25);
        User u3 = new User("Bronius", 27);

        List<User> ul = new ArrayList<>();
        ul.add(u1);
        ul.add(u2);
        ul.add(u3);

        System.out.println(UserTasks.countUsersOlderThan25(ul));
        System.out.println(UserTasks.getAverageAge(ul));

        System.out.println(UserTasks.countUsersWithTheHobby(ul, "soccer"));
    }
}
