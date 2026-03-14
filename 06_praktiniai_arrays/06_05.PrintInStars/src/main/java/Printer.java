
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {

        // 1 variantas
//        for (int j: array) {
//            for(int i = 0; i < j; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 2 variantas
        for (int j : array) {
            System.out.println("*".repeat(j));
        }


    }

}
