package lt.techin.praktinis;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        int minMark = getMin(arr);
        System.out.printf("Min mark: %d\n", minMark);

    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        return arr[0];
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        return arr[arr.length-1];
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        int min = getFirstElement(arr);
        for (int j : arr) {
            if(j < min) min = j;
        }
        return min;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        int max = getFirstElement(arr);
        for (int j : arr) {
            if(j > max) max = j;
        }
        return max;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        int sum = 0;
        for(int j: arr) {
            sum += j;
        }
        return sum;
    }

    //Raskite masyvo elementų vidurkį
    public static double getAverage(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        int biggerThanN = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > n) {
                biggerThanN++;
            }
        }
        return biggerThanN;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        for(int j : arr) {
            if(j==n) return true;
        }
        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        int lastIndex = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==n) lastIndex = i;
        }
        
        return lastIndex;
    }






}
