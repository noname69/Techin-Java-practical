
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        final int LIMIT = 0;
        final int BASE_TAX = 1;
        final int RATE = 2;

        Scanner scan = new Scanner(System.in);

        int[][] taxTable = {{5000, 100, 8}, {25000, 1700, 10}, {55000, 4700, 12}, {200000, 22100, 15}, {1000000, 142100, 17}};
        int minGift = 0, taxLowerLimit = 0, taxRate = 0;
        double tax;

        System.out.println("Value of the gift?");
        int gift = Integer.parseInt(scan.nextLine());

        for (int i = taxTable.length - 1; i >= 0; i--) {
            if (gift > taxTable[i][LIMIT]) {
                minGift = taxTable[i][LIMIT];
                taxLowerLimit = taxTable[i][BASE_TAX];
                taxRate = taxTable[i][RATE];
                break;
            }
        }

        tax = (taxLowerLimit + ((gift - minGift) * (taxRate / 100.0)));

        if (gift < 5000) {
            System.out.println("No tax!");
        } else {
            System.out.println(tax);
        }
    }
}
