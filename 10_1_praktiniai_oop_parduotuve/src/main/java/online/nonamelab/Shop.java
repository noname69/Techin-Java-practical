package online.nonamelab;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        while (true) {
            System.out.println("\nPasirinkite prekes tipa:");
            System.out.println("1 - Paprasta");
            System.out.println("2 - Vaistas");
            System.out.println("3 - Alkoholis");
            System.out.println("4 - Vynas");
            System.out.println("0 - Baigti ir parodyti visas prekes");

            int choice = readInt(sc);

            if (choice == 0) break;

            System.out.print("Iveskite pavadinima: ");
            String name = sc.nextLine();

            System.out.print("Iveskite kaina: ");
            BigDecimal price = readDouble(sc);

            Product product = null;

            switch (choice) {
                case 1:
                    product = new SimpleProduct(name, price);
                    break;

                case 2:
                    product = new Drugs(name, price);
                    break;

                case 3:
                    System.out.print("Litrazas: ");
                    BigDecimal liters = readDouble(sc);

                    System.out.print("Alkoholio %: ");
                    BigDecimal percent = readDouble(sc);

                    product = new Alcohol(name, price, liters, percent);
                    break;

                case 4:
                    System.out.print("Litrazas: ");
                    liters = readDouble(sc);

                    System.out.print("Alkoholio %: ");
                    percent = readDouble(sc);

                    product = new Wine(name, price, liters, percent);
                    break;

                default:
                    System.out.println("Neteisingas pasirinkimas!");
                    continue;
            }

            products.add(product);
        }

        System.out.println("\n--- VISOS PREKES ---");

        BigDecimal total = new BigDecimal(0);

        for (Product p : products) {
//            p.printPrice();
            total = total.add(p.calculatePrice());
            System.out.println(p);
        }

        System.out.printf("Bendra suma EUR: %.2f\n", total);
        System.out.printf("Bendra suma CHF: %.2f\n", Product.convertToCHF(total));
    }

    public static int readInt(Scanner sc) {
        while (true) {
            String input = sc.nextLine();

            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Iveskite skaiciu!");
            }
        }
    }

    public static BigDecimal readDouble(Scanner sc) {
        while (true) {

            String input = sc.nextLine();

            try {
                return new BigDecimal(input.trim());
            } catch (NumberFormatException e) {
                System.out.println("Iveskite skaiciu (pvz: 10.5)!");
            }
        }
    }
}