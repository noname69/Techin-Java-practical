package lt.techin.praktinis;

public class NumberReverter {
    public void revert(int number) {
        int reversedNumber;
        int num1, num2, num3;

        num1 = number / 100;
        num2 = (number % 100) / 10;
        num3 = number % 10;

        reversedNumber = 100 * num3 + 10 * num2 + num1;
        
        System.out.println(reversedNumber);
    }
}
