import java.util.ArrayList;

public class Main {

    public static void printPersons(ArrayList<Person> people) {
        System.out.println(people);
    }

    public static void main(String[] args) {
        Student student = new Student("Ollie", "638 Hollywood Blvd. Los Angeles 90028");
        Teacher teacher = new Teacher("Ollie", "638 Hollywood Blvd. Los Angeles 90028", 5000);
        System.out.println(teacher);
    }

}
