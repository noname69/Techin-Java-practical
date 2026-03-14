

public class FromParameterToOne {

    public static void printFromNumberToOne(int number) {
        for(int n = number; n >= 1; n--) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }

}
