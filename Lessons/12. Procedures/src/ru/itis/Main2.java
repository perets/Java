package ru.itis;

/**
 * 14.10.2017
 * Main2
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main2 {

    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void swapIntegers(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        swap(a, 2, 3);
        System.out.println(a[2] + " " + a[3]);

        int m = 10;
        int n = 5;
        swapIntegers(m, n);
        System.out.println(m + " " + n);
    }
}
