package lt.techin.praktinis;

import java.util.Arrays;

public class ArraysTask2D {

    private static void checkArray(int[][] arr) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
    }

    /**
     * Returns the maximum value in the 2D array arr.
     *
     * @param arr The 2D array to be processed.
     * @return The maximum value in the array.
     */
    public static int max(int[][] arr) {

        checkArray(arr);

        int max = arr[0][0];

        for (int[] row : arr) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    /**
     * Returns the sum of the elements in Row x of arr.
     *
     * @param arr The 2D array to be processed.
     * @param x   The row index.
     * @return The sum of elements in the specified row.
     */
    public static int rowSum(int[][] arr, int x) {

        checkArray(arr);

        int rowSum = 0;
        int currentRow = 0;

        for (int[] row : arr) {
            if (currentRow == x) {
                for (int element : row) {
                    rowSum += element;
                }
            }
            currentRow++;
        }
        return rowSum;
    }

    /**
     * Returns the sum of the elements in Column x of arr.
     *
     * @param arr The 2D array to be processed.
     * @param x   The column index.
     * @return The sum of elements in the specified column.
     */
    public static int columnSum(int[][] arr, int x) {

        checkArray(arr);

        int colSum = 0;

        for (int[] row : arr) {
            colSum += row[x];
        }
        return colSum;
    }

    /**
     * Calculates the row sum for every row in arr and returns each of the values in an array.
     *
     * @param arr The 2D array to be processed.
     * @return An array containing the sum of elements in each row.
     */
    public static int[] allRowSums(int[][] arr) {

        checkArray(arr);

        int[] rowsSum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rowsSum[i] = rowSum(arr, i);
        }

        return rowsSum;
    }

    /**
     * Calculates the column sum for every column in arr and returns each of the values in an array.
     *
     * @param arr The 2D array to be processed.
     * @return An array containing the sum of elements in each column.
     */
    public static int[] allColumnSums(int[][] arr) {

        checkArray(arr);

        int[] columnsSum = new int[arr[0].length];

        for (int i = 0; i < arr[0].length; i++) {
            columnsSum[i] = columnSum(arr, i);
        }

        return columnsSum;
    }

    /**
     * Calculates the diagonal sum in arr and returns each of the values in an array.
     *
     * @param arr The 2D array to be processed.
     * @return An array containing the sum of elements in each diagonal.
     */
    public static int[] allDiagonalSums(int[][] arr) {

        checkArray(arr);

        int n = arr.length;
        int diagonalLeftRightSum = 0;
        int diagonalRightLeftSum = 0;

        for (int i = 0; i < n; i++) {
            diagonalLeftRightSum += arr[i][i];
            diagonalRightLeftSum += arr[i][n - 1 - i];
        }

        return new int[]{diagonalLeftRightSum, diagonalRightLeftSum};
    }

    /**
     * Checks if the array arr is row-magic, which means that every row has the same row sum.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is row-magic, false otherwise.
     */
    public static boolean isRowMagic(int[][] arr) {

        checkArray(arr);

        int[] rowsSum = new int[arr.length];
        rowsSum = allRowSums(arr);

        int tmpElement = rowsSum[0];

        for (int element : rowsSum) {
            if(element != tmpElement) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the array arr is column-magic, which means that every column has the same column sum.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is column-magic, false otherwise.
     */
    public static boolean isColumnMagic(int[][] arr) {

        checkArray(arr);

        int[] columnsSum;
        columnsSum = allColumnSums(arr);

        int tmpElement = columnsSum[0];

        for (int element : columnsSum) {
            if (element != tmpElement) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if the array arr is square, i.e., every row has the same length as arr itself.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is square, false otherwise.
     */
    public static boolean isSquare(int[][] arr) {

        checkArray(arr);

        int rows = arr.length;

        for (int[] row : arr) {

            if (row.length != rows) {
                return false;
            }
        }
        return true;
    }



    /**
     * Checks if the array arr is a magic square, meaning it is square, and all row sums, column sums,
     * and the two diagonal-sums are equal.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a magic square, false otherwise.
     */
    public static boolean isMagic(int[][] arr) {

        checkArray(arr);

        if(!isSquare(arr)) return false;

        int[] rowsSum = allRowSums(arr);
        int[] colsSum = allColumnSums(arr);
        int[] diagonalSum = allDiagonalSums(arr);

        int elementToCheck = rowsSum[0];

        System.out.println(Arrays.toString(rowsSum));
        System.out.println(Arrays.toString(colsSum));
        System.out.println(Arrays.toString(diagonalSum));

        for(int element : rowsSum) {
            if(element != elementToCheck) return false;
        }

        for(int element : colsSum) {
            if(element != elementToCheck) return false;
        }

        for(int element : diagonalSum) {
            if(element != elementToCheck) return false;
        }

        return true;
    }

    public static boolean checkRow(int[][] arr, int row) {
        boolean[] checkedRow = new boolean[arr.length + 1];

        for(int j = 0; j < arr.length; j++) {
            int element = arr[row][j];

            if(element < 1 || element > arr.length || checkedRow[element]) {
                return false;
            }

            checkedRow[element] = true;
        }
        return true;
    }

    public static boolean checkColumn(int[][] arr, int col) {
        boolean[] checkedCol = new boolean[arr.length + 1];

        for(int i = 0; i < arr.length; i++) {
            int element = arr[i][col];

            if(element < 1 || element > arr.length || checkedCol[element]) {
                return false;
            }

            checkedCol[element] = true;
        }
        return true;
    }

    /**
     * Checks to see if the array arr is a Latin square, meaning it must be square, and each row and each column
     * must contain the values 1, 2, ..., n with no repeats.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a Latin square, false otherwise.
     */
    public static boolean isLatin(int[][] arr) {

        checkArray(arr);

        if(!isSquare(arr)) return false;

        for(int i = 0; i < arr.length; i++) {
            if(!checkRow(arr, i)) return false;
            if(!checkColumn(arr, i)) return false;
        }
        return true;
    }

    /**
     * Checks to see if the array arr is square and contains each of the digits from 1 to n*n, e.g., 1, 2, ..., 16 for a 4 x 4 array.
     *
     * @param arr The 2D array to be processed.
     * @return True if the array is a sequence, false otherwise.
     */
    public static boolean isSequence(int[][] arr) {

        checkArray(arr);

        if(!isSquare(arr)) return false;

        int n = arr.length;

        boolean[] checkedMatrix = new boolean[n * n + 1];

        for (int[] ints : arr) {
            for (int j = 0; j < n; j++) {
                int element = ints[j];

                if (element < 1 || element > n * n || checkedMatrix[element]) {
                    return false;
                }

                checkedMatrix[element] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 10}, {4, 5, 6, 11}, {7, 8, 9, 12}, {13, 14, 15, 16}};
        System.out.println(isSequence(arr));
    }


}
