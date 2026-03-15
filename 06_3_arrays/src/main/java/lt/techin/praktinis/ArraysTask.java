package lt.techin.praktinis;

import java.util.Arrays;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {1,2,3,4,5};

        int[] arrWithRemovedElement = reverseArray(arr);
        System.out.println(Arrays.toString(arrWithRemovedElement));



    }

   // Parašykite metodą, kuris sukuria nustatyto dydžio sveikųjų skaičių masyvą
   // ir užpildo jį atsitiktinai sugeneruotais skaičiais iš nurodyto intervalo.
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = (int)(Math.random() * ((max - min) + 1)) + min;
        }
        return arr;
    }


    //Parašykite metodą, kuris pašalintų masyvo arr[n] k-tąjį elementą (su indeksu k),
    //surašant reikiamus elementus į naują masyvą b[n-1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] removeElementAndReturnNewArray(int[] arr, int k) {

        try {
            int[] b = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i == k) {
                    continue;
                }
                b[j++] = arr[i];
            }
            return b;
        } catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
            return null;
        }

    }

    //Parašykite metodą, kuris įterptų į masyvą arr[n] prieš k-tąjį elementą reikšmę x,
    //surašant reikiamus elementus į naują masyvą b[n+1]. Metodas grąžina naują masyvą.
    //Jei k yra už masyvo ribų, metodas grąžina null (teisingiau būtų mesti exception, bet dar nesimokėm)
    public static int[] insertElementAndReturnNewArray(int[] arr, int k, int x){
        if (arr.length == 0 || k >= arr.length) {
            return null;
        }
        try {
            int[] b = new int[arr.length + 1];
            for(int i=0,j=0; i<arr.length; i++, j++) {
                if(i == k) {
                    b[j++] = x;
                }
                b[j] = arr[i];
            }
            return b;

        } catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }

    //Parašykite metodą, kuris grąžintų duoto masyvo apverstą kopija.
    public static int[] reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];

        for(int i = arr.length-1, j=0; i >= 0; i--, j++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }

    //Parašykite metodą, kuris apverstu duotą masyvą (nekuriant naujo masyvo)
    public static void reverseInPlace(int[] arr) {
        int tmp;

        for(int i=0, j=arr.length - 1; i < j; i++, j--) {
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }











}
