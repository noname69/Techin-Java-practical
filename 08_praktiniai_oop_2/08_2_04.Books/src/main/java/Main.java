import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Publication year: ");
            int pubYear = Integer.parseInt(scanner.nextLine());


            books.add(new Book(title, pages, pubYear));
        }

        System.out.print("What information will be printed? ");
        String input = scanner.nextLine().trim().toLowerCase();


        for(Book book: books) {

            if (input.equals("everything")) {
                System.out.println(book.everything());
            } else if(input.equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
