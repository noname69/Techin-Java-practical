package lt.techin.praktinis;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int reversedNumber;
        int num1, num2, num3, num4;

        num1 = number / 1000;
        num2 = (number % 1000) / 100;
        num3 = (number % 100) / 10;
        num4 = number % 10;

        reversedNumber = num1 + num2 + num3 + num4;

        System.out.println(reversedNumber);
    }
}
