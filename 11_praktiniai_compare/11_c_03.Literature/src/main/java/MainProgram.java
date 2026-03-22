
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainProgram {



    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.parseInt(scanner.nextLine());

            bookList.add(new Book(name, age));
        }

        System.out.println(bookList.size() + " books in total.");

        Collections.sort(bookList);

        for(Book book: bookList) {
            System.out.println(book);
        }
    }

}
