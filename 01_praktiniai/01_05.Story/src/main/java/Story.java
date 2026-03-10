
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        String job;

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        name = scanner.nextLine().trim().toLowerCase();
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

        System.out.println("What is their job?");
        job = scanner.nextLine().trim();

        // if user forgot to write a prefix "a" or "an", depends on first letter of job title
        if(!job.startsWith("a ") && !job.startsWith("an ")) {
            char firstLetter = job.charAt(0);

            if("aeiou".indexOf(firstLetter) >= 0) {
                job = "an " + job;
            } else {
                job = "a " + job;
            }
        }

        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + name + ", who was " + job + ".");
        System.out.println("On the way to work, " + name + " reflected on life.");
        System.out.println("Perhaps " + name + " will not be " + job + " forever.");

    }
}
